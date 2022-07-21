package com.register.dao;
import java.sql.*;

import com.register.bean.User;
public class UserDao {
	public Connection connectWithDB() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		final String URL = Authentication.getUrl();
		final String USERNAME = Authentication.getUsername();
		final String PASSWORD = Authentication.getPassword();
		Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		return con;
	}
	
	private final String INSERT = "insert into users values (?,?,?,?)";
	private final String SELECT = "select * from users";
	
	public int insertInto(User user) throws ClassNotFoundException, SQLException {
		int rowAff = 0;
		//creating connection object and connecting to database
		Connection con = connectWithDB();
		//creating statement object using prepareStatement
		PreparedStatement preSt = con.prepareStatement(INSERT);
		
		//set the parameter of the statement 
		preSt.setInt(1,user.getId());
		preSt.setString(2, user.getName());
		preSt.setString(3, user.getEmail());
		preSt.setString(4, user.getCountry());
		
		rowAff = preSt.executeUpdate();
		con.close();
		return rowAff;
	}
	
	public ResultSet selectAll() throws ClassNotFoundException, SQLException {
		ResultSet rs = null;
		Connection con = connectWithDB();
		Statement st = con.createStatement();
		rs = st.executeQuery(SELECT);
		return rs;
		
	}

}



