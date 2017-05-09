package com.conection;

public class dbconection {
	public String name="root";
	public String pass="121212";
	
	// String sql = String.format(
		//        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		 //          + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "dtdmnhom3","baitapnhom3-sql:asia-northeast1:dtdmnhom3");
	String url = "jdbc:mysql://127.0.0.1:3306/sakila";
	public String getURL()
	{
		return url;
	}
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}

}
