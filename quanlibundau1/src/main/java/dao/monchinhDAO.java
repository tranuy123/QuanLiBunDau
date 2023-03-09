package dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBcontext;
import entity.Monchinh;
import entity.phanloai;

public class monchinhDAO {
	
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs = null;
	
	
		public List<Monchinh>  getallmonchinh(){
	    List<Monchinh>list=new ArrayList<>();
	    String query=  "select*from menu";
	    try{
	    	conn=new DBcontext().GetConnection();
	        ps=conn.prepareStatement(query);
	        rs=ps.executeQuery();
	        while(rs.next()) {
				list.add(new Monchinh(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getDouble(4),
						rs.getString(5),
						rs.getInt(6)));
			}
	    }catch(Exception e){
	    }
	    return list;
		}
	    public List<phanloai> getallphanloai() {
	        List<phanloai> list = new ArrayList<>();
	        String query = "select * from phanloai";
	        try {
	            conn = new DBcontext().GetConnection();//mo ket noi voi sql
	            ps = conn.prepareStatement(query);
	            rs = ps.executeQuery();
	            while(rs.next()) {
					list.add(new phanloai(rs.getInt(1),
							rs.getString(2)));
				}
	        } catch (Exception e) {
	        }
	        return list;
	    }
	    public List<Monchinh> getProductByCID(String idpl) {
	        List<Monchinh> list = new ArrayList<>();
	        String query = "select * from menu\n"
	                + "where idpl = ?";
	        try {
	            conn = new DBcontext().GetConnection();//mo ket noi voi sql
	            ps = conn.prepareStatement(query);
	            ps.setString(1, idpl);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                list.add(new Monchinh(rs.getInt(1),
	                        rs.getString(2),
	                        rs.getString(3),
	                        rs.getDouble(4),
	                        rs.getString(5),
	                        rs.getInt(6)));
	            }
	        } catch (Exception e) {
	        }
	        return list;
	    }
	    public Monchinh getProductByID(String id) {
	        String query = "select * from menu\n"
	                + "where id = ?";
	        try {
	            conn = new DBcontext().GetConnection();//mo ket noi voi sql
	            ps = conn.prepareStatement(query);
	            ps.setString(1, id);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                return new Monchinh(rs.getInt(1),
	                        rs.getString(2),
	                        rs.getString(3),
	                        rs.getDouble(4),
	                        rs.getString(5),
	                        rs.getInt(6));
	            }
	        } catch (Exception e) {
	        }
	        return null;
	    }
	    public List<Monchinh> searchByName(String txtSearch) {
	        List<Monchinh> list = new ArrayList<>();
	        String query = "select * from menu\n"
	                + "where [name] like ?";
	        try {
	            conn = new DBcontext().GetConnection();//mo ket noi voi sql
	            ps = conn.prepareStatement(query);
	            ps.setString(1,"%"+ txtSearch+"%");
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                list.add(new Monchinh(rs.getInt(1),
	                        rs.getString(2),
	                        rs.getString(3),
	                        rs.getDouble(4),
	                        rs.getString(5),
	                        rs.getInt(6)));
	            }
	        } catch (Exception e) {
	        }
	        return list;
	    }
	    public void deleteProduct(String pid){
	        String query="delete from menu\n"
	                +"where id=?";
	        try{
	            conn=new DBcontext().GetConnection();
	            ps =conn.prepareStatement(query);
	            ps.setString(1,pid);
	            ps.executeUpdate();
	        }catch(Exception e){
	        }
	    }
	    public void insertmonchinh(String id,String name,String image,String price,
	        String mieuta,String idpl){
	    	
	        String query=" insert into menu(id,name,image,price,mieuta,idpl) values(?,?,?,?,?,?)";
	        try{
	            conn=new DBcontext().GetConnection();// mo ket noi voi sql
	            ps=conn.prepareStatement(query);
	            ps.setString(1, id);
	            ps.setString(2,name);
	            ps.setString(3,image);
	            ps.setString(4,price);
	            ps.setString(5,mieuta);
	            ps.setString(6,idpl);
	            ps.executeUpdate();
	        }catch(Exception e){
	        }
	    }
	    public void editmonchinh(String id,String name,String image,String price,
		        String mieuta,String idpl){
		    	
	        String query="update menu set name=N'"+name+"',image='"+image+"',price="+price+",mieuta=N'"+mieuta+"',idpl='"+idpl+"' where id="+id;

		        try{
		            conn=new DBcontext().GetConnection();// mo ket noi voi sql
		            ps=conn.prepareStatement(query);
		            ps.setString(1, id);
		            ps.setString(2,name);
		            ps.setString(3,image);
		            ps.setString(4,price);
		            ps.setString(5,mieuta);
		            ps.setString(6,idpl);	            
		            ps.executeUpdate();
		        }catch(Exception e){
		        }
		    }

		public static void main(String[]args){
		    monchinhDAO dao=new monchinhDAO();
		    List <phanloai> list=dao.getallphanloai();
		    for(phanloai o :list){
		        System.out.println(o);
		}
		}
}
