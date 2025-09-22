<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Item - Warehouse Management</title>
    <link rel="stylesheet" href="style/AddItem.css">
</head>
<body>
<!-- Background Image -->
<img src="../asset/background.jpg" alt="Warehouse Background" class="bg-image">

<!-- Overlay -->
<div class="overlay">
    <div class="form-container" style="max-width: 500px; text-align: left;">
        <h2>Add New Item</h2>

        <!-- Add Item Form -->
        <form action="ItemsController?action=add" method="post" class="item-form">
            <div class="form-group">
                <label for="name">Item Name:</label>
                <input type="text" id="name" name="name" required>
            </div>

            <div class="form-group">
                <label for="price">Price:</label>
                <input type="number" step="0.01" id="price" name="price" required>
            </div>

            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input type="number" id="quantity" name="quantity" required>
            </div>

            <div class="form-actions">
                <button type="submit" class="btn add">Add Item</button>
                <a href="http://localhost:9090/ProductManagement_war_exploded/ItemsController?action=list" class="btn details">Back</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>