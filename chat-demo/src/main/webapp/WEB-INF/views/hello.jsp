<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="sendMessage" method="post" modelAttribute="UserModel">
	消息内容：<input type="text" name="message">
	<input type="submit" value="提交">
	</form:form>
	<hr>
	<c:forEach items="${messageList}" var="i">
		<tr>${i.message}</tr>
	</c:forEach>
</body>
</html>