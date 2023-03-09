package dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import entity.Account;
import context.DBcontext;

public class accountDAO {
	static Connection conn=null;
	static PreparedStatement ps=null;
	ResultSet rs = null;
	public Account checkLogin (String username, String password){
	    try{
	        String query="select*from acc where username=? and password=?";
	        conn=new DBcontext().GetConnection ();
	        ps=conn.prepareStatement (query);
	        ps.setString (1, username);
	        ps.setString (2, password);
	        rs=ps.executeQuery ();
	       while (rs.next ()){
	            Account a=new Account(rs.getString (1), rs.getString (2));
	            return a ;
	       }
	       }
	       catch (Exception e) {
	       }
	    return null;
	    }
	public static void insertUserAccount(String username, String password) throws SQLException 
	{
		String sql = "Insert into acc values (?,?)";
		try {
			 conn=new DBcontext().GetConnection ();
			    ps=conn.prepareStatement (sql);
		        ps.setString (1, username);
		        ps.setString (2, password);
		     	ps.executeUpdate();
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	
	public Account checkuser (String username){
	    try{
	        String query="select*from acc where username=?";
	        conn=new DBcontext().GetConnection ();
	        ps=conn.prepareStatement (query);
	        ps.setString (1, username);
	        rs=ps.executeQuery ();
	       while (rs.next ()){
	            Account a=new Account(rs.getString (1), rs.getString (2));
	            return a ;
	       }
	     }
	       catch (Exception e) {
	       }
	    return null;
	    }
	public static void main(String[] args) {
		Account a = new Account();
		try {
		   System.out.print(a.getUsername() + a.getPassword());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

