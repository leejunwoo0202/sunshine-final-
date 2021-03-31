<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../include/include.jsp"%>
<!DOCTYPE HTML>
<!--객실 리스트-->
<html>
<head>
<meta charset="UTF-8">
<title>Industrious by TEMPLATED</title>

<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="../../assets/css/main.css" />
</head>
<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<a class="logo" href="index.html">Industrious</a>
		<nav>
			<a href="#menu">Menu</a>
		</nav>
	</header>




	<!--  메뉴 -->


	<!-- Nav -->
	<nav id="menu">
		<ul>
			<li><a href="/">Home</a></li>
			<li><a href="/signUp">회원가입</a></li>
			<li><a href="generic.html">Generic</a></li>
			<li><a href="/member/login.do">로그인</a>
			<li><a href="/condo/condoMain">콘도</a>
			<li><a href="#">레스토랑</a>
			<li><a href="#">프렌즈샵</a>
			<li><a href="#">리프트권</a>
		</ul>
	</nav>



	<!--  메뉴 -->



	<!-- Banner -->
	<section id="banner">
		<div class="inner">
			<h1>SunShine</h1>
			<p>
				A responsive business oriented template with a video background<br />
				designed by <a href="https://templated.co/">TEMPLATED</a> and
				released under the Creative Commons License.
			</p>
		</div>
		<video autoplay loop muted playsinline src="../images/banner.mp4"></video>
	</section>

	<!-- Highlights -->

	<section class="wrapper">
		<div class="inner">
			<header class="special">
				<h2>객실 상세</h2>

			</header>
<!-- 			<div class="highlights"> -->
<!-- 				<section> -->
					<form:form action="/condo/roomModify" onsubmit="return roomPwCk();"
						name="frm" method="post" modelAttribute="condoCommand"
						enctype="multipart/form-data">
						<table border="1">
							<tr>
								<td width="0%">객실 번호</td>
								<td width="20%">객실 타입</td>
								<td width="10%">요금</td>
								<td width="20%">상세</td>
								<td width="45%">이미지</td>
							</tr>
							<c:forEach var="room" items="${list }">
								<tr>
									<td>${room.roomNum } <input type="hidden" name="roomNum"
										value="${room.roomNum }" />
									</td>
									<td><c:if test="${room.roomType == 'DR' }">
										Double Room
									</c:if> <c:if test="${room.roomType == 'TR' }">
										Twin Room
									</c:if> <c:if test="${room.roomType == 'FR' }">
										Family Room
									</c:if> <c:if test="${room.roomType == 'CR' }">
										Connecting Room
									</c:if><br /> <select id="roomType" name="roomType">
											<option value="${room.roomType}">수정할 객실 타입</option>
											<option value="DR">Double Room</option>
											<option value="TR">Twin Room</option>
											<option value="FR">Family Room</option>
											<option value="CR">Connecting Room</option>
									</select> <%-- 			                        <input type="hidden" name="roomType" value="EL{room.roomType }"> --%>
										<form:errors path="roomType"></form:errors></td>
									<td><form:input path="roomPrice" value="${room.roomPrice}"/></td>
									<td><form:input path="roomDetail"
											value="${room.roomDetail}" /></td>
									<td><c:forTokens items="${room.roomImage }" delims="`"
											var="img" varStatus="status">
											<!--  
							<img alt="img" src="WEB-INF/view/condo/upload/${img }" />
							-->
											<img alt="img" src="/condo/upload/${img }" width="250px"
												height="250px" />
											<!-- 										<input type="file" name="roomImg" multiple="multiple" /> -->
										</c:forTokens></td>
								</tr>
							</c:forEach>
						</table>
						<a href="../roomList"><input type="button" value="리스트로 "></a>  &nbsp;&nbsp;&nbsp;
<%-- 			<a href ="../roomModify?roomNum=${list.get(0).roomNum }"> 수정 </a>  &nbsp;&nbsp;&nbsp; --%>
						<input type="submit" value="수정" />&nbsp;&nbsp;&nbsp;
				<input type="button" value="삭제 " onclick="roomDel();">  &nbsp;&nbsp;&nbsp;<br/>						
<!-- 				<input type="password" id="roomPw" name ="roomPw" placeholder="비밀번호를 입력하세요"/><br /> -->
						<form:password id="roomPw" path="roomPw" placeholder="비밀번호를 입력하세요" />
						<br />
						<form:errors path="roomPw"></form:errors>${PwErr }
					
				</form:form>
				
<!-- 				</section> -->
<!-- 			</div> -->
		</div>
	</section>

	<!-- CTA -->
	<section id="cta" class="wrapper">
		<div class="inner">
			<h2>Curabitur ullamcorper ultricies</h2>
			<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing
				gravida odio porttitor sem non mi integer non faucibus ornare mi ut
				ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien
				lorem accumsan varius montes viverra nibh in adipiscing. Lorem ipsum
				dolor vestibulum ante ipsum primis in faucibus vestibulum. Blandit
				adipiscing eu felis iaculis volutpat ac adipiscing sed feugiat eu
				faucibus. Integer ac sed amet praesent. Nunc lacinia ante nunc ac
				gravida.</p>
		</div>
	</section>

	<!-- Testimonials -->
	<section class="wrapper">
		<div class="inner">
			<header class="special">
				<h2>Faucibus consequat lorem</h2>
				<p>In arcu accumsan arcu adipiscing accumsan orci ac. Felis id
					enim aliquet. Accumsan ac integer lobortis commodo ornare aliquet
					accumsan erat tempus amet porttitor.</p>
			</header>
			<div class="testimonials">
				<section>
					<div class="content">
						<blockquote>
							<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
								adipiscing gravida odio porttitor sem non mi integer non
								faucibus.</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="../images/pic01.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>Jane Doe</strong> <span>CEO - ABC Inc.</span>
							</p>
						</div>
					</div>
				</section>
				<section>
					<div class="content">
						<blockquote>
							<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
								adipiscing gravida odio porttitor sem non mi integer non
								faucibus.</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="../images/pic03.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>John Doe</strong> <span>CEO - ABC Inc.</span>
							</p>
						</div>
					</div>
				</section>
				<section>
					<div class="content">
						<blockquote>
							<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
								adipiscing gravida odio porttitor sem non mi integer non
								faucibus.</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="../images/pic02.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>Janet Smith</strong> <span>CEO - ABC Inc.</span>
							</p>
						</div>
					</div>
				</section>
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

	<script type="text/javascript">
		function roomPwCk(){
			if(document.getElementById('roomPw').value.trim() == ""){
				alert("비밀번호를 입력하세요");
				document.getElementById('roomPw').focus();
				return false
			}
		}
		function roomDel(){
			if(confirm('객실을 삭제하시겠습니까?')){
				if(document.getElementById('roomPw').value.trim() == ""){
					alert("비밀번호를 입력하세요");
					document.getElementById('roomPw').focus();
					return false
				}else{
					 document.frm.action = "/condo/roomDel";
				     frm.submit();
				}
			}
		}
			
	</script>
</body>
</html>