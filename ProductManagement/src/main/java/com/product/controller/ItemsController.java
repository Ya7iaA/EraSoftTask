package com.product.controller;

import com.product.model.Items;
import com.product.service.ItemService;
import com.product.service.ItemServiceImpl;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

@WebServlet("/ItemController")
public class ItemsController extends HttpServlet {

    @Resource(name="jdbc/MyDB")
    DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "list":
                listItem(req,resp);
                resp.getWriter().write("Listing items...");
                break;
            case "add":
                addItem(req,resp);
                resp.getWriter().write("Adding an item...");
                break;
            case "delete":
                removeItem(req,resp);
                resp.getWriter().write("Deleting an item...");
                break;
            case "update":
                editItem(req,resp);
                resp.getWriter().write("Updating an item...");
                break;
            default:
                action = "list";
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void editItem(HttpServletRequest req, HttpServletResponse resp) {
        // Get Item Data From Request
        long id = Long.parseLong(req.getParameter("id"));
        String name = req.getParameter("itemName");
        double price = Double.parseDouble(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        // Update Item
        Items item = new Items(id, name, price, quantity);
        // Edit Item
        ItemService itemService = new ItemServiceImpl(dataSource);
        itemService.editItem(item);
    }

    private void removeItem(HttpServletRequest req, HttpServletResponse resp) {
        // Get Item Data From Request
        long id = Long.parseLong(req.getParameter("id"));
        // Remove Item
        ItemService itemService = new ItemServiceImpl(dataSource);
        itemService.removeItem(id);
    }

    private void addItem(HttpServletRequest req, HttpServletResponse resp) {
        // Get Item Data From Request
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        // Create Item After Get Data
        Items items = new Items(name, price, quantity);
        // Add Item
        ItemService itemService = new ItemServiceImpl(dataSource);
        itemService.addItem(items);
    }

    private void listItem(HttpServletRequest req, HttpServletResponse resp) {
        // View Items
        ItemService itemService = new ItemServiceImpl(dataSource);
        List<Items> itemsList = itemService.listItems();
    }
}
