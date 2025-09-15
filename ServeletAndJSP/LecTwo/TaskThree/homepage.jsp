<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home Page</title>
  </head>
  <body>
    <%
        String place = "No Place";
        Cookie[] cookies = request.getCookies();

        for(Cookie cookie : cookies)
        {
            if(cookie.getName().equals("fav-place"))
            {
                place = cookie.getValue();
            }
        }
    %>

    <h1>Fav Place</h1>
    <h3><%= place %></h3>
  </body>
</html>