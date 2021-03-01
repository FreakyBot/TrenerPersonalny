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



@WebServlet(name="szukaj3", urlPatterns={"/szukaj3"})
public class szukaj3 extends HttpServlet {
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
        
       String id_trener=request.getParameter("id_trener");
    Connection polaczenie;


              try {

  out.write("<!DOCTYPE html>\n" +
"\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\" />\n" +
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
    
      out.write("  if (formularz.imie.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Imie\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      
      
      out.write("   if (formularz.ulica.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nie podano ulicy\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
          out.write("    var WzorTel = /^[0-9]{7,10}$/\n");
            out.write("  if (formularz.nazwisko.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nazwisko\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
            out.write("     var WzorUlica = /^[a-zA-Z]{3,20}$/\n");
      out.write("       var WzorKod = /^[0-9]{2}\\-[0-9]{3}$/;\n");
      
            out.write("  if (formularz.haslo.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Haslo\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      

      
      
      out.write("      if (!WzorKod.test(formularz.kodpocztowy.value))\n");
      out.write("  {\n");
      out.write("    napis += \"Zly format kodu pocztowego 00-000.\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
      
      
      out.write("   if (formularz.numer.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Numer ulicy!!!\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      
      
     out.write("    if (!WzorTel.test(formularz.telefon.value))\n");
      out.write("  {\n");
      out.write("    napis += \"Telefon musi zawierac od 7 do 10 cyfr.\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
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
"						<ul class=\" nav navbar-nav\">\n" +
"							<li ><a href=\"index.jsp\">Strona g&#322;&#243;wna<i class=\"fa fa-chevron-down\"></i></a></li>\n" +
"							<li class=\"active\"> <a href=\"wyszukiwarkal\">Wyszukiwarka<i class=\"fa fa-chevron-down\"></i></a></li>\n" +
"							<li > <a href=\"logowanie.jsp\">Strefa klienta<i class=\"fa fa-chevron-down\"></i></a></li>\n" +
"							<li> <a href=\"logowanie2.jsp\">Strefa trenera<i class=\"fa fa-chevron-down\"></i></a></li>\n" +
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
"                    <h1 class=\"text-white\">Szukaj trenera personalnego</h1>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <!-- inner page banner END -->\n" +
"        <!-- Breadcrumb row -->\n" +
"        <div class=\"breadcrumb-row\">\n" +
"            <div class=\"container\">\n" +
"                <ul class=\"list-inline\">\n" +
"                    <li><a href=\"index.jsp\">Strona g&#322;ówna</a></li>\n" +
"                    <li>Szukaj trenera personalnego</li>\n" +
"                </ul>\n" +
"            </div>\n" +
"        </div>   \n" +
"        ");



          
     Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);         
   
                 Statement sql700;

                sql700=polaczenie.createStatement();
      
      
      ResultSet rs700 = sql700.executeQuery("select trener.imie,trener.nazwisko,trener.telefon,trener.nazwisko,trener.id_trener,miasto.miasto from trener,miasto where trener.id_trener='"+id_trener+"' and trener.id_miasto=miasto.id_miasto ");
      while(rs700.next())  {
  
          
          
       out.write("		\n" +
"		<div class=\"section-full bg-img-fix content-inner-1 bg-dark-1 our-projects-galery\">\n" +
"			<div class=\"container\">\n" +
"				<div class=\"section-head  text-center text-white\">\n" +
"					<h2 class=\"h2\">"+rs700.getString(1)+" "+rs700.getString(2)+"<span> ("+rs700.getString(6)+")</span> tel. "+rs700.getString(3)+"</h2>\n" +
"					<div class=\"w3-separator-outer\">\n" +
"						<div class=\"w3-separator bg-primary style-liner\"></div>\n" +
"					</div>");
        

              
      }        
              

      
       Statement mysql310;
      mysql310=polaczenie.createStatement();
ResultSet rs310 = mysql310.executeQuery("select id_zyciorys,zyciorys,zdjecie from zyciorys where id_trener='"+id_trener+"' ");

    if (rs310.next())
      {
        if (rs310.getString(1).compareTo("")!=0) {




                Statement sql311;

                sql311=polaczenie.createStatement();


ResultSet rs311 = sql311.executeQuery("select id_zyciorys,zyciorys,zdjecie from zyciorys where id_trener='"+id_trener+"'  ");


      while(rs311.next())  {

 
out.write("<p>"+rs311.getString(2)+" </p>\n" +
"				</div>\n" +
"\n" +
"				<!-- Tab panes -->\n" +
"				<div class=\"tab-content\">\n" +
"					<div role=\"tabpanel\" class=\"tab-pane active fade in\">\n" +
"						<div class=\"row\">\n" +
"							<div class=\"col-md-6 col-sm-6\">\n" +
"								<div class=\"text-left text-white\">\n" +
"									<h2 class=\"m-b10\">Atuty</h2>");
        
        
        
        
        Statement mysql400;

mysql400=polaczenie.createStatement();
ResultSet rs400 = mysql400.executeQuery("select id_atuty,atuty from atuty where id_trener='"+id_trener+"' order by atuty");

    if (rs400.next())
      {
        if (rs400.getString(1).compareTo("")!=0) {




                Statement sql401;

                sql401=polaczenie.createStatement();


ResultSet rs401 = sql401.executeQuery("select id_atuty,atuty from atuty where id_trener='"+id_trener+"' order by atuty ");


        
        
        out.write("									<div class=\"w3-separator-outer\">\n" +
"										<div class=\"w3-separator bg-primary style-liner\"></div>\n" +
"									</div>\n" +

"								</div>\n" +
"								<ol class=\"list-num-count text-white\">");
        
      while(rs401.next())  {

      

  out.write("<li>"+rs401.getString(2)+"</li>");
 } 
        
        
               
        
out.write("</ol>");
								
        
        
        
        }
      else
      {

     out.write("\t\t\t\t<br><span>*** BRAK DANYCH ***   </span><br>\n");

        }
        
        
        
      }
        
        
        
        
  
          
          
          
 out.write(" </div>\n" +
"							<div class=\"col-md-6 col-sm-6\">\n" +
"								<div class=\"w3-post-media w3-img-effect zoom-slow m-t20\">\n" +
"									<a href=\"#\"><img src=\"zdjecia/"+rs311.getString(3)+"\" alt=\"\">\n" +
"									</a>\n" +
"								</div>\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"				</div>\n" +
"\n" +
"			</div>\n" +
"		</div>");        
            
          
          

       
       
       
  
      }

      

                       } }
      else
      {


        }

 
              




out.write("        <div class=\"section-full content-area bg-white p-t70 p-b30\">\n" +
"            <!-- Career -->\n" +
"            <div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"                    <!-- Left part start -->\n" +
"                    <div class=\"col-md-9 m-b30\">\n" +
"                        <h1 class=\"m-b20 m-t0\">Si&#322;ownie w kt&#243;rych trener udziela lekcji </h1>\n" +
"                        <div class=\"w3-separator bg-primary\"></div>");



        
        
        
        
        
        
    




 Statement mysql398;





 
   

 
mysql398=polaczenie.createStatement();
ResultSet rs398 = mysql398.executeQuery("select silownia_pracuje.id_silownia_pracuje,silownia.nazwa,miasto.miasto,silownia.ulica,silownia.nr from silownia_pracuje,miasto,silownia where silownia_pracuje.stan='0' and silownia_pracuje.id_trener='"+id_trener+"' and silownia_pracuje.id_silownia=silownia.id_silownia and silownia.id_miasto=miasto.id_miasto");

    if (rs398.next())
      {
        if (rs398.getString(1).compareTo("")!=0) {




                Statement sql399;

                sql399=polaczenie.createStatement();


ResultSet rs399 = sql399.executeQuery("select silownia_pracuje.id_silownia_pracuje,silownia.nazwa,miasto.miasto,silownia.ulica,silownia.nr from silownia_pracuje,miasto,silownia where silownia_pracuje.stan='0' and silownia_pracuje.id_trener='"+id_trener+"' and silownia_pracuje.id_silownia=silownia.id_silownia and silownia.id_miasto=miasto.id_miasto");


  out.write("<ul class=\"list-check-circle primary\">");

              int nr_wiersza=1;


      while(rs399.next())  {

   
          
          
          
          
                        
out.write("                           <li><p>"+ nr_wiersza + ". "+rs399.getString(2)+"  ul. "+rs399.getString(4)+" "+rs399.getString(5)+", "+rs399.getString(3)+" "+rs399.getString(5)+", tel. "+rs399.getString(5)+""
        + ""
        + "</li>");


          

       
       
       
  
       
       
       




      

  nr_wiersza++;
      }


      out.write("</ul>");      
      
      
      
      
                       } }
      else
      {

     out.write("\t\t\t\t<br><span>*** BRAK DANYCH ***   </span><br>\n");

        }


    
    
        
        
out.write("</div>\n" +
"                    <!-- Left part start END -->\n" +
"					\n" +
"					\n" +
"					\n" +
"\n" +
"                    <!-- Right part start END -->\n" +
"                </div>\n" +
"            </div>\n" +
"            <!-- Career END -->\n" +
"        </div>");

    
    
    
    
    
    
    
    
    
    
    
    
    
      


out.write("  \n" +
"			<div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"   ");
        
    
        
  out.write("      \n" +     
        
"                    <!-- Left part start -->\n" +
"                    <div class=\"col-md-12\">\n" +
"                 \n" +
"							<h2>Lista opinii</h2>");

  
  
  
  
          




 Statement mysql800;
 
mysql800=polaczenie.createStatement();
ResultSet rs800 = mysql800.executeQuery("select komentarz.id_komentarz from komentarz where komentarz.id_trener='"+id_trener+"'");

    if (rs800.next())
      {
        if (rs800.getString(1).compareTo("")!=0) {




                Statement sql801;

                sql801=polaczenie.createStatement();


ResultSet rs801 = sql801.executeQuery("select komentarz.id_komentarz,komentarz.komentarz,komentarz.data,klient.imie,klient.nazwisko,komentarz.data from komentarz,klient where komentarz.id_trener='"+id_trener+"' and komentarz.id_klient=klient.id_klient order by komentarz.data desc");







out.write("                                  <div class=\"clear\" id=\"comment-list\">\n" +
"                    <div class=\"comments-area\" id=\"comments\">\n" +
"                     \n" +
"                        <div class=\"p-a30 bg-white\">\n" +
"                            <!-- comment list END -->\n" +
"                            <ol class=\"comment-list\">");



           


      while(rs801.next())  {

     







 out.write("                                     <li class=\"comment\">\n" +
"                                    <div class=\"comment-body\">\n" +
"                                        <div class=\"comment-author vcard\"> <cite class=\"fn\">"+rs801.getString(4)+" "+rs801.getString(5)+"</cite> <span class=\"says\">says:</span> </div>\n" +
"                                        <div class=\"comment-meta\"> <a href=\"#\">"+rs801.getString(6)+"</a> </div>\n" +
"                                        <p>"+rs801.getString(2)+"</p>\n" +
"                                        ");
     

       
       
  
       














 Statement mysql666;
mysql666=polaczenie.createStatement();
ResultSet rs666 = mysql666.executeQuery("select odpowiedz.odpowiedz from odpowiedz where odpowiedz.id_komentarz='"+rs801.getString(1)+"'");

    if (rs666.next())
      {
        if (rs666.getString(1).compareTo("")!=0) {




                Statement sql667;

                sql667=polaczenie.createStatement();


ResultSet rs667 = sql667.executeQuery("select odpowiedz.odpowiedz,trener.imie,trener.nazwisko,zyciorys.zdjecie from odpowiedz,trener,zyciorys where odpowiedz.id_komentarz='"+rs801.getString(1)+"' and odpowiedz.id_trener=trener.id_trener and trener.id_trener=zyciorys.id_trener");


  while(rs667.next())  {

      
      
      
      
      


 out.write("                           \n" +

"                                        <div class=\"comment-author vcard\"> <cite class=\"fn\">Odpowied&#378;: Trener "+rs667.getString(2)+" "+rs667.getString(3)+"</cite> <span class=\"says\">says:</span> </div>\n" +

"                                        <p>"+rs667.getString(1)+"</p>\n" +
"                                        ");
     
  out.write("</div></li>");
      
   
      
  }

      

                       } }
      else
      {

  out.write("</div></li>");

        }











       

      }

        out.println("</table>");
out.write("            </div>\n" );
                       } }
      else
      {

     out.write("\t\t\t\t<br><span>*** BRAK DANYCH ***   </span><br/><br/><br/>\n");

        }











out.write("     </ol>\n" +
"                            <!-- comment list END -->\n" +
"                            <!-- Form -->\n" +
"\n" +
"                            <!-- Form END -->\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div> </div> </div> </div> </div> </div>" );






polaczenie.close();















 
 
    
    
                     

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
