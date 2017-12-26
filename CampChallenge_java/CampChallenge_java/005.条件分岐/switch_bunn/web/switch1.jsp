<%-- 
    Document   : Java006
    Created on : 2017/12/22, 16:06:25
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
        int x =new java.util.Random().nextInt(3);
            //ランダムで0～2をxとする
            
            switch(x){      
                case 1:
                    out.println("値が"+x+"のため、one");
                    break;
                case 2:
                    out.println("値が"+x+"のため、two");
                    break;
                default:
                    out.println("値が"+x+"のため、想定外");
            }
        %>
    </body>
</html>
