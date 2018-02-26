/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.servlet.http.Cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author takahashi
 */
@WebServlet(urlPatterns = {"/Cookie"})
public class Cookie2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            //現在時刻取得、フォーマット定義
            Calendar d = Calendar.getInstance();
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String food = "ichigo";
            //Cookie c = new Cookie("Data", food);
            Cookie c = new Cookie("Data", (f.format(d.getTime())));

            // cookieの登録
            response.addCookie(c);

            //cookie情報を取得し、情報は配列で取得する
            Cookie[] cs = request.getCookies();

            //値が格納されていることの確認
            if (cs != null) {
                //配列内のクッキーを順番に見ていく
                for (int i = 0; i < cs.length; i++) {
                    //getNameで、クッキーの名前情報を取り出す
                    String cookieName = cs[i].getName();

                    //クッキーの名前情報の値が、Dataと一致するか判定
                    if (cookieName.equals("Data")) {

                        //getValueで値を取り出す
                        String cookieValue = cs[i].getValue();

                        out.print(cookieValue);
                        break;
                    }
                }
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
