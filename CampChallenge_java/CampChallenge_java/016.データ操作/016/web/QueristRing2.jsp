<%-- 
    Document   : QueristRing2
    Created on : 2018/02/23, 16:25:41
    Author     : takahashi
--%>

<%@ page import="java.util.ArrayList" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            request.setCharacterEncoding("UTF-8");

            int num = Integer.parseInt(request.getParameter("Number"));
            out.print("<br>数字は：" + num);

            int bunkai = num;
            ArrayList<Integer> a = new ArrayList<Integer>();

            if (bunkai % 2 != 0 && bunkai % 3 != 0 || bunkai == 2 || bunkai == 3 && bunkai>10) {
                out.print("<br>現在の数字は：" + num);
                out.print("<br>素数!!");

            } else {
                while (bunkai > 0) {
                    if (bunkai % 2 == 0) {
                        while (bunkai % 2 == 0) {
                            bunkai = bunkai / 2;
                            a.add(2);
                            out.print("<br>値は" + bunkai);
                        }
                    } else if (bunkai % 3 == 0) {
                        while (bunkai % 3 == 0) {
                            bunkai = bunkai / 3;
                            a.add(3);
                            out.print("<br>値は" + bunkai);
                        }
                    } else if (bunkai % bunkai == 0) {
                        a.add(bunkai);
                        // out.print("<br>45" + bunkai);
                        break;
                    }

                }
                out.print("<br>" + a);
                out.print("計算終わり");
            }

        %>
    </body>
</html>
