<%-- 
    Document   : Java003
    Created on : 2017/11/23, 20:58:20
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
    final int A = 10;
    int num = 10;
    
    out.println(A + num);
    out.println(A - num);
    out.println(A * num);
    out.println(A / num);
    %>
    </body>
</html>
