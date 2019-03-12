<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

</head>
<body>
<div id="contatiner" align="center" style="width:700px; margin: 0 auto;">
<form action="update" method="post">
<h1>게시글 수정하기</h1>
<input type="hidden" name="seq" value="${vo.seq }">
<table class="table"> <!--table에 margin을 줘서 가운데로 오게하고 테두리 없앨것.  text 보더라인 없애기 -->
	<tr>
		<td><input type="text" name="title" placeholder="제목" class="form-control input-lg" value="${vo.title }"></td>
	</tr>
	<tr>
		<td><textarea name="content" rows="30" cols="100" placeholder="본문을 작성해 주세요" class="form-control">${vo.content }</textarea></td>
	</tr>
	<tr>
		<td><input type="password" name="password" placeholder="비밀번호 입력" class="form-control"></td>
	</tr>
</table>
	<input type="submit" value="수정" class="btn btn-primary btn-lg">
</form>


</div>
</body>
</html>