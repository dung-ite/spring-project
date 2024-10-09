<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search result</title>
</head>
<body>
	ID:<c:out value="${param.prefectureId}"/>の検索結果
	<br>
	
	<dl>
		<dt>ID</dt>
		<dd><c:out value="${prefecture.id}"/></dd>
		<dt>名称</dt>
		<dd><c:out value="${prefecture.name}"/></dd>
		<dt>人口</dt>
		<dd>
			<fmt:formatNumber pattern="#,###" value="${prefecture.population}" var="pp"/>
		 	<c:out value="${pp}"/>
		</dd>
		<dt>現在</dt>
		<dd>
			<fmt:formatDate pattern="yyyy年MM月dd日" value="${today}"/>
		</dd>
	</dl>
</body>
</html>