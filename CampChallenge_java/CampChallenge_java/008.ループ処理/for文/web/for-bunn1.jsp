<%-- 
    Document   : for文1
    Created on : 2017/12/22, 17:41:44
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
        for (int i=0; i<21; i++){
            out.print(i*8*8);
            out.println("<br>");
        }
        %>
    </body>
</html>
