<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE HTML>
<!--객실등록-->
<html>
<head>
<meta charset="UTF-8">
<title>객실등록</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="../assets/css/main.css" />
</head>
<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<a class="logo" href="index.html">Industrious</a>
		<nav>
			<a href="#menu">Menu</a>
		</nav>
	</header>

	<!-- Nav -->
	<nav id="menu">
		<ul class="links">
			<li><a href="index.html">Home</a></li>
			<li><a href="elements.html">Elements</a></li>
			<li><a href="generic.html">Generic</a></li>
		</ul>
	</nav>

	<!-- Heading -->
	<div id="heading">
		<h1>Elements</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">

				<!-- Elements -->
				<div class="row">
					<div class="col-6 col-12-medium">
						   <form action="condoRegistCom" method="post" id="frm" name ="frm" enctype="multipart/form-data" >
                     <h2>객실등록</h2>
                     
                     <table border="1">
                        <tr><td>객실번호</td><td>
                        <input type ="text" name="roomNum" id="roomNum"/><br />
                        ${Using_roomNum}
                        </td></tr>                                                               
                        <tr><td>객실타입</td><td>
                        <select id = "roomType" name = "roomType">
                           <option value ="DR">Double Room</option>
                           <option value ="TR">Twin Room</option>
                           <option value ="FR">family Room</option>
                           <option value ="CR">Connecting Room</option>                           
                        </select>
                        </td></tr>
                        <tr><td>이용요금</td><td>
                        <input type ="text" name ="roomPrice" id = "roomPrice"/>
                        </td></tr>                                          
                        <tr><td>객실사진</td><td>
                        <input type="file" name="roomImage" id ="roomImage" multiple="multiple"><br />
                         ${noImg }  <%-- 이미지가 없을 경우   --%>
                        </td></tr>                                          
                        <tr><td>객실설명</td><td>
                        <textarea cols="20" rows="10" id = "roomDetail" name = "roomDetail" placeholder="상세 입력 "></textarea></td></tr>
                        <tr><td>등록 비밀번호</td>
                        <td><input type ="password"  id ="roomPw" name ="roomPw" placeholder="등록 비밀번호를 정확히 입력하세요."></td></tr>
                        <tr><td>비밀번호 확인</td>                      
                        <td><input type ="password" id ="roomPwCK" name ="roomPwCK" placeholder="비밀번호 확인."></td></tr>
                        <tr><td>              
                        	<input type="submit"  value ="등록">
                        </td>
                        <td>
                        	<input type="reset"  value ="재입력">   
                        </td>
                       </tr>                                          
                        
                     </table>
                  </form>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer id="footer">
		<div class="inner">
			<div class="content">
				<section>
					<h3>Accumsan montes viverra</h3>
					<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing
						gravida odio porttitor sem non mi integer non faucibus ornare mi
						ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien
						lorem accumsan varius montes viverra nibh in adipiscing. Lorem
						ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum.
						Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed
						feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia
						ante nunc ac gravida.</p>
				</section>
				<section>
					<h4>Sem turpis amet semper</h4>
					<ul class="alt">
						<li><a href="#">Dolor pulvinar sed etiam.</a></li>
						<li><a href="#">Etiam vel lorem sed amet.</a></li>
						<li><a href="#">Felis enim feugiat viverra.</a></li>
						<li><a href="#">Dolor pulvinar magna etiam.</a></li>
					</ul>
				</section>
				<section>
					<h4>Magna sed ipsum</h4>
					<ul class="plain">
						<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
			<div class="copyright">
				&copy; Untitled. Photos <a href="https://unsplash.co">Unsplash</a>,
				Video <a href="https://coverr.co">Coverr</a>.
			</div>
		</div>
	</footer>

	<!-- Scripts -->
	<script src="../assets/js/jquery.min.js"></script>
	<script src="../assets/js/browser.min.js"></script>
	<script src="../assets/js/breakpoints.min.js"></script>
	<script src="../assets/js/util.js"></script>
	<script src="../assets/js/main.js"></script>

</body>
</html>