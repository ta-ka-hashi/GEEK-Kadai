<%-- 
    Document   : Java_002
    Created on : 2017/11/23, 20:42:30
    Author     : takahashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
    String NAME ="名前：髙橋<br>";
    String ADDRESS ="住所：埼玉<br>";
        
        out.print(NAME);
        out.print(ADDRESS);
    %>
    </body>
</html>
