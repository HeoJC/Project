<!doctype html>
<!-- Website Template by freewebsitetemplates.com -->
<html>

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Gallery - Mustache Enthusiast</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/mobile.css" media="screen and (max-width : 568px)">
	<script type="text/javascript" src="js/mobile.js"></script>
	<script src="js/top_bar.js"></script>
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
		<ul id="navigation">
			<li class="selected">
				<a href="gallery.html">gallery</a>
			</li>
			<li>
				<a href="contact.html">contact</a>
			</li>
		</ul>
	</div>

	<div id="body" class="goodsList">
		<!-- <div><h1><span>ㅎㅇ</span></h1></div> -->

		<div id="leftiFrameDiv">
			<iframe id="leftiFrame" name="leftiFrame" src="leftiFrame.html" frameborder="0" width="20%"
				height="900px"></iframe>
		</div>

		<div id="rightiFrameDiv">
			<iframe id="rightiFrame" name="rightiFrame" src="" frameborder="0" width="77%" height="900px"></iframe>
		</div>


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