<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>書籍一覧</title>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script type="text/javascript">
		function search(){
			var keyword = $('#keyword').val();
						 // document.getElementById('keyword').value
			$.ajax({
				url:'/book/data'
				,type: 'GET'
				,data: {
					'bookName' : keyword
				}
				,success: function(result){
					
					$('#bookList').html("");//xoa noi dung trong the id la bookList
					/* ------ */
					$('#bookList').append("<ul>");
					for(var i=0; i<result.length; i++){
						$('#bookList').append("<li>");
							$('#bookList').append("<image src='https://picsum.photos/id/237/200/300'/><br>");
							$('#bookList').append("<span>"+result[i].bookName+"</span>");
							$('#bookList').append("<span>"+result[i].price+"</span>");
						$('#bookList').append("</li>");
					}
					$('#bookList').append("</ul>");
					/* ------ */
				}
			});
		}
	</script>
</head>
<body>
	<input name="bookName" id="keyword" type="text"/>
	<button onclick="search()">検索</button>

	<div id="bookList"></div>


	<table border="1">
		<thead>
			<tr>
				<td>書籍ID</td>
				<td>書籍名</td>
				<td>価格</td>
				<td>カテゴリ名</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bookList}" var="book">
				<tr>
					<td><c:out value="${book.bookId}"/></td>
					<td><c:out value="${book.bookName}"/></td>
					<td><c:out value="${book.price}"/></td>
					<td><c:out value="${book.categoryName}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>