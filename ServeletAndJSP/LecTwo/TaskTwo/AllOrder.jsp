<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Orders</title>
</head>
<body>
    <%
        List<String> orders = (List<String>) session.getAttribute("MyOrders");
        if (Objects.isNull(orders)) {
            orders = new ArrayList<>();
            session.setAttribute("MyOrders", orders);
        }

        String order = request.getParameter("order");
        if (order != null && !order.trim().isEmpty()) {
            orders.add(order.trim());
        }
    %>
    <h3>Your Orders</h3>
    <ul>
        <%
            if (!orders.isEmpty()) {
                for (String ord : orders) {
        %>
        <li><%= ord %></li>
        <%
            }
        } else {
        %>
        <li>No orders yet!</li>
        <%
            }
        %>
    </ul>
</body>
</html>