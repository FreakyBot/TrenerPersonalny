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

@WebServlet(name="korespondencja_wybrany_temat2", urlPatterns={"/korespondencja_wybrany_temat2"})
public class korespondencja_wybrany_temat2 extends HttpServlet {
    static final String nazwaserwera="localhost";
    static final String nazwabazy="trener_personalny";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();


            response.setContentType("text/html; CHARSET=utf-8");
           String id_user=request.getParameter("id_user");
                String id_pytania=request.getParameter("id_pytania");
    Connection polaczenie;


     try {
   
      Statement sql;
      Statement sql2;Statement sql4;
      Statement sql9;Statement sql91;
        Statement sql3;
 

      Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
      sql=polaczenie.createStatement();
      sql2=polaczenie.createStatement();sql4=polaczenie.createStatement();
      sql9=polaczenie.createStatement();sql91=polaczenie.createStatement();

         sql3=polaczenie.createStatement();

  out.write("<!DOCTYPE html>\n" +
"\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-2\" />\n" +
"<meta name=\"format-detection\" content=\"telephone=no\">\n" +
"<!-- Favicons Icon -->\n" +
"<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n" +
"<link rel=\"shortcut icon\" type=\"http://inshape.w3itexperts.com/xhtml/image/x-icon\" href=\"images/favicon.png\" />\n" +
"<title>Znany Trener</title> \n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/fontawesome/css/font-awesome.min.css\" />\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/owl.carousel.css\">\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-select.min.css\">\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/magnific-popup.css\">\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
"<link class=\"skin\"  rel=\"stylesheet\" type=\"text/css\" href=\"css/skin/skin-6.css\">\n" +
"<link  rel=\"stylesheet\" type=\"text/css\" href=\"css/templete.css\">\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/revolution/revolution/css/settings.css\">\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/revolution/revolution/css/navigation.css\">\n" +
"<link href=\"../../https@fonts.googleapis.com/css@family=Open+Sans_3A300,400,600,700,800_7CPoppins_3A300,400,500,600,700_7CRoboto_3A100,300,400,500,700,900\" rel=\"stylesheet\">\n" +
"" );


    out.write("<script type=\"text/javascript\">\n");
      out.write("function przetwarzajj_dane (){\n");
      out.write("  var brakuje_danych = false;\n");
      out.write("  var formularz = document.forms[0];\n");
      out.write("  var napis = \"\";\n");
      out.write("\n");
    
      out.write("  if (formularz.miasto.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nazwa miasta\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      
      
      
      out.write("\n");
      out.write("\n");
      out.write("  if (!brakuje_danych)\n");
      out.write("    return true;\n");
      out.write("  else{\n");
      out.write("    alert (\"Bledy w formularzu to:\\n\\n\" + napis);\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      
out.write("\n" +
"</head>\n" +
"\n" +
"<body id=\"bg\">\n" +
"<div class=\"page-wraper\"><div id=\"loading-area\"></div>\n" +
"    <!-- Header -->\n" +
"	<header class=\"site-header header-style-5 dark\">\n" +
"		<!-- main header -->\n" +
"		<div class=\"sticky-header main-bar-wraper\">\n" +
"			<div class=\"main-bar clearfix \">\n" +
"				<div class=\"container clearfix\">\n" +
"					<!-- website logo -->\n" +
"					<div class=\"logo-header mostion\">\n" +
"						<a href=\"index.jsp\">\n" +
"							<img src=\"images/logo6.png\" width=\"193\" height=\"89\" alt=\"\">\n" +
"						</a>\n" +
"					</div>\n" +
"					<!-- nav toggle button -->\n" +
"					<button data-target=\".header-nav\" data-toggle=\"collapse\" type=\"button\" class=\"navbar-toggle collapsed\">\n" +
"						<span class=\"sr-only\">Toggle navigation</span>\n" +
"						<span class=\"icon-bar\"></span>\n" +
"						<span class=\"icon-bar\"></span>\n" +
"						<span class=\"icon-bar\"></span>						\n" +
"					</button>\n" +
"					<!-- extra nav -->\n" +
"	\n" +
"					<!-- Quik search -->\n" +
"\n" +
"					<!-- main nav -->\n" +
"					<div class=\"header-nav navbar-collapse collapse\">\n" +
"						<ul class=\" nav navbar-nav\">");
   
         out.write("<li ><a  href=\"l_godziny?id_user=");
         out.print( session.getAttribute("id_user") );
 out.write("\">Grafik<i class=\"fa fa-chevron-down\"></i></a></li>  ");
         out.write("<li><a  href=\"l_rezerwacje?id_user=");
         out.print( session.getAttribute("id_user") );
 out.write("\">Rezerwacje<i class=\"fa fa-chevron-down\"></i></a></li>  ");       
     out.write("<li class=\"active\"><a  href=\"l_zapytania?id_user=");
         out.print( session.getAttribute("id_user") );
 out.write("\">Pytania<i class=\"fa fa-chevron-down\"></i></a></li>  ");
 out.write("<li ><a  href=\"l_opinie?id_user=");
         out.print( session.getAttribute("id_user") );
 out.write("\">Opinie<i class=\"fa fa-chevron-down\"></i></a></li>  ");
 out.write("<li ><a  href=\"l_zatrudnienie?id_user=");
         out.print( session.getAttribute("id_user") );
 out.write("\">Si&#322;ownie<i class=\"fa fa-chevron-down\"></i></a></li>  ");
 
      out.write("<li ><a  href=\"l_dane?id_user=");
         out.print( session.getAttribute("id_user") );
 out.write("\">M&#243;j profil<i class=\"fa fa-chevron-down\"></i></a></li>  ");  

out.write("<li ><a  href=\"l_zmiana?id_user=");
         out.print( session.getAttribute("id_user") );
 out.write("\">Zmiana has&#322;a<i class=\"fa fa-chevron-down\"></i></a></li>  ");
        
 out.write("                               <li><a href=\"logaut\">Wyloguj<i class=\"fa fa-chevron-down\"></i></a></li>\n" +
"						</ul>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"		</div>\n" +
"		<!-- main header END -->\n" +
"	</header>\n" +
"    <!-- Header END -->\n" +
"    <!-- Content -->\n" +
"    <div class=\"page-content\">\n" +
"        <!-- Slider -->\n" +
"\n" +
"        \n" +
"        \n" +
"             <div class=\"w3-bnr-inr overlay-black-middle\" style=\"background-image:url(images/background/bg1.jpg);\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"w3-bnr-inr-entry\">\n" +
"                    <h1 class=\"text-white\">Nades&#322;ane pytania</h1>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <!-- inner page banner END -->\n" +
"        <!-- Breadcrumb row -->\n" +
"        <div class=\"breadcrumb-row\">\n" +
"            <div class=\"container\">\n" +
"                <ul class=\"list-inline\">\n" +
"                    <li>Nades&#322;ane pytania</li>");
        
            out.write(" <div id=\"r\"><font color=\"blue\">");
      out.print( session.getAttribute("imie") );
      out.write(' ');
      out.print( session.getAttribute("nazwisko") );
out.write("</font> - TRENER</div>");    
        
        
     out.write("               </ul>\n" +
"            </div>\n" +
"        </div>   \n" +
"        ");






out.write("         <div class=\"section-full content-inner bg-white contact-style-1\">\n" +
"			<div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"   <div class=\"col-md-12\">  <h1 class=\"med_bottompadder20\">Nades&#322;ane pytania</h1>");
        
 
        
     
 
 
      
      
      
                ResultSet rs2 = sql2.executeQuery("select pytania.temat, pytania.data, pytania.id_trener, pytania.id_pytania,klient.imie,klient.nazwisko,klient.ulica,pytania.tresc from pytania,klient where pytania.id_pytania='"+id_pytania+"' and pytania.id_klient=klient.id_klient order by pytania.data desc;");



 out.print(" ");
while(rs2.next())  {
out.print("<font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"3\">");
out.print("<b>"+rs2.getString(1)+"</b></font>");
  if (rs2.getString(7).compareTo("2")==0) {
                out.print("   ("+rs2.getString(5)+" "+rs2.getString(6)+" - ");
        
        }
        else{
        
         out.print("  ("+rs2.getString(6)+" "+rs2.getString(5)+" - ");
        }
         

out.print(" "+rs2.getString(2)+""+")"+"</b>");


out.print("<br><font size=\"2\">"+""+rs2.getString(8)+""+"</font>");



}
     out.print("");

      
      
      
      
      
      

     
     
     
     
     
      
      
      
      
      
      
      
      
      


      out.write("\n");




         ResultSet rs9 = sql9.executeQuery("select odpowiedzi.tresc,odpowiedzi.id_klient,odpowiedzi.id_odpowiedzi from odpowiedzi where odpowiedzi.id_pytania='"+id_pytania+"'  order by odpowiedzi.data");

                        if (rs9.next())
                            {
                                if (rs9.getString(1).compareTo("")!=0)
                                  {

   ResultSet rs91 = sql91.executeQuery("select odpowiedzi.tresc,odpowiedzi.id_klient,odpowiedzi.id_odpowiedzi from odpowiedzi where odpowiedzi.id_pytania='"+id_pytania+"'  order by odpowiedzi.data");


while(rs91.next())  {

out.print("   ");
    if  (rs91.getString(2).compareTo("0")!=0)
      {
          
          

                ResultSet rs = sql.executeQuery("select odpowiedzi.tresc, odpowiedzi.data, odpowiedzi.id_klient, odpowiedzi.id_odpowiedzi,klient.imie,klient.nazwisko from odpowiedzi,klient where odpowiedzi.id_odpowiedzi='"+rs91.getString(3)+"' and odpowiedzi.id_klient=klient.id_klient");







 
while(rs.next())  {





        out.print(" ");
        out.print("  ");
        
        
       
        out.print("<ul  class=\"list-check-circle primary\">");
        out.print(" <li> ");
        
out.write(""+rs.getString(5)+" "+rs.getString(6)+" - ");
        
        
      
        
       
         
         
         
         
          out.print("    "+rs.getString(2)+"</p>");
         out.print("   <p>"+rs.getString(1)+"</p>");
         out.print("</li></ul> ");

}
     

          
      }

    else
    {
    
    
    
                ResultSet rs = sql.executeQuery("select odpowiedzi.tresc, odpowiedzi.data, odpowiedzi.id_klient, odpowiedzi.id_odpowiedzi,trener.imie,trener.nazwisko from odpowiedzi,trener where odpowiedzi.id_odpowiedzi='"+rs91.getString(3)+"' and odpowiedzi.id_trener=trener.id_trener");







 
while(rs.next())  {





        out.print("  ");
        out.print(" ");
        
        
      
        out.print("<ul  class=\"list-check-circle primary\">");
        out.print(" <li> ");
        
        out.print("   <p> "+rs.getString(5)+" "+rs.getString(6)+" - ");
        
        
      
        
        
         
         
         
         
          out.print("    "+rs.getString(2)+"</p>");
         out.print("   <p>"+rs.getString(1)+"</p>");
         out.print(" </li></ul>");

}
    
    }
    
    
    
    
    
    
    
    

}


out.print(" </div>");






                       } }
      else
      {


     out.write("\t\t\t\t<br><br><br<div class=\"section-content\">\n" +
"                        <div class=\"alert alert-danger\"> <strong><i class=\"fa fa-warning\"></i>Uwaga!</strong> Brak odpowiedzi.\n" +
"\n" +
"                        </div>\n" +
"                    </div>\n");

        }

      
      
      

      
      out.write("                    <div class=\"col-md-6\">\n" +
"                        <div class=\"p-a30 bg-gray clearfix m-b30 \">\n" +
"							<h2>Dodaj odpowied&#378;</h2>\n" +

"							<form method=\"post\" action=\"d_odpowiedz\">\n" +

"                                <div class=\"row\">\n" +


"                                    <div class=\"col-md-12\">\n" +
"                                        <div class=\"form-group\">\n" +
"                                            <div class=\"input-group\">\n" +
"                                                <textarea name=\"komentarz\" rows=\"4\" class=\"form-control\"></textarea>\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                    </div>");
out.print("<input  type='hidden' name='id_pytania' value='"+request.getParameter("id_pytania")+"'>");
out.print("<input  type='hidden' name='id_user' value='"+request.getParameter("id_user")+"'>");   
out.print("                                    <div class=\"col-md-12\">\n" +
"                                        <button name=\"submit\" type=\"submit\" value=\"Submit\" class=\"site-button \"> <span>Dalej</span> </button>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </form>\n" +
"                        </div>\n" +
"                    </div>");
      
      
      
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      



polaczenie.close();








   
        
        
        
        
        
        
        
        
        
        
        
  out.write("   </div>     \n" +     
        
"                    <!-- Left part start -->\n" +

"\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>");



















 
    
    
                     

out.write("</div>\n" +
"    <!-- Content END-->\n" +
"	<!-- Footer -->\n" +
"    <footer class=\"site-footer\">\n" +
"        <div class=\"footer-top\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"                    <div class=\"col-md-3 col-sm-6 footer-col-4\">\n" +
"                        <div class=\"widget widget_about\">\n" +
"                            <div class=\"logo-footer\"><img src=\"images/footer-logo.png\" alt=\"\"></div>\n" +
"                            <p class=\"m-tb20\"><strong>Trener Personalny</strong> - szukasz trenera personalnego? - Dobrze trafi&#322;e&#347;, Nasz system pozwala na znalezienie trenerów personalnych</p>\n" +
"                            <ul class=\"w3-social-icon border w3-social-icon-lg\">\n" +
"                                <li><a href=\"javascript:void(0);\" class=\"fa fa-facebook fb-btn\"></a></li>\n" +
"                                <li><a href=\"javascript:void(0);\" class=\"fa fa-twitter tw-btn\"></a></li>\n" +
"                                <li><a href=\"javascript:void(0);\" class=\"fa fa-linkedin link-btn\"></a></li>\n" +
"                                <li><a href=\"javascript:void(0);\" class=\"fa fa-pinterest-p pin-btn\"></a></li>\n" +
"                            </ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-md-3 col-sm-6 footer-col-4\">\n" +
"                        <div class=\"widget recent-posts-entry\">\n" +
"                            <h4 class=\"m-b15 text-uppercase\">gALERIA</h4>\n" +
"                            <div class=\"w3-separator bg-primary\"></div>\n" +
"                            <div class=\"widget-post-bx\">\n" +
"                                <div class=\"widget-post clearfix\">\n" +
"                                    <div class=\"w3-post-media\"> <img src=\"images/blog/recent-blog/pic1.jpg\" alt=\"\" width=\"200\" height=\"143\"> </div>\n" +
"                                    <div class=\"w3-post-info\">\n" +
"                                        <div class=\"w3-post-header\">\n" +
"                                            <h6 class=\"post-title text-uppercase\"><a href=\"#\">Ruch to zdrowie</a></h6>\n" +
"                                        </div>\n" +
"\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                                <div class=\"widget-post clearfix\">\n" +
"                                    <div class=\"w3-post-media\"> <img src=\"images/blog/recent-blog/pic2.jpg\" alt=\"\" width=\"200\" height=\"160\"> </div>\n" +
"                                    <div class=\"w3-post-info\">\n" +
"                                        <div class=\"w3-post-header\">\n" +
"                                            <h6 class=\"post-title text-uppercase\"><a href=\"#\">&#263;wicz z trenerem</a></h6>\n" +
"                                        </div>\n" +
"\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                                <div class=\"widget-post clearfix\">\n" +
"                                    <div class=\"w3-post-media\"> <img src=\"images/blog/recent-blog/pic3.jpg\" alt=\"\" width=\"200\" height=\"160\"> </div>\n" +
"                                    <div class=\"w3-post-info\">\n" +
"                                        <div class=\"w3-post-header\">\n" +
"                                            <h6 class=\"post-title  text-uppercase\"><a href=\"#\">Trener Personalny</a></h6>\n" +
"                                        </div>\n" +
"\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-md-3 col-sm-6 footer-col-4\">\n" +
"                        <div class=\"widget widget_services\">\n" +
"                            <h4 class=\"m-b15 text-uppercase\">Tagi</h4>\n" +
"                            <div class=\"w3-separator bg-primary\"></div>\n" +
"                             <ul>\n" +
"                                   <a href=\"#\">Trener Personalny</a>\n" +
"                                    <br> <br>\n" +
"                                    <a href=\"#\">Szukam trenera</a>\n" +
"                                    <br> <br>\n" +
"                                   <a href=\"#\">FIT</a>\n" +
"                                     <br> <br>\n" +
"                                    <a href=\"#\">Trener Personalny</a>\n" +
"                                     <br> <br>\n" +
"                                    <a href=\"#\">Szukam trenera</a>\n" +
"                                     <br> <br>\n" +
"                                    <a href=\"#\">FIT</a>\n" +
"                                   \n" +
"                                </ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-md-3 col-sm-6 footer-col-4\">\n" +
"                        <div class=\"widget widget_getintuch\">\n" +
"                            <h4 class=\"m-b15 text-uppercase\">Kontakt</h4>\n" +
"                            <div class=\"w3-separator bg-primary\"></div>\n" +
"                            <ul>\n" +
"                                <li><i class=\"fa fa-map-marker\"></i><strong>email</strong> <a href=\"mailto:biuro@trenerpersonalny.pl\">biuro@trenerpersonalny.pl</a> </li>\n" +
"                                <li><i class=\"fa fa-phone\"></i><strong>infolinia</strong>800 - 100 - 009</li>\n" +
"\n" +
"                            </ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <!-- footer bottom part -->\n" +
"        <div class=\"footer-bottom\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"                    <div class=\"col-md-4 text-left\"> <span>© Copyright 2019</span> </div>\n" +
"                    <div class=\"col-md-4 text-center\"> <span> Trener Personalny </span> </div>\n" +
" \n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </footer>\n" +
"\n" +
"    <button class=\"scroltop fa fa fa-arrow-up\" ></button>\n" +
"</div>\n" +
"<script src=\"js/jquery.min.js\"></script>\n" +
"<script src=\"js/bootstrap.min.js\"></script>\n" +
"<script src=\"js/bootstrap-select.min.js\"></script>\n" +
"<script src=\"js/jquery.bootstrap-touchspin.js\"></script>\n" +
"<script src=\"js/magnific-popup.js\"></script>\n" +
"<script src=\"js/waypoints-min.js\"></script>\n" +
"<script src=\"js/counterup.min.js\"></script>\n" +
"<script src=\"js/imagesloaded.js\"></script>\n" +
"<script src=\"js/masonry-3.1.4.js\"></script>\n" +
"<script src=\"js/masonry.filter.js\"></script>\n" +
"<script src=\"js/owl.carousel.js\"></script>\n" +
"<script src=\"js/custom.js\"></script>\n" +
"<script src=\"js/dz.ajax.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/jquery.themepunch.tools.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/jquery.themepunch.revolution.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.actions.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.carousel.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.kenburn.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.layeranimation.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.migration.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.navigation.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.parallax.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.slideanims.min.js\"></script>\n" +
"<script src=\"plugins/revolution/revolution/js/extensions/revolution.extension.video.min.js\"></script>\n" +
"<script  src=\"js/rev.slider.js\"></script>\n" +
"<script type=\"text/javascript\">\n" +
"jQuery(document).ready(function() {\n" +
"	'use strict';\n" +
"	dz_rev_slider_4();\n" +
"});	/*ready*/\n" +
"</script>\n" +
"</body>\n" +
"</html>" );





            }
            catch (Exception e)
            {
            }
            finally {

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
