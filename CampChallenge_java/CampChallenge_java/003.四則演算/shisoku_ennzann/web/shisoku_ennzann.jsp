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
    final int T = 100;
    int H = 10;
    
    int PLUS =T+H;
    int MINUS =T-H;
    int KAKERU=T*H;
    int WARU =T/H;
    
    out.println("100+10は"+ PLUS);
    out.println("<br>100-10は"+ MINUS );
    out.println("<br>100*10は"+ KAKERU);
    out.println("<br>100/10は"+ WARU);
    %>
    </body>
</html>
