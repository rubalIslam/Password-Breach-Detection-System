package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;

public class Checkattackdao extends DbCon {
	public ArrayList<Profilebean> checkattacks() {
	Connection con=getConnection();
	ArrayList<Profilebean> list=new ArrayList<Profilebean>();
	try {
		PreparedStatement ps=con.prepareStatement("select A_ID,LOGINID,ATTACKTYPE from ATTACK_TABLE");
		
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			Profilebean pb=new Profilebean();
			int aid=rs.getInt(1);
			String loginid=rs.getString(2);
			String attacktype=rs.getString(3);
						
			pb.setAid(aid);
			pb.setLoginid(loginid);
			pb.setAttacktype(attacktype);
					
			list.add(pb);
			
			
			
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return list;
}
}
