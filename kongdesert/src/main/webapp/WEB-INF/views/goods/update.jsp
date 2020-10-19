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
		<h1>상품정보 변경</h1>
		<form method="post">			
			<div>
				<label>상품명:</label>
				<input name="goodsname" type="text" value="${item.goodsname}">
			</div>
			<div>
				<label>분류:</label>
				<input name="kind" type="text" value="${item.kind}">
			</div>
			<div>
				<label>가격:</label>
				<input name="price" type="number" value="${item.price}">
			</div>
			<div>
				<input type="submit" value="변경">
			</div>			
		</form>
	</div>
</body>
</html>