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

@WebServlet("/ItemsController")
public class ItemsController extends HttpServlet {

    @Resource(name = "jdbc/MyDB")
    DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "list":
                listItem(req, resp);
                break;
            case "addForm":
                addForm(req, resp);
                resp.sendRedirect("ItemsController?action=list");
                break;
            case "add":
                addItem(req, resp);
                resp.sendRedirect("ItemsController?action=list");
                break;
            case "delete":
                removeItem(req, resp);
                resp.sendRedirect("ItemsController?action=list");
                break;
            case "editForm":
                editForm(req, resp);
                break;
            case "edit":
                editItem(req, resp);
                resp.sendRedirect("ItemsController?action=list");
                break;
            default:
                action = "list";
                break;
        }
    }

    private void editForm(HttpServletRequest req, HttpServletResponse resp) {
        // Forward To JSP Page
        try {
            req.getRequestDispatcher("EditItem.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            System.out.println("Forward Exception: " + e.getMessage());
        }
    }

    private void addForm(HttpServletRequest req, HttpServletResponse resp) {
        // Forward To JSP Page
        try {
            req.getRequestDispatcher("AddItem.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            System.out.println("Forward Exception: " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void editItem(HttpServletRequest req, HttpServletResponse resp) {
        // Get Item Data From Request
        String name = req.getParameter("itemName");
        double price = Double.parseDouble(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        // Update Item
        Items item = new Items(name, price, quantity);
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
        // Set Items In Request Scope
        req.setAttribute("list", itemsList);
        // Forward To JSP Page
        try {
            req.getRequestDispatcher("ItemsList.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            System.out.println("Forward Exception: " + e.getMessage());
        }
    }
}