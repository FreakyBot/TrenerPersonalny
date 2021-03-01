
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-2" />
<meta name="format-detection" content="telephone=no">
<!-- Favicons Icon -->
<link rel="icon" href="images/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" type="http://inshape.w3itexperts.com/xhtml/image/x-icon" href="images/favicon.png" />
<title>Znany Trener</title> 
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/fontawesome/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-select.min.css">
<link rel="stylesheet" type="text/css" href="css/magnific-popup.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link class="skin"  rel="stylesheet" type="text/css" href="css/skin/skin-6.css">
<link  rel="stylesheet" type="text/css" href="css/templete.css">
<link rel="stylesheet" type="text/css" href="plugins/revolution/revolution/css/settings.css">
<link rel="stylesheet" type="text/css" href="plugins/revolution/revolution/css/navigation.css">
<link href="../../https@fonts.googleapis.com/css@family=Open+Sans_3A300,400,600,700,800_7CPoppins_3A300,400,500,600,700_7CRoboto_3A100,300,400,500,700,900" rel="stylesheet">


<script type="text/javascript">
function przetwarzajj_dane (){
  var brakuje_danych = false;
  var formularz = document.forms[0];
  var napis = "";
    if (formularz.haslo.value== "")
  {
    napis += "Hasło !\n"
    brakuje_danych = true;
  }
 var WzorMaila = /^[0-9a-z_.-]+@[0-9a-z.-]+\.[a-z]{2,3}$/i
    if (!WzorMaila.test(formularz.email.value))
  {
    napis += "Adres email !\n"
    brakuje_danych = true;
  }
  if (!brakuje_danych)
    return true;
  else{
     alert ("Formularz zawiera bledy:\n" + napis);
    return false;
  }
}
</script>

</head>
<body id="bg">
<div class="page-wraper"><div id="loading-area"></div>
    <!-- Header -->
	<header class="site-header header-style-5 dark">
		<!-- main header -->
		<div class="sticky-header main-bar-wraper">
			<div class="main-bar clearfix ">
				<div class="container clearfix">
					<!-- website logo -->
					<div class="logo-header mostion">
						<a href="index.jsp">
							<img src="images/logo6.png" width="193" height="89" alt="">
						</a>
					</div>
					<!-- nav toggle button -->
					<button data-target=".header-nav" data-toggle="collapse" type="button" class="navbar-toggle collapsed">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>						
					</button>
					<!-- extra nav -->
	
					<!-- Quik search -->

					<!-- main nav -->
					<div class="header-nav navbar-collapse collapse">
						<ul class=" nav navbar-nav">
							<li ><a href="index.jsp">Strona główna<i class="fa fa-chevron-down"></i></a></li>
							<li> <a href="wyszukiwarkal">Wyszukiwarka<i class="fa fa-chevron-down"></i></a></li>
							<li class="active"> <a href="logowanie.jsp">Strefa klienta<i class="fa fa-chevron-down"></i></a></li>
							<li> <a href="logowanie2.jsp">Strefa trenera<i class="fa fa-chevron-down"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- main header END -->
	</header>
    <!-- Header END -->
    <!-- Content -->
    <div class="page-content">
        <!-- Slider -->

        
        
             <div class="w3-bnr-inr overlay-black-middle" style="background-image:url(images/background/bg1.jpg);">
            <div class="container">
                <div class="w3-bnr-inr-entry">
                    <h1 class="text-white">Logowanie</h1>
                </div>
            </div>
        </div>
        <!-- inner page banner END -->
        <!-- Breadcrumb row -->
        <div class="breadcrumb-row">
            <div class="container">
                <ul class="list-inline">
                    <li><a href="index.jsp">Strona główna</a></li>
                    <li>Strerfa klienta</li>
                </ul>
            </div>
        </div>   
        
 
        
        
         <div class="section-full content-inner bg-white contact-style-1">
			<div class="container">
                <div class="row">
                    
                    
                    
                                              <div class="section-content">
                        <div class="alert alert-danger"> <strong><i class="fa fa-warning"></i>Uwaga!</strong> Hasło dla adrese email <b> <%= session.getAttribute("email") %> </b> jest NIEPOPRAWNE.

                        </div>
                    </div> 
        
                    
                    
                    <!-- Left part start -->
                    <div class="col-md-8">
                        <div class="p-a30 bg-gray clearfix m-b30 ">
							<h2>Logowanie</h2>
							
							<form action="logowanie2" method="POST" onsubmit="return przetwarzajj_dane()">
						
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <div class="input-group">
                                                <input   class="form-control" type="text" name="email" placeholder="Adres email">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <div class="input-group"> 
				 <input  class="form-control" type="password" name="haslo" placeholder="Haslo" >
                                            </div>
                                        </div>
                                    </div>
			
		
	
                                    <div class="col-md-12">
                                        <button  type="submit" class="site-button "> <span>Dalej</span> </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <!-- Left part END -->
                    <!-- right part start -->

                    <!-- right part END -->
                </div>

            </div>
        </div>



	
		<!-- Testimonials END -->
    </div>
    <!-- Content END-->
	<!-- Footer -->
    <footer class="site-footer">
        <div class="footer-top">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6 footer-col-4">
                        <div class="widget widget_about">
                            <div class="logo-footer"><img src="images/footer-logo.png" alt=""></div>
                            <p class="m-tb20"><strong>Trener Personalny</strong> - szukasz trenera personalnego? - Dobrze trafiłeś, Nasz system pozwala na znalezienie trenerów personalnych</p>
                            <ul class="w3-social-icon border w3-social-icon-lg">
                                <li><a href="javascript:void(0);" class="fa fa-facebook fb-btn"></a></li>
                                <li><a href="javascript:void(0);" class="fa fa-twitter tw-btn"></a></li>
                                <li><a href="javascript:void(0);" class="fa fa-linkedin link-btn"></a></li>
                                <li><a href="javascript:void(0);" class="fa fa-pinterest-p pin-btn"></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 footer-col-4">
                        <div class="widget recent-posts-entry">
                            <h4 class="m-b15 text-uppercase">gALERIA</h4>
                            <div class="w3-separator bg-primary"></div>
                            <div class="widget-post-bx">
                                <div class="widget-post clearfix">
                                    <div class="w3-post-media"> <img src="images/blog/recent-blog/pic1.jpg" alt="" width="200" height="143"> </div>
                                    <div class="w3-post-info">
                                        <div class="w3-post-header">
                                            <h6 class="post-title text-uppercase"><a href="#">Ruch to zdrowie</a></h6>
                                        </div>

                                    </div>
                                </div>
                                <div class="widget-post clearfix">
                                    <div class="w3-post-media"> <img src="images/blog/recent-blog/pic2.jpg" alt="" width="200" height="160"> </div>
                                    <div class="w3-post-info">
                                        <div class="w3-post-header">
                                            <h6 class="post-title text-uppercase"><a href="#">Ćwicz z trenerem</a></h6>
                                        </div>

                                    </div>
                                </div>
                                <div class="widget-post clearfix">
                                    <div class="w3-post-media"> <img src="images/blog/recent-blog/pic3.jpg" alt="" width="200" height="160"> </div>
                                    <div class="w3-post-info">
                                        <div class="w3-post-header">
                                            <h6 class="post-title  text-uppercase"><a href="#">Trener Personalny</a></h6>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 footer-col-4">
                        <div class="widget widget_services">
                            <h4 class="m-b15 text-uppercase">Tagi</h4>
                            <div class="w3-separator bg-primary"></div>
                             <ul>
                                    <li><a href="#">Trener Personalny</a>
                                    </li>
                                    <li><a href="#">Szukam trenera</a>
                                    </li>
                                    <li><a href="#">FIT</a>
                                    </li>
                                    <li><a href="#">Trener Personalny</a>
                                    </li>
                                    <li><a href="#">Szukam trenera</a>
                                    </li>
                                    <li><a href="#">FIT</a>
                                    </li>
                                </ul>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 footer-col-4">
                        <div class="widget widget_getintuch">
                            <h4 class="m-b15 text-uppercase">Kontakt</h4>
                            <div class="w3-separator bg-primary"></div>
                            <ul>
                                <li><i class="fa fa-map-marker"></i><strong>email</strong> <a href="mailto:biuro@trenerpersonalny.pl">biuro@trenerpersonalny.pl</a> </li>
                                <li><i class="fa fa-phone"></i><strong>infolinia</strong>800 - 100 - 009</li>

                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- footer bottom part -->
        <div class="footer-bottom">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 text-left"> <span>© Copyright 2019</span> </div>
                    <div class="col-md-4 text-center"> <span> Trener Personalny </span> </div>
 
                </div>
            </div>
        </div>
    </footer>

    <button class="scroltop fa fa fa-arrow-up" ></button>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-select.min.js"></script>
<script src="js/jquery.bootstrap-touchspin.js"></script>
<script src="js/magnific-popup.js"></script>
<script src="js/waypoints-min.js"></script>
<script src="js/counterup.min.js"></script>
<script src="js/imagesloaded.js"></script>
<script src="js/masonry-3.1.4.js"></script>
<script src="js/masonry.filter.js"></script>
<script src="js/owl.carousel.js"></script>
<script src="js/custom.js"></script>
<script src="js/dz.ajax.js"></script>
<script src="plugins/revolution/revolution/js/jquery.themepunch.tools.min.js"></script>
<script src="plugins/revolution/revolution/js/jquery.themepunch.revolution.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.actions.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.carousel.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.kenburn.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.migration.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.parallax.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
<script src="plugins/revolution/revolution/js/extensions/revolution.extension.video.min.js"></script>
<script  src="js/rev.slider.js"></script>
<script type="text/javascript">
jQuery(document).ready(function() {
	'use strict';
	dz_rev_slider_4();
});	/*ready*/
</script>
</body>
</html>
