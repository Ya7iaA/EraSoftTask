<%@ page import="java.util.List" %>
<%@ page import="com.product.model.Items" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Items - Warehouse Management</title>
    <link rel="stylesheet" href="style/Items.css">
</head>
<body>
<%
    List<Items> items = (List<Items>) request.getAttribute("list");
    System.out.println("Items List: " + items);
%>
<!-- Background Image -->
<img src="../asset/background.jpg" alt="Warehouse Background" class="bg-image">

<!-- Overlay -->
<div class="overlay">
    <div class="form-container" style="width: 90%; max-width: 900px;">
        <h2>Warehouse Items</h2>

        <!-- Add Item Button -->
        <div class="actions-top">
            <a href="AddItem.jsp" class="btn add">+ Add New Item</a>
        </div>

        <div class="table-wrapper">
            <table class="items-table">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Item Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <%
                    if (items != null && !items.isEmpty()) {
                        for (Items item : items) {
                %>
                <tr>
                    <td><%= item.getItemId() %>
                    </td>
                    <td><%= item.getItemName() %>
                    </td>
                    <td><%= item.getItemPrice() %>
                    </td>
                    <td><%= item.getItemQuantity() %>
                    </td>
                    <td>
                        <a href="ItemsController?action=update&id=<%= item.getItemId() %>" class="btn edit">Edit</a>
                        <a href="ItemsController?action=delete&id=<%= item.getItemId() %>" class="btn delete">Delete</a>
                        <a href="ItemsController?action=details&id=<%= item.getItemId() %>"
                           class="btn details">Details</a>
                    </td>
                </tr>
                <%
                    }
                } else {
                %>
                <tr>
                    <td colspan="5" style="text-align:center;">No items found.</td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>