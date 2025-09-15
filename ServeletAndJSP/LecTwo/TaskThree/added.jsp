<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Added</title>
  </head>
  <body>
    <%
      String favPlace = request.getParameter("place");
      Cookie cookie = new Cookie("fav-place",favPlace);
      cookie.setMaxAge(60*60*24*30);
      response.addCookie(cookie);
    %>

    <h1>Fav Place Added</h1>
    <h3>
      <a href="homepage.jsp">Home Page</a>
    </h3>
  </body>
</html>