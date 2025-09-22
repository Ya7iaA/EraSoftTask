<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Home - Warehouse Management</title>
    <link rel="stylesheet" href="style/Home.css">
</head>
<body>
<!-- Background -->
<img src="../asset/background.jpg" alt="Warehouse Background" class="bg-image">

<!-- Overlay -->
<div class="overlay">
    <div class="form-container">
        <h2>Welcome, <%= session.getAttribute("username") != null ? session.getAttribute("username") : "User" %> 👋</h2>
        <p class="subtitle">What would you like to do today?</p>

        <!-- Actions Grid -->
        <div class="actions-grid">
            <a href="logout" class="btn logout">🚪 Logout</a>
            <a href="http://localhost:9090/ProductManagement_war_exploded/ItemsController?action=list" class="btn add">➕ Add Item</a>
            <a href="http://localhost:9090/ProductManagement_war_exploded/ItemsController?action=list" class="btn show">📦 Show Items</a>
            <a href="profile.jsp" class="btn profile">👤 View Profile</a>
        </div>
    </div>
</div>
</body>
</html>