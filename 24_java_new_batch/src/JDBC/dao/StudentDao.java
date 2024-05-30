package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import java.sql.*;

import JDBC.bean.StudentBean;
import JDBC.util.DBConnection;

public class StudentDao {
	public int insertStudent(StudentBean s)
	{
		//String insertQuery="INSERT INTO student(rno,name,std) VALUES('"+s.getRno()+"',"+s.getName()+","+s.getStd()+")"; 
		String insertQuery="INSERT INTO student(rno,name,std) VALUES(?,?,?)";  
		Connection conn=DBConnection.getConnection();
		PreparedStatement pstmt=null;
		int rowsAffected=0;
		if(conn!=null)
		{
			try {
				pstmt=conn.prepareStatement(insertQuery);
				pstmt.setInt(1, s.getRno());
				pstmt.setString(2, s.getName());
				pstmt.setInt(3, s.getStd());
				rowsAffected=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao insertStudent()--Db not connected");
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> displayStudent()
	{
		String selectQuery="select * from student";
		Connection conn=DBConnection.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		StudentBean sbean=null;
		ArrayList<StudentBean> list=new ArrayList<StudentBean>();
		if(conn!=null)
		{
			try {
				stmt=conn.createStatement();
				rs=stmt.executeQuery(selectQuery);
				while(rs.next())  //row by row iterate from table
				{
					int rno=rs.getInt(1);
					String name=rs.getString(2);
					int std=rs.getInt(3);
					
					sbean=new StudentBean(rno, name, std);
					list.add(sbean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
			System.out.println("StudentDao--displayStudent()--Dn not connected");
		}
		return list;
	}
	public int updateStudent(StudentBean s)
	{
		
		String updateQuery="UPDATE student SET name= '"+s.getName()+"',std='"+s.getStd()+"' where rno="+s.getRno();  
		Connection conn=DBConnection.getConnection();
		Statement stmt=null;
		int rowsAffected=0;
		if(conn!=null)
		{
			try {
				stmt=conn.createStatement();
				
				rowsAffected=stmt.executeUpdate(updateQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao updateStudent()--Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno)
	{
		
		String deleteQuery="DELETE FROM student  where rno="+rno;  
		Connection conn=DBConnection.getConnection();
		Statement stmt=null;
		int rowsAffected=0;
		if(conn!=null)
		{
			try {
				stmt=conn.createStatement();
				
				rowsAffected=stmt.executeUpdate(deleteQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao updateStudent()--Db not connected");
		}
		return rowsAffected;
	}
	
	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		StudentBean sbean=null;
		Scanner sc=new Scanner(System.in);

//-----------------------------------------------INSERT---------------------------------------------------------------------------------------------------	
//		System.out.println("enter name: ");
//		String name=sc.next();
//		System.out.println("enter standard: ");
//		int std=sc.nextInt();
//		System.out.println("enter rollNumber: ");
//		int rno=sc.nextInt();
//		
//		sbean=new StudentBean();
//		sbean.setName(name);
//		sbean.setRno(rno);
//		sbean.setStd(std);
//		int rowAffected=dao.insertStudent(sbean);  //1
//		if(rowAffected>0)
//		{
//			System.out.println("Student record succesfully inserted : "+ rowAffected);
//		}else
//		{
//			System.out.println("Student record not inserted : "+ rowAffected);
//		}
		
		
//-----------------------------------------------DISPLAY---------------------------------------------------------------------------------------------------		
		ArrayList<StudentBean> list=dao.displayStudent();
		for(int i=0;i<list.size();i++)
		{
			sbean=list.get(i);
			System.out.println(sbean.getRno()+" "+sbean.getName()+" "+sbean.getStd());
		}
		
		
//-----------------------------------------------UPDATE---------------------------------------------------------------------------------------------------		
//		System.out.println("enter RollNumber which you want to update");
//		int rno=sc.nextInt();
//		
//		System.out.println("enter name: ");
//		String name=sc.next();
//		System.out.println("enter standard: ");
//		int std=sc.nextInt();
//		sbean=new StudentBean(rno, name, std);
//		
//		int affectedRows=dao.updateStudent(sbean);
//		if(affectedRows>0)
//		{
//			System.out.println("Student record succesfully updated : "+ affectedRows);
//		}else
//		{
//			System.out.println("Student record not updated : "+ affectedRows);
//		}

		
//-----------------------------------------------DELETE---------------------------------------------------------------------------------------------------	
//		System.out.println("enter RollNumber which you want to delete");
//		int rno=sc.nextInt();
//		
//		
//		
//		
//		int affectedRows=dao.deleteStudent(rno);
//		if(affectedRows>0)
//		{
//			System.out.println("Student record succesfully updated : "+ affectedRows);
//		}else
//		{
//			System.out.println("Student record not updated : "+ affectedRows);
//		}
		
	}
}
