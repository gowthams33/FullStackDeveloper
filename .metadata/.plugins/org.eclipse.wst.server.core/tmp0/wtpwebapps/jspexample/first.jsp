

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "Welcome "+"to "+"JSP !!!" %>
<%
	int i = 130;
	out.print(i);
%>
<%
	String name = request.getParameter("name");
%>
<%= name %>
<jsp:include page="include.jsp"></jsp:include>
<jsp:forward page="forward.jsp">
<jsp:param value="praba" name="student"/>
</jsp:forward>
</body>
</html>