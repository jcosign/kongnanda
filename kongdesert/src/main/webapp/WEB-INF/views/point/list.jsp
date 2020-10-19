<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<div><h3>지점 목록</h3></div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>지점번호</th>
						<th>아이디</th>
						<th>지점명</th>
						<th>주소</th>
						<th>전화번호</th>
						<th>이메일</th>
						<th>관리</th>
					</tr>
				</thead>
<!-- 				<tbody> -->
<%-- 					<c:if test="${list.size() < 1}"> --%>
<!-- 						<tr> -->
<!-- 							<td colspan="5">등록 된 도서가 없습니다</td> -->
<!-- 						</tr> -->
<!-- 					</c:if> -->
					
<%-- 					<c:forEach var="item" items="${list}"> --%>
						<tr>
							<td>${item.pointnum}</td>
							<td>${item.pointid}</td>
							<td>${item.pointname}</td>
							<td>${item.address}</td>
							<td>${item.phone}</td>
							<td>${item.email}</td>
							<td>확인</td>
<%-- 							<td><a href="../upload/${item.cover}" target="_blank">확인</a></td> --%>
							<td><a href="${item.pointnum}/delete">삭제</a> <a href="${item.pointnum}/update">변경</a></td>
<%-- 							</a> <a href="cart?bookid=${item.bookid}">장바구니</a></td> --%>
						</tr>					
<!-- 					</c:forEach> -->
					
				</tbody>
			</table>
		</div>
		<div><a href="add">등록</a></div>
<!-- 		<div><a href="cart">장바구니</a></div> -->
		<div><a href="..">처음으로</a></div>
<!-- 		<div><a href="dummy">대량등록</a></div> -->
<!-- 		<div><a href="init">초기화</a></div> -->
	</div>
</body>
</html>