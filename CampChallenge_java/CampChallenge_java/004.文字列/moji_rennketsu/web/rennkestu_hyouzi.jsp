<%-- 
    Document   : Java004
    Created on : 2017/12/18, 22:02:32
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
            String A ="groove";
            String B ="-";
            String C ="gear";
            
            out.print("文字の連結表示："+A+B+C);
           %>
    </body>
</html>
