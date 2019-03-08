<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
<div id="contatiner" align="center">
<h1>게시판 전체보기</h1>
<div align="right"><a href="/book/writeForm">글 쓰러가기</a></div>   <!-- 경로를 쓸 때 /부터 시작하면 절대경로로 쓰고 /없이 시작하면 그냥 바로 상대경로이다.  -->
<table class="table table-striped">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>글쓴이</td>
		<td>조회수</td>
	</tr>

</table>

</div>

</body>
</html>