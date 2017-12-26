<%-- 
    Document   : Java007-2
    Created on : 2017/12/22, 17:24:13
    Author     : takahashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String[] youso =new String[]{"10","100","soeda","hayashi","-20","118","END"};
        
        youso[2]="33";
        
        out.print(youso[2]);

    %>
</html>
