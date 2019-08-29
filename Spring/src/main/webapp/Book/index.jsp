<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询</title>
</head>
<body>
<form action="index.action">
<input name="txt">
<input type="submit" value="查询">
</form>
<table>
<tr><td>编号</td><td>名称</td><td>性别</td><td>零食</td></tr>
<c:forEach items="${list}" var="r">
<tr>
<td style="color: red">${r.id}</td><td style="color: green">${r.name}</td><td style="color: yellow">${r.sexname}</td><td style="color: pink">${r.typename}</td>
</tr>
</c:forEach>
</table>
</body>
</html>