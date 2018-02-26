<%-- 
    Document   : test
    Created on : 2018/02/21, 16:43:40
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
// 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");

            out.print("名前：");
            out.print(request.getParameter("txtName"));

            out.print("<br>性別：");
            out.print(request.getParameter("rdo"));
            
            out.print("<br>血液型：");
            out.print(request.getParameter("blood"));

            out.print("<br>ご趣味は：");
            out.print(request.getParameter("mulText"));
        %>

    </body>
</html>
