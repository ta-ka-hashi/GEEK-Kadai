<%-- 
    Document   : while
    Created on : 2017/12/25, 17:42:02
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
    // 1000を2で割り、100以下になるまで繰り返す
    
    double i = 1000;
    out.print("初期値は"+i+"<br><br>");
    
    while(i <100 == false) {
        i= i /2;
        out.print("現在値は"+i+"<br>");
    }
    
    out.print("　値が100より小さいので"+i+"で停止");
    %>
</html>
