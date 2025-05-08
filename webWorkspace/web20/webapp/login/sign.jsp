<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<c:url var="root" value="/"></c:url>
<%@ include file="../layout/header.jspf" %>
</head>
<body>
<%@ include file="../layout/menu.jspf" %>
<form class="form-signin" action="signin.do" method="post">
  <h2 class="form-signin-heading">로그인 페이지</h2>
  <label for="inputId" class="sr-only">id</label>
  <input type="text" id="inputId" name="id" class="form-control" placeholder="id" required="" autofocus="">
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" id="inputPw" name="pw"class="form-control" placeholder="Password" required="">
  <div class="checkbox">
    <label>
      <input type="checkbox" value="remember-me"> 기억하기
    </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
</form>
<%@ include file="../layout/footer.jspf" %>

</body>
</html>