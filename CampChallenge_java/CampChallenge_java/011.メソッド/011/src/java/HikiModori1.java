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
@WebServlet(urlPatterns = {"/HikiModori1"})
public class HikiModori1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//引数が１つのメソッドを作成してください。
//method内の処理は3人分の個人情報（項目は戻り値2と同様）を作成し引数として渡された値と同じIDを持つ人物の個人情報を返却する様にしてください。
//それ以降は課題「戻り値2」と同じ処理にしてください。
    String[] PersonalData(String ID) {
        String[] Data1 = new String[]{"ID:00", "名前：髙橋", "生年月日：0502", "住所：331-0072"};
        String[] Data2 = new String[]{"ID:11", "名前：村山", "生年月日：1102", "住所：331-0072"};
        String[] Data3 = new String[]{"ID:22", "名前：松田", "生年月日：0902", "住所：331-0072"};

// switch 文の例
//        switch(ID){
//            case "00":
//                return Data1;
//            case "11":
//                return Data2;
//            case "22":
//                return Data3;
//            default:
//                return null;
//        }

//        if( ("ID: " + ID).equals( Data1[0] ) ){}

        // 文字列の比較は equals によって行う       
        if (ID.equals("00")) {
            return Data1;
        }
        else if (ID.equals("11")) {
            return Data2;
        }
        else {
            return Data3;
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String[] array= PersonalData("22");//("")内を書き換えて結果確認する

            out.println(array[0]+"の人物の詳細を表示");
            out.println("<br>" + array[1]);
            out.println("<br>" + array[2]);
            out.println("<br>" + array[3]);
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
