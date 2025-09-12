<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data</title>
</head>
<body>
  <%
    String fullName = request.getParameter("fullName");
    String password = request.getParameter("password");
    String age = request.getParameter("age");
    String addressRadio = request.getParameter("addressRadio");
    String addressSelect = request.getParameter("addressSelect");
  %>

  <h2>Name : <%= fullName %></h2>
  <h2>Password : <%= password %></h2>
  <h2>Age : <%= age %></h2>
  <h2>Address : <%= addressRadio %></h2>
  <h2>Address : <%= addressSelect %></h2>
</body>
</html>
