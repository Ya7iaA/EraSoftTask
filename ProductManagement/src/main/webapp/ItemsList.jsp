<%@ page import="com.product.model.Items" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Items - Warehouse Management</title>
    <style>
        /* Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background: url("asset/background.jpg") no-repeat center center fixed;
            background-size: cover;
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .overlay {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.6);
            z-index: -1;
        }

        .container {
            background: rgba(255, 255, 255, 0.1);
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);
            width: 900px;
            text-align: center;
        }

        h1 {
            margin-bottom: 20px;
        }

        .top-buttons {
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }

        .btn {
            background: #ff9800;
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 25px;
            font-weight: bold;
            transition: 0.3s;
        }

        .btn:hover {
            background: #e68900;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
            background: rgba(255, 255, 255, 0.2);
        }

        th, td {
            padding: 12px;
            border: 1px solid rgba(255, 255, 255, 0.3);
            text-align: center;
        }

        th {
            background: rgba(0, 0, 0, 0.5);
            font-size: 1.1rem;
        }

        td {
            font-size: 1rem;
        }

        .action-btn {
            padding: 6px 12px;
            border-radius: 20px;
            font-size: 0.9rem;
            margin: 2px;
            display: inline-block;
        }

        .delete {
            background: #e74c3c;
        }

        .edit {
            background: #3498db;
        }

        .details {
            background: #2ecc71;
        }

        .delete:hover { background: #c0392b; }
        .edit:hover { background: #2980b9; }
        .details:hover { background: #27ae60; }
    </style>
</head>
<body>
<%
    List<Items> items = (List<Items>) request.getAttribute("list");
%>
<div class="overlay"></div>
<div class="container">
    <h1>Warehouse Items</h1>

    <div class="top-buttons">
        <a href="ItemsController?action=addForm" class="btn">Add Item</a>
        <a href="Home.jsp" class="btn">Home</a>
    </div>

    <table>
        <tr>
            <th>ID</th>
            <th>Item Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Actions</th>
        </tr>

        <%
            if (items != null && !items.isEmpty()) {
                for (Items item : items) {
        %>
        <tr>
            <td><%= item.getItemId() %></td>
            <td><%= item.getItemName() %></td>
            <td>$<%= item.getItemPrice() %></td>
            <td><%= item.getItemQuantity() %></td>
            <td>
                <a href="ItemsController?action=delete&id=<%= item.getItemId() %>" class="btn action-btn delete">Delete</a>
                <a href="ItemsController?action=editForm&id=<%= item.getItemId() %>" class="btn action-btn edit">Edit</a>
                <a href="ItemDetailsServlet?id=<%= item.getItemId() %>" class="btn action-btn details">Details</a>
            </td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="5">No items found in the warehouse.</td>
        </tr>
        <% } %>
    </table>
</div>
</body>
</html>