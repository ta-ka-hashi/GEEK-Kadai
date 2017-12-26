<%-- 
    Document   : java005
    Created on : 2017/12/22, 14:40:18
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
            int x =new java.util.Random().nextInt(3)+1;
                //ランダムで1～3をxとして出力する
            
            if (x == 1) {
                out.println("値が"+x+"のため、1です!");
            }                                
            else if (x == 2) {
                out.println("値が"+x+"のため、プログラミングキャンプ!");
            }                           
            else{
                out.println("値が"+x+"のため、その他です!"); 
            }   
        %>
    </body>
</html>
