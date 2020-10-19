<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<h1>상품 등록</h1>
		<form method="post" enctype="multipart/form-data">
			<div>
				<label>상품번호:</label>
				<input name="goodsid" type="number">
			</div>
			<div>
				<label>상품명:</label>
				<input name="goodsname" type="text">
			</div>
			<div>
				<label>분류:</label>
				<input name="kind" type="text">
			</div>
			<div>
				<label>가격:</label>
				<input name="price" type="number">
			</div>
<!-- 			<div> -->
<!-- 				<label>표지: </label> -->
<!-- 				<input name="uploadFile" type="file" > -->
<!-- 			</div>		 -->
			<div>
				<input type="submit" value="등록">
			</div>	
		</form>
	</div>
</body>
</html>