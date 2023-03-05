<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>500页面</title>
<link rel="stylesheet" href="js/layui/css/layui.css">
<style type="text/css">
body {
	height: 100vh;
	/* 加载背景图 */
	background-image: url(imgs/500.png); 
	/* 背景图垂直、水平均居中 */
	background-position: center center;
	/* 背景图不平铺 */
	background-repeat: no-repeat;
	/* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */
	background-attachment: fixed;
	/* 让背景图基于容器大小伸缩 */
	background-size: cover;
	/* 设置背景颜色，背景图加载过程中会显示背景色 */
	background-color: #464646;
}
</style>
</head>
<body>
	<%
	String contextPath = request.getContextPath();
	%>
	<div class="layui-fluid">
		<div class="layui-row">
			<div
				class="layui-col-sm4 layui-col-md4 layui-col-lg4 layui-col-md-offset4">
			</div>
		</div>
	</div>
	<script src="js/layui/layui.js"></script>
	<script src="js/jquery-3.6.3.min.js"></script>
	
</body>
</html>
