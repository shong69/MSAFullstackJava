<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../layout/header.jspf" %>
</head>
<body>
<c:forEach items="${errs }" var="err">
<div class="alert alert-danger" role="alert">
	<button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
	${err.defaultMessage }
</div>
</c:forEach>

<%@ include file="../layout/menu.jspf" %>
<h1>add page</h1>
<form class="form-horizontal" action="add.do" method="post">
  <div class="form-group">
    <label for="deptno" class="col-sm-2 control-label">DetpNo</label>
    <div class="col-sm-10">
      <input class="form-control" name="deptno" id="deptno" placeholder="deptno">
    </div>
  </div>
  <div class="form-group">
    <label for="dname" class="col-sm-2 control-label">DName</label>
    <div class="col-sm-10">
      <input class="form-control" name="dname" id="dname" placeholder="dname">
    </div>
  </div>
  <div class="form-group">
    <label for="loc" class="col-sm-2 control-label">Loc</label>
    <div class="col-sm-10">
      <input class="form-control" name="loc" id="loc" placeholder="loc">
    </div>
  </div>

  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default btn-primary">입력</button>
      <button type="reset" class="btn btn-default">취소</button>
      <button type="button" class="btn btn-default" onclick="history.back();">뒤로</button>
    </div>
  </div>
</form>
<%@ include file="../layout/footer.jspf" %>
</body>
</html>