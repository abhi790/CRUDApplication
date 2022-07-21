package com.register.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.dao.Authentication;
import com.register.dao.UserDao;
import com.register.bean.User;

/**
 * Servlet implementation class RegisterUser
 */
//@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterUser() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	// TODO Auto-generated method stub
//    	response.getWriter().append("Served at: ").append(request.getContextPath());
//    	
    	UserDao userDao = new UserDao();
    	int id = Integer.parseInt(request.getParameter("id"));
    	String name = request.getParameter("name");
    	String email = request.getParameter("email");
    	String country = request.getParameter("country");
    	User user = new User(id,name,email,country);
    	
    	int rowAff = 0;
    	try {
			rowAff = userDao.insertInto(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
//    	int id = Integer.parseInt(request.getParameter("id"));
//    	String name = request.getParameter("name");
//    	String email = request.getParameter("email");
//    	String country = request.getParameter("country");
//    	User user = new User(id,name,email,country);
//    	Connection con = null;
//    	PreparedStatement preSt = null;
//    	Statement st = null;
//    	String sql = "insert into users values(7,'dummy', 'dummy','dummy')";
//    	
//    	try {
//    		Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection(Authentication.getUrl(),Authentication.getUsername(),Authentication.getPassword());
//			st = con.createStatement();
//			rowAff = st.executeUpdate(sql);
//    	} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	
//    	PrintWriter out = response.getWriter();
//    	out.println("Ok," + rowAff + " row affected");
    	
//    	response.sendRedirect(request.getContextPath() + "/index.jsp");
//    	or
    	RequestDispatcher requestDispatcher = request
                .getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    	
    	
    }




}
