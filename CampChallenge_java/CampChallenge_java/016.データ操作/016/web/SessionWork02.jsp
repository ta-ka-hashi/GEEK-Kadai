<%-- 
    Document   : SessionWork02
    Created on : 2018/02/27, 16:14:56
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
            // HTMLのvalueにJavaのnullを直接指定はできない
            //各入力フォームのセッションをそれぞれ別の変数に分けて入れます
            String n = (String) session.getAttribute("1");
            String h = (String) session.getAttribute("2");
            String ho = (String) session.getAttribute("3");

            // セッションの中身がnullの可能性があるので、まずはnullのチェックをする
            
            //名前セッションのチェック
            //何か入力情報があれば、それを変数に代入
            String nCheck = "";
            if (n == null) {
                nCheck = "";
            } else if (n != null) {
                nCheck = n;
            }

            //性別セッションのチェック
            String h1Check = "";
            String h2Check = "";
            String h3Check = "";
            String h4Check = "";
            // セッションに何も入ってないんじゃない？
            
            //選んだ項目によりselectedをどれか一つの変数に代入。これでカーソル初期値を決めます
            if (h == null || h.equals("")) {
                h1Check = "selected";
            } else if (h != null && h.equals("男")) {
                h2Check = "selected";
            } else if (h != null && h.equals("女")) {
                h3Check = "selected";
            } else {
                h4Check = "selected";
            }

            //趣味セッションのチェック
            //何か入力情報があれば、それを変数に代入
            String hoCheck = "";
            if (ho == null) {
                hoCheck = "";
            } else if (ho != null) {
                hoCheck = ho;
            }

        %>


        <form action="./SessionWork2-out.jsp" method="post">
            <!-- formタグで括られた入力項目はこれら -->
            <!-- 各formValueには上で定義してある内容を代入します -->
            名前    <br>
            <input type="text" name="txtName" value="<% out.print(nCheck); %>">

            <br>

            <p>性別：
                <select name="rdo">
                    <option value="" <% out.print(h1Check); %>>---</option>
                    <option value="男" <% out.print(h2Check); %> >男</option>
                    <option value="女" <% out.print(h3Check); %>>女</option>
                    <option value="その他" <% out.print(h4Check); %>>その他</option>
                </select></p>                          

            ご趣味は <br> 
            <textarea name="mulText"><% out.print(hoCheck);%></textarea>
            <br><br>
            
            <!-- 以下、操作ボタン二種類 -->
            <input type="submit" value="送信" name="btnSubmit">　　<input type="reset" value="リセット">
            <br> <br>
        </form>

    </body>
</html>
