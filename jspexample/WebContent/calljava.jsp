<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>

<jsp:useBean id="example" class="com.jsp.JspExample" scope="request"></jsp:useBean>
<jsp:setProperty property="count" name="example" value="4000"/>
<jsp:getProperty property="count" name="example"/>

</h3>
</body>
</html>