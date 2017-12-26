<%-- 
    Document   : Java007
    Created on : 2017/12/22, 16:23:43
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
        String[] youso =new String[]{"10","100","soeda","hayashi","-20","118","END"};        
        
        out.print(youso[0]+"<br>");
        out.print(youso[1]+"<br>");
        out.print(youso[2]+"<br>");
        out.print(youso[3]+"<br>");
        out.print(youso[4]+"<br>");
        out.print(youso[5]+"<br>");
        out.print(youso[6]+"<br>");

        %>
    </body>
</html>
