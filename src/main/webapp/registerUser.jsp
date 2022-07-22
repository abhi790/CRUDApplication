<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
<style>
	.main{
	     background-color:Cyan; 
	     font-weight:bold;
	}
	
	.input{
		 background-color:Cornsilk;
		 font-weight:bold;
	}
	.btn{
		 background-color:Lime;
		 font-weight:bold;
	}

</style>
</head>
<body>
	<div align="center">
		<h1>User Registration Form</h1>
		<div align="center" class="form_boundry">
		<form action="RegisterUser" method="post" >
		<table border="1" style="background-color:Maroon;">
			<tr>
				<td class="main">ID:</td>
				<td ><input class="input" type="text" placeholder="Input Id" name="id"/>
			
			</tr>
			<tr>
				<td class="main">NAME:</td>
				<td ><input class="input" type="text" placeholder="Input Name" name="name"/>
			
			</tr>
			<tr>
				<td class="main">EMAIL:</td>
				<td ><input class="input" type="text" placeholder="Input Email" name="email"/>
			
			</tr>
			<tr>
				<td class="main">COUNTRY:</td>
				<td ><input class="input" type="text" placeholder="Input Country" name="country"/>
			
			</tr>
			
		
		</table>
		<input type="submit" value="Register User" class="btn"/>
		</form>
		</div>
	</div>
</body>
</html>