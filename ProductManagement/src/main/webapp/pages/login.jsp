<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Warehouse Management</title>
    <link rel="stylesheet" href="style/LoginSignup.css">
</head>
<body>
    <!-- Background Image -->
    <img src="../asset/background.jpg" alt="Warehouse Background" class="bg-image">

    <!-- Overlay -->
    <div class="overlay">
        <div class="form-container">
            <h2>Login</h2>
            <form action="Home.jsp" method="post">
                <input type="text" name="username" placeholder="Username" required>
                <input type="password" name="password" placeholder="Password" required>
                <button type="submit" class="btn">Login</button>
            </form>
            <p>Don’t have an account? <a href="Signup.jsp">Sign Up</a></p>
        </div>
    </div>
</body>
</html>