<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html class="ie6"> <![endif]-->
<!--[if IE 7 ]>    <html class="ie7"> <![endif]-->
<!--[if IE 8 ]>    <html class="ie8"> <![endif]-->
<!--[if IE 9 ]>    <html class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--><html class=""><!--<![endif]-->
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	<title>Bovile</title>

	<%-- jQuery cdn --%>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

	<!-- Standard Favicon -->
	<link rel="icon" type="image/x-icon" href="/images//favicon.ico" />
	
	<!-- For iPhone 4 Retina display: -->
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="/images//apple-touch-icon-114x114-precomposed.png">
	
	<!-- For iPad: -->
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="/images//apple-touch-icon-72x72-precomposed.png">
	
	<!-- For iPhone: -->
	<link rel="apple-touch-icon-precomposed" href="/images//apple-touch-icon-57x57-precomposed.png">
	
	<!-- Library Css -->
	<link rel="stylesheet" type="text/css" href="/libraries/lib.css">
	
	<!-- Font Icons -->
	<!--link rel="stylesheet" type="text/css" href="libraries/fonts/open-iconic-bootstrap.min.css"-->

	<!-- Custom - Common CSS -->
	<link rel="stylesheet" type="text/css" href="/css/plugins.css">
	<link rel="stylesheet" type="text/css" href="/css/navigation-menu.css">

	<!-- Custom - Theme CSS -->
	<link rel="stylesheet" type="text/css" href="resources/style.css">
	<link rel="stylesheet" type="text/css" href="resources/css/shortcodes.css">
	
	<!--[if lt IE 9]>
		<script src="/js/html5/respond.min.js"></script>
    <![endif]-->
</head>
<style>
	.del_btn {
		float: right;
		margin-right: 10px;
		width: 25px;
		height: 25px;
	}

	.panel input[type="text"] {
		outline: none;
		border-width: 0;
		background-color: #1f8bf3;
	}
	.panel-collapse input[type="text"] {
		outline: none;
		border-width: 0;
	}
	.collapsed input[type="text"] {
		background-color: #fafafa;
	}
</style>
<script>
	let editFlag = false;

	function delFaq(id) {
		$.ajax({
			url:"/skr/deleteFaq",
			type:"GET",
			dataType:"TEXT",
			data:id,
			success:function (data) {
				alert("삭제 완료");
			},
			error:function (xhr) {
				alert(id+" ID를 삭제하는데 실패했습니다. : "+xhr.status);
				console.log(id+" ID를 삭제하는데 실패했습니다. : "+xhr.status);
			}
		});
	}
	function editFaq(id) {
		$("#"+id).click();
		$("#"+id).prop("readonly", false);
		$("#"+id+"_c").prop("readonly", false);

		if(editFlag) {
			$.ajax({
				url:"/skr/updateFaq",
				type:"POST",
				data:JSON.stringify({
					"title":$("#"+id).val(),
					"content":$("#"+id+"_c").val()
				}),
				success:function (result) {
					alert("수정 완료");
					editFlag = false;
				},
				error:function (xhr) {
					alert("다시시도 해주세요. : "+xhr.status);
					console.log("수정 실패 : "+xhr.status);
					editFlag = false;
				},
			});
		}
		editFlag = true;
	}
</script>
<body data-offset="200" data-spy="scroll" data-target=".ow-navigation">
	<!-- Loader -->
	<div id="site-loader" class="load-complete">
		<div class="loader">
			<div class="loader-inner ball-clip-rotate">
				<div></div>
		   </div>
		</div>
	</div><!-- Loader /- -->
	
	<!--a id="top"></a-->
	<!-- Main Container -->
	
	<!-- Header -->
	<header class="header-main container-fluid no-padding">	
		<!-- Top Header  -->
		<div class="top-header container-fluid no-padding">
			<!-- Container -->
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-sm-4 col-xs-6 social">
						<ul>
							<li><a href="#" title="Facebook"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#" title="Twitter"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#" title="Google Plus"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#" title="Linked In"><i class="fa fa-linkedin"></i></a></li>
						</ul>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 add-to-cart">
						<ul>
							<li><a href="#" title="Add To Cart"><i class="fa fa-shopping-cart"></i><span>1</span></a></li>
							<li><a href="#" title="My Account"><i class="fa fa-user"></i></a></li>
						</ul>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-12 logo-block">
						<a href="index.html" title="Logo"><img src="/images/logo.png" alt="Logo" /></a>
					</div>
				</div>
			</div><!-- Container /- -->
		</div><!-- Top Header /- -->
		
		<!-- Menu Block -->
		<div class="menu-block container-fluid no-pdding">
			<!-- Container -->
			<div class="container">
				<!-- Search Box -->
				<div class="search-box">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Search Here . . . ">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
						</span>
					</div><!-- /input-group -->
				</div><!-- Search Box /- -->
				<!-- Navigation -->
				<nav class="navbar ow-navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="index.html" title="Logo">Bovile</a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li><a href="index.html" title="Home">Home</a></li>
							<li><a href="2-about.html" title="About Us">About Us</a></li>
							<li><a href="3-services.html" title="Services">Services</a></li>
							<li class="dropdown active">
								<a href="#" title="Pages" class="dropdown-toggle" role="button" aria-haspopup="true" aria-expanded="false">Pages</a>
								<i class="ddl-switch fa fa-angle-down"></i>
								<ul class="dropdown-menu">	
									<li><a href="4-gallery.html" title="Gallery">Gallery</a></li>
									<li><a href="6-pricing.html" title="Pricing">Pricing</a></li>
									<li><a href="7-faq.html" title="Faq">FAQ</a></li>
									<li><a href="10-404.html" title="404">404</a></li>
								</ul>
							</li>
							<li><a href="#" title="Our Team">Shop</a></li>
							<li class="dropdown">
								<a href="8-blog.html" title="Latest News" class="dropdown-toggle" role="button" aria-haspopup="true" aria-expanded="false">Latest News</a>
								<i class="ddl-switch fa fa-angle-down"></i>
								<ul class="dropdown-menu">	
									<li><a href="8-blog.html" title="Blog">Blog</a></li>
									<li><a href="9-blog-post.html" title="Single Post">Single</a></li>
								</ul>
							</li>							
							<li><a href="11-contact-us.html" title="Contact Us">Contact Us</a></li>
						</ul>						
					</div>
				</nav><!-- Navigation -->
			</div><!-- Container /- -->
		</div><!-- Menu Block /- -->
	</header><!-- Header /- -->
	
	<main class="site-main page-spacing">
		<!-- Page Banner -->
		<div class="page-banner faq-banner container-fluid no-padding">
			<div class="page-banner-content">
				<div class="container">
					<h3>Frequently Asked Questions</h3>
					<p>You wanna be where you can see our troubles are all the same you wanna be where everybody knows Your name days are all share them with me oh baby are the voyages of the Starship Enterprise</p>
				</div>
			</div>
			<div class="banner-content container-fluid no-padding">
				<div class="container">
					<h4 class="pull-left">Regular Queries</h4>
					<ol class="breadcrumb pull-right">
						<li><a href="#">Home</a></li>
						<li><a href="#">Pages</a></li>
						<li class="active">FAQ</li>
					</ol>
				</div>
			</div>
		</div><!-- Page Banner /- -->
		
		<!-- Faq Section -->
		<div class="faq-section container-fluid no-padding">
			<div class="section-padding"></div>
			<!-- Container -->
			<div class="container">
				<div class="row">
					<!-- Content Area /- -->
					<div class="content-area content-area75 col-md-9 col-sm-8">
						<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
							<c:forEach var="faq" items="${faqContent}">
								<div class="panel panel-default">
									<div class="panel-heading" role="tab">
										<h4 class="panel-title">
											<a role="button" data-toggle="collapse" data-parent="#accordion" href="#faqcontent1" aria-expanded="true" aria-controls="collapseOne">
												<input id="${faq.faqId}" type="text" value="${faq.title}" readonly>
												<button class="del_btn" onclick="delFaq('${faq.faqId}')">X</button>
												<button class="edit_btn" onclick="editFaq('${faq.faqId}')">E</button>
											</a>
										</h4>
									</div>
									<div class="panel-collapse collapse in" role="tabpanel" aria-labelledby="faqheading1">
										<div class="panel-body">
											<input id="${faq.faqId}_c" type="text" value="${faq.content}" readonly>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div><!-- Content Area /- -->
					
					<!-- Widget Area -->
					<div class="widget-area widget-area22 col-md-3 col-sm-4">
						<aside class="widget widget-search">
							<div class="input-group">
								<input type="text" class="form-control" placeholder="Search . . .">
								<span class="input-group-btn">
									<button class="btn btn-search" type="button"><i class="fa fa-search"></i></button>
								</span>
							</div>
						</aside>
						<aside class="widget widget-catagories">
							<h3 class="widget-title">categories</h3>
							<ul>
								<li><a href="#" title="Fishing Camp">Fishing Camp<span>09</span></a></li>
								<li><a href="#" title="Holiday Adventures">Holiday Adventures<span>10</span></a></li>
								<li><a href="#" title="Fishing Equipments">Fishing Equipments<span>07</span></a></li>
								<li><a href="#" title="Inter Club Meets">Inter Club Meets<span>11</span></a></li>
								<li><a href="#" title="Fishing Techniques">Fishing Techniques<span>13</span></a></li>
								<li><a href="#" title="Purchase Section">Purchase Section<span>07</span></a></li>
							</ul>
						</aside>
						<aside class="widget widget-latestposts">
							<h3 class="widget-title">Latest Posts</h3>
							<div class="latest-content">
								<a href="9-blog-post.html"><img src="/images/blog/latest-post1.jpg" alt="blogpost-thumb1"></a>
								<h3><a href="9-blog-post.html">Goodness lemur save much alas crud dear</a></h3>
								<span>09 Oct 2015</span>
							</div>
							<div class="latest-content">
								<a href="9-blog-post.html"><img src="/images/blog/latest-post2.jpg" alt="blogpost-thumb2"></a>
								<h3><a href="9-blog-post.html">However much enor mous merrily jeez</a></h3>
								<span>22 Nov 2015</span>
							</div>
							<div class="latest-content">
								<a href="9-blog-post.html"><img src="/images/blog/latest-post3.jpg" alt="blogpost-thumb3"></a>
								<h3><a href="9-blog-post.html">Flinched more mam moth this pompously</a></h3>
								<span>04 Dec 2015</span>
							</div>
						</aside>
						<aside class="widget widget-tag">
							<h3 class="widget-title">Populer tags</h3>
							<div class="tags">
								<a href="#" title="Fishing">Fishing</a>
								<a href="#" title="Lure">Lure</a>
								<a href="#" title="Holiday">Holiday</a>
								<a href="#" title="Camping">Camping</a>
								<a href="#" title="Shopping">Shopping</a>
								<a href="#" title="Clubs">Clubs</a>
								<a href="#" title="Equipments">Equipments</a>
								<a href="#" title="Adventures">Adventures</a>
							</div>
						</aside>
					</div><!-- Widget Area /- -->
				</div>
			</div><!-- Container / -->
			<div class="section-padding"></div>
		</div><!-- Faq Section / -->
		
	</main>
	
	<!-- Footer Main -->
	<footer class="footer-main container-fluid no-padding">
		<!-- Container -->
		<div class="container">
			<div class="row">				
				<!-- Footer Location Widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<aside class="ftr-widget location-widget">
						<h3 class="widget-title"><i><img src="/images/ftr-location.png" alt="Location" /></i><span>Address</span></h3>
						<p>09 Design Street, Downtown, Bovile, Victoria, Australia</p>
					</aside>
				</div><!-- Footer Location Widget /- -->
				<!-- Footer Phone Widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<aside class="ftr-widget phone-widget">
						<h3 class="widget-title"><i><img src="/images/ftr-phone.png" alt="Location" /></i><span>Call Us</span></h3>
						<p><a href="tel:+9112345678" title="+9112345678">Mobile : +91 123 456 78</a>
						<a href="tel:+9112345688" title="+9112345688">Toll free : +91 123 456 88</a></p>
					</aside>
				</div><!-- Footer Phone Widget /- -->
				<!-- Footer Mail Widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<aside class="ftr-widget mail-widget">
						<h3 class="widget-title"><i><img src="/images/ftr-email.png" alt="Location" /></i><span>email us</span></h3>
						<p><a href="mailto:info@ourdomain.com" title="Info@OurDomain.Com" >Info@OurDomain.Com</a>
						<a href="mailto:support@ourdomain.com" title="Support@OurDomain.Com">Support@OurDomain.Com</a></p>
					</aside>
				</div><!-- Footer Mail Widget /- -->
				<!-- Footer Hours Widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<aside class="ftr-widget hours-widget">
						<h3 class="widget-title"><i><img src="/images/ftr-hours.png" alt="Location" /></i><span>working hours</span></h3>
						<p><span>Mon-Sat : 9:00 AM To 5:00 PM</span><span>Sun : 9:00 AM To 2:00 PM</span></p>
					</aside>
				</div><!-- Footer Hours Widget /- -->				
			</div>
			<!-- Footer About Widget -->
			<aside class="col-md-8 col-sm-6 col-xs-12 ftr-widget about-widget">
				<h3 class="widget-title">we are fishing</h3>
				<p>Beats all you've ever saw been in trouble with the law since the day they was born. Believe it or not I'm walking on air. I never thought I could feel so free.</p>
			</aside><!-- Footer About Widget /- -->
			<!-- Footer Newsleater Widget -->
			<aside class="col-md-4 col-sm-6 col-xs-12 ftr-widget newsleater-widget">
				<h3 class="widget-title">subscribe newsletter</h3>
				<!-- Search Box -->
				<div class="search-box">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Email Address">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button" title="Go">Go</button>
						</span>
					</div><!-- /input-group -->
				</div><!-- Search Box /- -->
			</aside><!-- Footer Newsleater Widget /- -->
			
			
			<!-- Footer Bottom -->
			<div class="footer-bottom col-md-12 col-sm-12 col-xs-12 no-padding">
				<div class="row">
					<div class="col-md-5 col-sm-5 col-xs-6 copyright">
						<p>&copy; Copyright 2016. All Rights Reserved</p>
					</div>
					<div class="col-md-7 col-sm-7 col-xs-6">
						<ul>
							<li><a href="#" title="Facebook"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#" title="Twitter"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#" title="Google Plus"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#" title="Linked In"><i class="fa fa-linkedin"></i></a></li>
						</ul>
					</div>
				</div>
			</div><!-- Footer Bottom /- -->
		</div><!-- Container /- -->
	</footer><!-- Footer Main /- -->
	
	<!-- JQuery v1.11.3 -->
	<script src="/js/jquery.min.js"></script>
	
	<!-- Library Js -->
	<script src="/libraries/lib.js"></script>
	
	<!-- Library - Google Map API -->
	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
	
	<!-- Library - Theme JS -->
	<script src="/js/functions.js"></script>
</body>
</html>