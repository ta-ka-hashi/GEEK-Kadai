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
        long num =1;
 
        for (int i=1; i<=20; i++){
            num = num*8;
            out.print("<br>8の"+i+"乗は"+num);
        }
        %>
    </body>
</html>
