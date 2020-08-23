package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;

public class Viewoldpassworddao extends DbCon {
	public ArrayList<Profilebean> viewalloldpasswords(String loginid) {
		
	Connection con=getConnection();
	ArrayList<Profilebean> list=new ArrayList<Profilebean>();
	try {
		PreparedStatement ps=con.prepareStatement("select O_ID,LOGINID,OLDPASSWORD from OLDPASSWORD_TABLE where LOGINID=?");
		ps.setString(1, loginid);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			Profilebean pb=new Profilebean();
			int oid=rs.getInt(1);
			String loginid1=rs.getString(2);
			String password=rs.getString(3);
						
			pb.setAid(oid);
			pb.setLoginid(loginid1);
			pb.setPassword(password);;
					
			list.add(pb);
			
			
			
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
return list;
}	

}
