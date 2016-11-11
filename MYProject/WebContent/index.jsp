<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center; background-color: aqua;">
	<form action="MyController" method="post">
		<fieldset>
			<legend>Insert Here</legend>
				<input type="hidden" name="check" value="insert">
				Name : <input type="text" name="name">
				Gender : <input type="text" name="gender">
					 <input type="submit" value="SUBMIT"> 
		</fieldset>
	</form>
	
	<br><br><br><br>
	<form action="MyController" method="post">
		<fieldset>
			<legend>Search Here</legend>
				<input type="hidden" name="check" value="search">
			Search For : <input type="text" name="search">
					 <input type="submit" value="SUBMIT"> 
		</fieldset>
	</form>
</body>
</html>








