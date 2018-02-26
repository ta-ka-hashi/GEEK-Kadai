<%-- 
    Document   : Quest
    Created on : 2018/02/23, 14:15:34
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

            /* キャストの例
            String num = "123";
            int numnum = Integer.parseInt(num);
            int numnumnum = Integer.parseInt("234");*/
            int type = Integer.parseInt(request.getParameter("type"));
            String syurui="a";
            
            if(type==1){
                syurui="雑貨";
            }
            else if(type==2){
                syurui="生鮮食品";
            }
            else if(type==3){
                syurui="その他";
            }
            
            
            
            int count = Integer.parseInt(request.getParameter("count"));
            int total = Integer.parseInt(request.getParameter("total"));
            int price = total / count;

            request.setCharacterEncoding("UTF-8");

            out.print("<br>商品種別：");
            out.print( syurui);
            
            out.print("<br>個数：");
            out.print(request.getParameter("count"));

            out.print("<br>総額：");
            out.print(request.getParameter("total"));
            
            out.print("<br>商品："+syurui+"の単価は：");
            out.print(price);

            int point=0;
            int present=1000-point;
            
            if(total<3000){
                point=0;
                out.print("<br>3000円未満の購入のため購入ポイントは");
            }
            else if(total>=3000 && total <5000){
                point=(total/100)*4;
                out.print("<br>3000～5000円の購入のため購入ポイントは");
            }
             else{
                point=(total/100)*5;
                out.print("<br>5000円以上の購入のため購入ポイントは");
            }
            
            out.print( point +"ポイントである");

        %>
    </body>
</html>
