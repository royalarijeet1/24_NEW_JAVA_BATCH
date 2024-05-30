package JDBC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	 	private static String URLNAME="jdbc:mysql://localhost:3306/24_new_java_batch";	
	 	private static String DRIVERCLASS="com.mysql.cj.jdbc.Driver";
	 	private static String	USERNAME="root";
	 	private static String PASSWORD="root";
	 	private static Connection conn=null;
	 	
	 	
	 	public static Connection getConnection()
	 	{
	 		Connection conn=null;
	 		
	 			try {
					Class.forName(DRIVERCLASS);
					try {
						conn=DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return conn;
	 	}
	 	
	 	public static void main(String[] args) {
			Connection conn=DBConnection.getConnection();
			System.out.println(conn);
		}
}
