<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<form action="testPojo" method="post">

	username:<input type="text" name="username"/>
	<br/>
	password:<input type="text" name="password"/>
	<br/>
	
	age:<input type="text" name="age"/>
	<br/>
	gender:男:<input type="radio" name="gender" value="m"/>
		     女:<input type="radio" name="gender" value="f"/>
	<br/>
	province:<input type="text" name="address.province"/>
	<br/>
	
	city:<input type="text" name="address.city"/>
	<br/>
	
	<input type="submit" value="注册"/>
	
</form>
<br/>
</body>
</html>