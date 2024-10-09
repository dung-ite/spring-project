<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Prefecture List</title>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script type="text/javascript">
	
		function search(){
			var keyword = $('#keyword').val();
						 // document.getElementById('keyword').value
			$.ajax({
				url:'/prefecture/data'
				,type: 'GET'
				,data: {
					'prefectureName' : keyword
				}
				,success: function(result){
					
					$('#prefectureList').html("");//xoa noi dung trong the co id la bookList
					/* ------ */
					$('#prefectureList').append("<ul>");//chèn nội dung <ul> vào thẻ div có ID là bookList
					for(var i=0; i<result.length; i++){
						$('#prefectureList').append("<li>");
							$('#prefectureList').append("<image src='https://picsum.photos/id/237/200/300'/><br>");
							$('#prefectureList').append("<span>"+result[i].name+"</span>");
							$('#prefectureList').append("<span>"+result[i].infrastructureName+"</span>");
						$('#prefectureList').append("</li>");
					}
					$('#prefectureList').append("</ul>");
					/* ------ */
				}
			});
		}
	</script>
	
	<style>
		.bigcity{
			color:red
		}
	</style>
</head>
<body>
	<h1>都道府県一覧</h1>
	
	<!-- BEGIN SEARCH -->
	<input name="prefectureName" id="keyword" type="text" />
	<button onclick="search()">検索</button>
	<div id="prefectureList"></div>
	<!-- END SEARCH -->

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