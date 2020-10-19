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
		<form method="post">
			<div>
				<label>지점아이디:</label>
				<input type="text" name="pointid" value="${item.pointid}" readonly>
			</div>
			<div>
				<label>패스워드:</label>
				<input type="text" name="password" value="${item.password}">
			</div>
			<div>
				<label>지점명:</label>
				<input type="text" name="pointname" value="${item.pointname}">
			</div>
			<div>
				<label>주소:</label>
				<input type="text" name="address" value="${item.address}">
			</div>
			<div>
				<label>전화번호:</label>
				<input type="text" name="phone" value="${item.phone}">
			</div>
			<div>
				<label>이메일:</label>
				<input type="text" name="email" value="${item.email}">
			</div>
			<div>
				<input type="submit" value="변경">
			</div>			
		</form>
	</div>
</body>
</html>