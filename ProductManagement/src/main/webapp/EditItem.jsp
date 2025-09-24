<%@ page import="com.product.model.Items" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Item - Warehouse Management</title>
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
            width: 500px;
            text-align: center;
        }

        h1 {
            margin-bottom: 20px;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        input {
            padding: 12px;
            border-radius: 8px;
            border: none;
            outline: none;
            font-size: 1rem;
        }

        .btn {
            padding: 12px;
            border-radius: 8px;
            border: none;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }

        .save-btn {
            background: #2ecc71;
            color: #fff;
        }

        .save-btn:hover {
            background: #27ae60;
        }

        .ignore-btn {
            background: #e74c3c;
            color: #fff;
            text-decoration: none;
            display: block;
            text-align: center;
        }

        .ignore-btn:hover {
            background: #c0392b;
        }
    </style>
</head>
<body>
<%
    Items item = (Items) request.getAttribute("item");
%>
<div class="overlay"></div>
<div class="container">
    <h1>Edit Item</h1>

    <form action="ItemsController?action=edit" method="post">
        <input type="hidden" name="id" value="<%= item.getItemId() %>">

        <input type="text" name="name" value="<%= item.getItemName() %>" placeholder="Item Name" required>
        <input type="number" step="0.01" name="price" value="<%= item.getItemPrice() %>" placeholder="Price" required>
        <input type="number" name="quantity" value="<%= item.getItemQuantity() %>" placeholder="Quantity" required>

        <input type="submit" value="Save" class="btn save-btn">
    </form>

    <a href="ItemsController?action=list" class="btn ignore-btn">Ignore</a>
</div>
</body>
</html>