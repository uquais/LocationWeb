<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyLocation</title>
</head>
<body>
<form action="saveLoc" method="post">
<pre>
id:<input type="text" name="id">
code:<input type="text" name="code">
name:<input type="text" name="name">
type:Urban<input type="radio" name="type" value="Urban"/>
Rural<input type="radio" name="type" value="Rural"/>
<input type="submit"value="save"/>
</pre>
</form>
${msg}
<a href="displayLocations"> ViewAll</a> 
</body>
</html>