<%-- 
    Document   : rennsou_hairestu
    Created on : 2017/12/26, 15:22:52
    Author     : takahashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@ page import="java.util.HashMap" %>
        <%
        String[] youso =new String[]{"10","100","soeda","hayashi","-20","118","END"};
        HashMap<String, String> data =new HashMap<String, String>();
        
        data.put("1","AAA");
        data.put("hello","world");
        data.put("soeda","33");
        data.put("20","20");
        
        
        out.println("1に"     + data.get("1"));
        out.println("<br>helloに" + data.get("hello"));
        out.println("<br>soedaに" + data.get("soeda"));
        out.println("<br>20に"    + data.get("20"));
        %>
</html>
