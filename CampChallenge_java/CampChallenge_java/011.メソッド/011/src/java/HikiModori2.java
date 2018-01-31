/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(urlPatterns = {"/HikiModori2"})
public class HikiModori2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//課題「引数、戻り値1」の3人分のプロフィールのうち、1人だけ住所の値をnullで定義し、
//ループ処理で全員分のプロフィールをid以外表示する処理を作成してください。
//この際、nullになっているデータはcontinueで飛ばしながら表示してください。
    String[] PersonalData(int ID) {
        String[] Data1 = new String[]{"ID:00", "名前：髙橋", "生年月日：0502", "住所：331-0072"};
        String[] Data2 = new String[]{"ID:11", "名前：村山", "生年月日：1102", "住所：331-0072"};
        String[] Data3 = new String[]{"ID:22", "名前：松田", "生年月日：0902", "住所：331-0072"};

        Data1[3] = null;
        switch (ID) {
            case 1:
                return Data1;
            case 2:
                return Data2;
            case 3:
                return Data3;
            default:
                return null;
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            for (int a = 1; a <= 3; a++) {
                String[] array = PersonalData(a);//("")内が1roop毎に増える
                for (int i = 1; i < array.length; i++) {
                    if (array[i] == null) {
                        continue;
                    }
                    out.println(array[i] + "<br>");
                }
                out.println("<br>");//改行して見栄えよくする
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
