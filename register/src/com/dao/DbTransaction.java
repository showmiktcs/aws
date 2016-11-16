package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.pojo.RegisterDetails;

public class DbTransaction {

	public int insert(RegisterDetails rd) {
		// TODO Auto-generated method stub
		int count = 0;
		if (rd != null) {
			try {
				
				Connection connection = null;
				PreparedStatement ps = null;
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://dettest1.ce1xnn9brlzu.ap-south-1.rds.amazonaws.com:3306/dettest1","dettest1", "dettest1");
				
				ps = connection.prepareStatement("insert into register_tbl1 (username,password,conpassword,email) values(?,?,?,?)");
			
				ps.setString(1, rd.getUsername());
				ps.setString(2, rd.getPassword());
				ps.setString(3, rd.getConfirmpassword());
				ps.setString(4, rd.getEmail());
				
				count = ps.executeUpdate();

			} 
			catch (Exception e)
			{
				e.printStackTrace();
				count = 0;
            }

		}
		return count;
		
	}

}
