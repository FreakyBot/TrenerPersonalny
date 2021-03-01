/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.security.MessageDigest;

@WebServlet(name="a_silownie_dodaj", urlPatterns={"/a_silownie_dodaj"})
public class a_silownie_dodaj extends HttpServlet {
   static final String nazwaserwera="localhost";
    static final String nazwabazy="trener_personalny";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";




    //publiczna metoda wywoływana podczas niszczenia serwletu
    public void destroy() {

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; CHARSET=windows-1250");

        String id_miasto=request.getParameter("id_miasto");
  String nr=request.getParameter("nr");
  String ulica=request.getParameter("ulica");
        String nazwa=request.getParameter("nazwa");

  


            Connection polaczenie;
            Statement sql;
            HttpSession session=request.getSession();



            try {

             

                Class.forName("com.mysql.jdbc.Driver").newInstance();
         polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
      sql=polaczenie.createStatement();

               sql.executeUpdate("insert into silownia(id_miasto,nazwa,ulica,nr) values('"+id_miasto+"','"+nazwa+"','"+ulica+"','"+nr+"');");



          response.sendRedirect("a_silownie");
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
