<html>
<body>
<%!
    public String YourInfo(int id, String name){
        return id+" -> "+name;
    }

    int id = 7;
    String name = "Yahia";
%>
<h1><%= YourInfo(id,name) %></h1>
</body>
</html>
