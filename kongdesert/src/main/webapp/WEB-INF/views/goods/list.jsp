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
		<div><h3>상품 목록</h3></div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>상품번호</th>
						<th>상품명</th>
						<th>분류</th>
						<th>가격</th>
<!-- 						<th>표지</th> -->
						<th>관리</th>
					</tr>
				</thead>
				<tbody>
<%-- 					<c:if test="${list.size() < 1}"> --%>
<!-- 						<tr> -->
<!-- 							<td colspan="5">등록 된 도서가 없습니다</td> -->
<!-- 						</tr> -->
<%-- 					</c:if> --%>
					
<%-- 					<c:forEach var="item" items="${list}"> --%>
						<tr>
							<td>${item.goodsid}</td>
							<td>${item.goodsname}</td>
							<td>${item.kind}</td>
							<td>${item.price}</td>
							<td>확인</td>
<%-- 							<td><a href="../upload/${item.cover}" target="_blank">확인</a></td> --%>
							<td><a href="${item.goodsid}/delete">삭제</a> <a href="${item.goodsid}/update">변경</a> </td>
<%-- 							<a href="cart?bookid=${item.bookid}">장바구니</a></td> --%>
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