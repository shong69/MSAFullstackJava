<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/frame.css">
<style type="text/css">
	#content{}
	#content h2{
		text-align: center;
	}
	#content form{
		width: 500px;
		margin: 0px auto;
	}
	#content form>div{
		margin-bottom: 10px;
	}
	#content form>div>label{
		display: inline-block;
		width: 100px;
	}
	#content form>div>input{
		width: 400px;
		box-sizing: border-box;
	}
	#content form>div>textarea{
		width: 100%;
		box-sizing: border-box;
		height: 200px;
	}
	#content form>div>button{
		width:31%;	
		box-sizing: border-box;
	}
	.err{
		text-align : right;
		color:red;
		font-style:italic;
		font-size:0.8em;
	}
</style>
<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
$(function(){
	$('form').submit(function(e){
		$('form .err').eq(0).html($(this).find('input').eq(0).val()?'':'제목없음');
		return $(this).find('input').eq(0).val()?true:false;
	});
})
</script>
</head>
<body>
<jsp:include page="../layout/header.jsp"></jsp:include>
<jsp:include page="../layout/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<h2>입력 페이지</h2>
<%
Object sub = request.getAttribute("sub");
Object content = request.getAttribute("content");
Object errId = request.getAttribute("errId");

if(errId==null) errId = "";
sub = sub==null?"":sub;
%>
<form action="add.do" method="post">
	<div>
		<label>subject<span class="err"></span></label><input name="sub" value="<%=sub %>"/>
	</div>
	<div>
		<label>id<span class="err"><%=errId %></span></label><input name="id"/>
	</div>
	<div>
		<textarea name="content"><%=content==null?"":content %></textarea>
	</div>
	<div>
		<button type="submit">입력</button>
		<button type="reset">취소</button>
		<button type="button">뒤로</button>
	</div>
</form>
<jsp:include page="../layout/footer.jsp"></jsp:include>
</body>
</html>


