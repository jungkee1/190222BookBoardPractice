<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
  table tr:hover{  /* 각 tr마다 호버 옵션 */
 	cursor:pointer;
 	background-color : #ccc;
 } /* 검색 된 주소창에 마우스 hover css */
</style>

</head>
<!--제목 옆에 조회수 표시 바로 할 수 있게 퍼놨음 -->
<!--조회수  등록일 댓글 개수 볼 수 있게 퍼놨음  -->


<body>
<div id="contatiner" align="center">
<h1>게시판 전체보기</h1>
<div align="right"><a href="/book/writeForm">글 쓰러가기</a></div>   <!-- 경로를 쓸 때 /부터 시작하면 절대경로로 쓰고 /없이 시작하면 그냥 바로 상대경로이다.  -->
<table class="table table-striped">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>글쓴이</td>
		<td>조회수</td>
	</tr>
<c:forEach items="${vo }" var="list" varStatus="status">
	<tr>
		<td>${list.seq }</td>
		<td><a href="detail?seq=${list.seq }">${list.title }</a></td> <!-- 각 제목 누르면 해당 글 상세 보기로 이동  -->
		<td>${list.writer }</td>
		<td>${list.hitcount }</td>
	</tr>

</c:forEach>
	

</table>

</div>

</body>
</html>