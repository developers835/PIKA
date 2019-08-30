<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<script type="text/javascript">
function del(id){
	if(confirm("确认删除吗？")){
	open("delete?id="+id,"_self");
}
	}
</script>
<form action="index">
<input name="txt">
<input type="submit" value="查询">
<!-- <button type="submit">查询</button> -->
</form>
<a href="add">新增</a>
<table>
<tr><td>编号</td><td>品牌</td><td>性别</td><td>美食</td><td>操作</td></tr><br>
<c:forEach items="${list}" var="r" >
<tr>
<td style="color: red">${r.id}</td>
<td style="color: green">${r.name}</td>
<td style="color: grey">${r.sexname}</td>
<td style="color: pink">${r.typename}</td>
<td>
<a href="edit?id=${r.id}" style="color: orange">修改</a>
<a href="javascript:del(${r.id})" style="color: blue">删除</a>
</td></tr>
</c:forEach>
</table>
</body>
</html>