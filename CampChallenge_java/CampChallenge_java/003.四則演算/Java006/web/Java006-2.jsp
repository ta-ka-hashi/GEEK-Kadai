<%-- 
    Document   : Java006-2
    Created on : 2017/12/22, 16:15:09
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
        char spell;
        spell ='N';
        switch(spell){
                    
            case 'A':
                out.println("英語");
                break;
            case 'あ':
                out.println("日本語");
                break;
            default:
                out.println("　");
        }
        %>
    </body>
</html>
