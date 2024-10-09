<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Prefecture List</title>
	<style>
		.bigcity{
			color:red
		}
	</style>
</head>
<body>
	<h1>都道府県一覧</h1>

	<table border="1">	
		<tr>
			<td>都道府県名</td>
			<td>人口</td>
			<td>３地方区分</td>
			<td>８地方区</td>
		</tr>
		
		<c:forEach items="${prefectureList}" var="prefecture">
			<tr>
				<td>${prefecture.name}</td>
				<td <c:if test="${prefecture.population > 2000000 }">class="bigcity"</c:if> >
					
					<fmt:formatNumber value="${prefecture.population}" pattern="#,###"/>
					
				</td>
				<td>${prefecture.section3Id}</td>
				<td>${prefecture.section8Id}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>