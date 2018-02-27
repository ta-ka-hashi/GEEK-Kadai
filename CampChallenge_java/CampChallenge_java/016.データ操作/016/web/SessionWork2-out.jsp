<%-- 
    Document   : SessionWork2-out
    Created on : 2018/02/27, 15:41:37
    Author     : takahashi
--%>


<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="javax.servlet.http.HttpSession" %>

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

            out.print("<br>ご趣味は：");
            out.print(request.getParameter("mulText"));
            
            
            
            //セッションバージョン
            //各入力フォームの情報をそれぞれのデータ項目に登録している
            HttpSession name = request.getSession();
            name.setAttribute("1", request.getParameter("txtName"));

            HttpSession human = request.getSession();
            human.setAttribute("2", request.getParameter("rdo"));

            HttpSession hobby = request.getSession();
            hobby.setAttribute("3", request.getParameter("mulText"));

            
            //クッキーバージョン
            /*
            Cookie name = new Cookie("Data", request.getParameter("txtName"));
            response.addCookie(name);
            Cookie human = new Cookie("Data", request.getParameter("rdo"));
            response.addCookie(human);
            Cookie hobby = new Cookie("Data", request.getParameter("mulText"));
            response.addCookie(hobby);
             */
        %>
    </body>
</html>
