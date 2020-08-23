package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;




public class Logindao extends DbCon {

	public ArrayList<Profilebean> datauserlogin(Profilebean pb) {
		Connection con=null;
		//int i=0;
		Profilebean pb1=null;
		
		
		
		String uid=pb.getLoginid();
		String password=pb.getPassword();
		
		con=getConnection();
	
		ArrayList<Profilebean> list=new ArrayList<Profilebean>();
		try {
			PreparedStatement ps=con.prepareStatement("select u.role,u.username,u.STATUS,h.HONEYWORD1,h.HONEYWORD2,h.HONEYWORD3,h.HONEYWORD4,h.HONEYWORD5 from USERINFO u,HONEYWORDS_TABLE	h where u.LOGINID=? and u.password=? and h.LOGINID=? ");
			ps.setString(1, uid);
			ps.setString(2, password);
			ps.setString(3, uid);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				pb1=new Profilebean();
				String role=rs.getString(1);
				String username= rs.getString(2);
				String status= rs.getString(3);
				String honey1= rs.getString(4);
				String honey2= rs.getString(5);
				String honey3= rs.getString(6);
				String honey4= rs.getString(7);
				String honey5= rs.getString(8);
				
	  			
				pb1.setRole(role);
				pb1.setUsername(username);
				pb1.setStatus(status);
				pb1.setHoney1(honey1);
				pb1.setHoney2(honey2);
				pb1.setHoney3(honey3);
				pb1.setHoney4(honey4);
				pb1.setHoney5(honey5);
				
				
				
				list.add(pb1);
				
				
			}
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
		
		
	}

}
