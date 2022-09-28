package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
		}catch(Exception e){}
		return con;
	}

}