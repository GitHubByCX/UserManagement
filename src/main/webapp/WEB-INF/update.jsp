<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<c:set var="url" value="<%=path%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${url}/update" method="post">
		<div>
			<div>修改---------</div>
			<input style="display:none;" type="text" name="id" value="${stu.id}">
			<br>
			学号:
			<input type="text" name="studentId" value="${stu.studentId}">
			<br><br>
			姓名:
			<input type="text" name="name" value="${stu.name}">
			<br><br>
			手机:
			<input type="text" name="phoneNumber" value="${stu.phoneNumber}">
			<br><br>
			班级:
			<input type="text" name="className" value="${stu.className}">
			<br><br>
			宿舍:
			<input type="text" name="hostel" value="${stu.hostel}">
			<br><br>
			<input type="submit" value="提交">
		</div>
	</form>
	<br>
	<a href="${url}/toindex"><input type="submit" value="返回"></a>
</body>
</html>