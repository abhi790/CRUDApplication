<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*"%>  
<%@ page import="com.register.dao.UserDao" %>  
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
	<style>
			#id{
				
			}	
			
			#name{
				color:Magenta
			}	
			#email{
				color:HotPink
			}
			#country{
				color:Lime
			}
	</style>
</head>
<body>
<div align="center">
	<h1>User Management System</h1>
	
	<a href="registerUser.jsp">Register User</a>
	
</div>

<hr>

<div align="center">
		
		<table border="1" style="border:3px solid Maroon;">
			<tr style="background-color:Cyan; font-weight:bold">
				<td> ID </td>
				<td> NAME </td>
				<td> EMAIL </td>
				<td> COUNTRY </td>
				<td>ACTION</td>
			</tr>
		
		<%
		ResultSet rs = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserManagement","root","Abhimanyu@97");
		String query = "select * from users";
		Statement st = 	con.createStatement();
		rs = st.executeQuery(query);
		
		while(rs.next())
		{
		%>	
			<tr style="background-color:Cornsilk">		
				<td id="id"><%=rs.getInt(1) %></td>
				<td id="name"><%=rs.getString(2) %></td>
				<td id="email"><%=rs.getString(3) %></td>
				<td id="country"><%=rs.getString(4) %></td>
				<td id="action"><a href="#">Edit</a> &nbsp;&nbsp;&nbsp;<a href="#">Delete</a></td>
			</tr>
			
		<%	
		}
			
		%>
		</table>
	
</div>
	
</body>
</html>