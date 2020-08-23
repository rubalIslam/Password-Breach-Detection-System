package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;

public class Viewalluserdao extends DbCon{

	public ArrayList<Profilebean> getalluserdetails() {
		Connection con=getConnection();
		ArrayList<Profilebean> list=new ArrayList<Profilebean>();
		try {
			PreparedStatement ps=con.prepareStatement("select LOGINID,USERNAME,MAIL,MOBILE,GENDER,ADDRESS from USERINFO where role=?");
			ps.setString(1, "User");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Profilebean pb=new Profilebean();
				String loginid=rs.getString(1);
				String username=rs.getString(2);
				String mail=rs.getString(3);
				String mobile=rs.getString(4);
				String gender=rs.getString(5);
				String address=rs.getString(6);
				
				pb.setLoginid(loginid);
				pb.setUsername(username);
				pb.setEmail(mail);
				pb.setMobileno(mobile);
				pb.setGender(gender);
				pb.setAddress(address);
				
				list.add(pb);
				
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}

}
