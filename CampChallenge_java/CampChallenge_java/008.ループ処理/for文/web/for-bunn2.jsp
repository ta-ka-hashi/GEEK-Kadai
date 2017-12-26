<%-- 
    Document   : for-bunn2
    Created on : 2017/12/22, 18:07:33
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
        //String NAME = "A";
        //String NUM = "A";

        //for (String NUM=1; NUM<21; NUM++){
        //int i=1;
       // NAME =(NAME + NUM);
        //////out.print(NAME);
        String moji = "";
        for (int i = 1; i <= 30; i++) {
        //A = (A +i);
        
        //文字連結
        moji=moji+"A";
        
        out.print(i +"回"+moji+"<br>");
        } 
        out.print(moji);
        %>
    </body>
</html>
