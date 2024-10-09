<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../define.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>登録画面</title>
	
</head>
<body>
	<dl>
		<dt>ID</dt>
		<dd><c:out value="${prefectureForm.id}"/></dd>
		<dt>都道府県名</dt>
		<dd><c:out value="${prefectureForm.name}"/></dd>
		<dt>人口</dt>
		<dd><c:out value="${prefectureForm.population}"/></dd>
	</dl>
	<form:form modelAttribute="prefectureForm" action="input">
		
		<input type="submit" value="戻る"/>
	</form:form>
</body>
</html>