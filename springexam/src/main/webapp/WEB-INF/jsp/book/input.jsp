<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Book search</title>
	<script type="text/javascript">
		//tao function
		function execute(){
			return true;
		}
		
		function search(str){
			/* x = execute(); */
			alert(str);
		}
	</script>
</head>
<body>
	<h1>BOOK SEARCH</h1>
	<form name="fm" action="searchByName">
		<input name="bookName" type="text"/>
		<input type="button" value="検索" onsubmit="" />
	</form>
</body>
</html>