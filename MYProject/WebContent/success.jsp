<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:aqua; text-align: center; ">

					<% 
					 String name = (String)request.getAttribute("name"); 
					 String id = (String)request.getAttribute("id"); 
					 String gender = (String)request.getAttribute("gender");
					 
					 %>
<table style=align="center" border="3" cellspacing="1" cellpadding="10" style="border:solid;">
	<tr>
		<th>:: Name :: </th>
		<th>:: Gender :: </th>
		<th>:: ID :: </th>
	</tr>
	<tr>
		<td><%= name %></td>
	
		 <td><%= id %></td>
	
		<td> <%= gender %></td>
	</tr>
</table>
	
	<a href="index.jsp">HOME</a>				 
					
					 
</body> 
</html>