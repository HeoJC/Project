<!doctype html>
<!-- Website Template by freewebsitetemplates.com -->
<html>

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login - Mustache Enthusiast</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/mobile.css" media="screen and (max-width : 568px)">
	<script type="text/javascript" src="js/mobile.js"></script>
	<script src="js/top_bar.js"></script>
	<script src="js/resetInput.js"></script>
	<script src=""></script>
</head>
<%
	String loginRequest = (String)request.getAttribute("loginRequest");
	System.out.println(loginRequest);
%>
<script>
var l = '<%=loginRequest%>';
	window.onload = function () {
		console.log(l);
	}
</script>

<body>
	<div id="header">
		<div id="userInfo"></div>
		<a href="index.html" class="logo">
			<img src="images/logo.jpg" alt="">
		</a>
	</div>
	<div id="body">
		<h1><span>who are they?</span></h1>
		<form action="../LoginServlet" id="loginForm" method="get">
			<input type="text" name="memberID" id="memberID" value="id">
			<input type="password" name="memberPW" id="memberPW" value="password">
			<input type="submit" name="login" id="send" value="log-in">
		</form>
	</div>
	<div id="footer">
		<div>
			<p>&copy; 2023 by Mustacchio. All rights reserved.</p>
			<ul>
				<li>
					<a href="http://freewebsitetemplates.com/go/twitter/" id="twitter">twitter</a>
				</li>
				<li>
					<a href="http://freewebsitetemplates.com/go/facebook/" id="facebook">facebook</a>
				</li>
				<li>
					<a href="http://freewebsitetemplates.com/go/googleplus/" id="googleplus">googleplus</a>
				</li>
				<li>
					<a href="http://pinterest.com/fwtemplates/" id="pinterest">pinterest</a>
				</li>
			</ul>
		</div>
	</div>
</body>

</html>