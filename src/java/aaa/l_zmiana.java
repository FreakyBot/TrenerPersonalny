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


@WebServlet(name="l_zmiana", urlPatterns={"/l_zmiana"})
public class l_zmiana extends HttpServlet {
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
    Connection polaczenie;


              try {

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
     
      out.write(" \n");
      out.write(" \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      
      
         
        out.write("function przetwarzajj_dane (){\n");
      out.write("  var brakuje_danych = false;\n");
      out.write("  var formularz = document.forms[0];\n");
      out.write("  var napis = \"\";\n");
      out.write("\n");

      
   
      
      
       out.write("   if (formularz.haslo.value==formularz.haslo2.value )\n");
      out.write("  {\n");

      out.write("  }   else{           \n");
      
            out.write("    napis += \"Podane hasla nie sa identyczne\\n\"\n");
      out.write("    brakuje_danych = true;}\n");
      
      out.write("\n");
      
      
 
      
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
     out.write("<li><a  href=\"l_zapytania?id_user=");
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

out.write("<li class=\"active\" ><a  href=\"l_zmiana?id_user=");
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
"                    <h1 class=\"text-white\">Zmiana has&#322;a</h1>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <!-- inner page banner END -->\n" +
"        <!-- Breadcrumb row -->\n" +
"        <div class=\"breadcrumb-row\">\n" +
"            <div class=\"container\">\n" +
"                <ul class=\"list-inline\">\n" +
"                    <li>Zmiana has&#322;a</li>");
        
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
"   ");
        
    
        
  out.write("      \n" +     
        
"                    <!-- Left part start -->\n" +
"                    <div class=\"col-md-8\">\n" +
"                        <div class=\"p-a30 bg-gray clearfix m-b30 \">\n" +
"							<h2>Zmiana has&#322;a</h2>\n" +
"							\n" +
"							<form action='l_zmiana2' method='post' onsubmit=\"return przetwarzajj_dane()\">\n" +
"						\n" +
"                                <div class=\"row\">\n" +
"                                    <div class=\"col-md-6\">\n" +
"                                     \n" +
"                                            \n" +
"                                          <div class=\"form-group\">\n" +
"                                            <div class=\"input-group\">\n" +
"                                            <label for=\"name\"> Nowe has&#322;o</label>    <input   class=\"form-control\" type=\"password\" name='haslo' >\n" +
"                                            </div>\n" +
"                                        </div>\n");
       
out.write("                                         \n" +
"                                  \n" +
"                                    </div>\n" +

        "                                    <div class=\"col-md-6\">\n" +
"                                     \n" +
"                                            \n" +
"                                          <div class=\"form-group\">\n" +
"                                            <div class=\"input-group\">\n" +
"                                            <label for=\"name\">Powtórz has&#322;o</label>    <input   class=\"form-control\" type=\"password\" name='haslo2' >\n" +
"                                            </div>\n" +
"                                        </div>\n");
        
        
        
   out.print("<input  type='hidden' name='id_user' value='"+request.getParameter("id_user")+"'>");      
        
        
        
out.write("                                         \n" +
"                                  \n" +
"                                    </div>\n" +
        
        
        
        
       
        
        
        
        
"	\n" +
"                                    <div class=\"col-md-12\">\n" +
"                                        <button  type=\"submit\" class=\"site-button \"> <span>Dalej</span> </button>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </form>\n" +
"                        </div>\n" +
"                    </div>\n" +
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
