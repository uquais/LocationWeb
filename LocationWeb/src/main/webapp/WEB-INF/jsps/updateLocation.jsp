<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyLocation</title>
</head>
<body>
<form action="updateLoc" method="post">
<pre>
id:<input type="text" name="id" value="${location.id}" readonly="readonly">
code:<input type="text" name="code" value="${location.code}">
name:<input type="text" name="name" value="${location.name}">
type:Urban<input type="radio" name="type" value="Urban" ${location.type=="Urban"?'checked':''}/>
Rural<input type="radio" name="type" value="Rural" ${location.type=="Rural"?'checked':''}/>
<input type="submit"value="save"/>
</pre>
</form>
${msg}
<a href="displayLocations"> ViewAll</a> 
</body>
</html>