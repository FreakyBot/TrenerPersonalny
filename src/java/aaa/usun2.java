/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;
import java.io.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aaaaa
 */
@WebServlet(name="usun2", urlPatterns={"/usun2"})
public class usun2 extends HttpServlet {
  static final String nazwaserwera="localhost";
    static final String nazwabazy="trener_personalny";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }


    public void destroy() {

    }


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       response.setContentType("text/html; CHARSET=windows-1250");



String id_silownia= request.getParameter("id_silownia");
       String id_user= request.getParameter("id_user");
String id_silownia_pracuje= request.getParameter("id_silownia_pracuje");
String id_rezerwacja= request.getParameter("id_rezerwacja");



        Connection polaczenie;
        Statement sql;

        try
        {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
         sql=polaczenie.createStatement();
         sql.executeUpdate("delete from rezerwacja where id_rezerwacja='"+id_rezerwacja+"';");

        response.sendRedirect("l_rezerwacje2?id_user="+request.getParameter("id_user")+"&id_silownia_pracuje="+request.getParameter("id_silownia_pracuje")+"&id_silownia="+request.getParameter("id_silownia")+"");
         
         polaczenie.close();
         
         
         }
         catch (Exception e)
         {
          }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

