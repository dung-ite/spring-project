<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="UTF-8">
	<title>Infrastructure List</title>
	<style>
		.red{
			color:red
		}
		.blue{ color:blue}
	</style>
</head>
<body>
	<h1>インフラ一覧</h1>
	<table border="1">	
		<tr>
			<td>ID</td>
			<td>名前</td>
			<td>登録日</td>
			<td>曜日</td>
			<td>曜日</td>
		</tr>
		<c:forEach items="${infrastructureList}" var="infra">
			<tr>
				<td>${infra.id}</td>
				<td>${infra.name}</td>
				<td><fmt:formatDate value="${infra.registDate}" pattern="yyyy年MM月dd"/></td>
				<td>
					<fmt:formatDate value="${infra.registDate}" pattern="E" var="day"/>
					<c:if test="${day eq 'Sun'}">
						<span class="red">${day}</span>
					</c:if>
					<c:if test="${day ne 'Sun'}">
						${day}
					</c:if>
				</td>
				<td>
					<c:choose>
						<c:when test="${day eq 'Sat'}">
							<span class="blue">${day}</span>
						</c:when>
						<c:otherwise>
							${day}
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>