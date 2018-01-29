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

import java.util.Random;

/**
 *
 * @author takahashi
 */
@WebServlet(urlPatterns = {"/hikisu2"})
public class hikisu2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        void hikisu2(int H1,int H2,String H3,PrintWriter pw) {
            
            int AS =H1*H2;
            pw.print("1つ目の値は"+H1);
            pw.print("、2つ目の値は"+H2+"<br>");
            pw.print("2つを掛けた値は"+AS+"となる<br>");
        
        if( H3 == "true"){
            int RJ =AS*AS;
            pw.print("3つ目がtrueなので、掛けた結果を2乗すると"+ RJ+"となる<br>");
            pw.print("計算終了");
        }
        else{
            pw.print("3つ目がfalseなので、計算終了");
        }
    }           
           
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                int H1 = new java.util.Random().nextInt(3);
                int H2 = 5;
                //falseの場合
                String H3 = "false";
                //trueの場合 
                //String H3 = "true";
                hikisu2(H1,H2,H3,out);
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
