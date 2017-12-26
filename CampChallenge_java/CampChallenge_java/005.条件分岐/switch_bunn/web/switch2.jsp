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
        //spell ='A';//英語の値の場合
        //spell ='あ';//日本語の値の場合
        spell ='　';//その他の値の場合
        switch(spell){
                    
            case 'A':
                out.println("値が「"+spell+"」のため、英語");
                break;
            case 'あ':
                out.println("値が「"+spell+"」のため、日本語");
                break;
            default:
                out.println("値が「"+spell+"」のため、　");
        }
        %>
    </body>
</html>
