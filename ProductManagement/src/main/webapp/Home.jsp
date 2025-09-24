<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home - Warehouse Management</title>
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
            text-align: center;
            background: rgba(255, 255, 255, 0.1);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);
            width: 450px;
        }

        h1 {
            font-size: 2.2rem;
            margin-bottom: 30px;
        }

        .menu {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .btn {
            background: #ff9800;
            color: #fff;
            text-decoration: none;
            padding: 15px;
            border-radius: 25px;
            font-weight: bold;
            transition: 0.3s;
            font-size: 1.1rem;
        }

        .btn:hover {
            background: #e68900;
        }
    </style>
</head>
<body>
<div class="overlay"></div>
<div class="container">
    <h1>Welcome to Warehouse Management</h1>
    <div class="menu">
        <a href="ItemsController?action=list" class="btn">View Items 📦</a>
        <a href="ItemsController?action=addForm" class="btn">Add Item ➕</a>
        <a href="profile.jsp" class="btn">View Profile 👨‍💼</a>
        <a href="LogoutServlet" class="btn">Logout ❌</a>
    </div>
</div>
</body>
</html>