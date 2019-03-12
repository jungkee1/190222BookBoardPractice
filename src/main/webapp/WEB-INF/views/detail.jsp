<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>

	#title{
		margin:5%;
		font-size:40px;
		text-align: left;
	}
	#writer{
		margin:5%;
		text-align: right;
	}
	#content{
		margin:5%;
		text-align: left;

	}
	.ss{
		width: 100%;

	}
	.box1{
		text-align:left;
		width:500px;
	
	}
	.box2{
		text-align:right;
		width:10%;
	}
	

</style>
</head>
<body>
<br>
<br>
<br>
<div id="contatiner" align="center" style="width:700px; margin: 0 auto;">
	<div class="ss">
		<span id="title" class="box box1">
			${vo.title }
		</span>
		<span id="writer" class="box box2">
			김정기 ${vo.regdate }
		</span>
	</div>	
		<hr>
		<div id="content">
			${vo.content}
		</div>


<input type="button" value="수정" class="btn btn-success" onclick="location.href='updateForm?seq=${vo.seq}'"> <input type="button" class="btn btn-danger" value="삭제" onclick="location.href='delete?seq=${vo.seq}'">
</div>

</body>
</html>