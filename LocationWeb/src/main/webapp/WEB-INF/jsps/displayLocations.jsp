<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H2>Locations: </H2>
<table>

<tr>
<th>id</th>
<th>code</th>
<th>Name</th>
<th>Type</th>
</tr>

<c:forEach items="${locations}" var="location">
<tr>
<td> ${location.id}</td>
<td> ${location.code}</td>
<td> ${location.name}</td>
<td> ${location.type}</td>
<td> <a href="deleteLocation?id=${location.id}">Delete</a></td>
<td> <a href="showUpdate?id=${location.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showcreate"> Add Location </a>
</body>
</html>