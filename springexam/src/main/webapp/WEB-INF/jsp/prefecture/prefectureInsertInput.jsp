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
	<form:form modelAttribute="prefectureForm" action="confirm">
		<dl>
			<dt>ID</dt>
			<dd>
				<form:input type="text" path="id"/>
				<form:errors path="id" element="p"></form:errors>
			</dd>
			<dt>都道府県名</dt>
			<dd>
				<form:input type="text" path="name"/>
				<form:errors path="name" element="p"></form:errors>
			</dd>
			<dt>人口</dt>
			<dd>
				<form:input type="text" path="population"/>
				<form:errors path="population" element="p"></form:errors>
			</dd>
		</dl>
		<input type="submit" value="追加"/>
	</form:form>
</body>
</html>