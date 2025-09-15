<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data</title>
</head>
<body>
  <%
    String fullName = request.getParameter("fullName");
    String age = request.getParameter("age");
  %>

  <h2>Name : <%= fullName %></h2>
  <h2>Age : <%= age %></h2>
</body>
</html>