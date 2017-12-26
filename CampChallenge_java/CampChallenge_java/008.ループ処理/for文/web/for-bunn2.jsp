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
        String moji = "";
        for (int i=1; i<= 30; i++) {
            moji = moji +"A";
            out.print(i +"回目" +moji +"<br>");
        }
        
        out.print("最終結果は"+moji);
        %>
    </body>
</html>
