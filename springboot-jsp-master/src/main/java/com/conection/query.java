package com.conection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;


public class query {
	public String getData()
	{
		String ss="";
		dbconection s=new dbconection();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		Connection con=null;
		Statement stm=null;
		ResultSet rs;	
		try
		{
			con=DriverManager.getConnection(s.getURL(),s.getName(),s.getPass());
			stm=con.createStatement();
			rs=stm.executeQuery("select * from edit_tb");
			
		if(rs.next())
			ss=rs.getString("noidung");
		}catch(SQLException e){
			e.printStackTrace();
		}	
		finally
		{
				try {
					con.close();
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		return ss;
	}

	public boolean setData(String noidung)
	{				
		
		dbconection s=new dbconection();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		Connection con=null;
		Statement stm=null;
		
		try
		{
			
			con=DriverManager.getConnection(s.getURL(),s.getName(),s.getPass());
			stm=con.createStatement();
			String sql="UPDATE `edit_tb` SET `noidung`= '"+noidung+"'";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			return pst.executeUpdate() > 0;						
					
		}catch(SQLException e){
			e.printStackTrace();
		}	
		finally
		{
			
				try {
					con.close();
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
			
		return false;	}

}
