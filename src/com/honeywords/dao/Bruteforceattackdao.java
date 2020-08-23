package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;

public class Bruteforceattackdao extends DbCon {

	public ArrayList<Profilebean> getbruteforcedetails(String loginid) {
		Connection con=getConnection();
		ArrayList<Profilebean> list=new ArrayList<Profilebean>();
			try {
			PreparedStatement ps=con.prepareStatement("select A_ID,LOGINID,PASSWORD,ATTACKTYPE from ATTACK_TABLE where loginid=? AND ATTACKTYPE=?");
			ps.setString(1, loginid);
			ps.setString(2, "Bruteforceattack");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Profilebean pb=new Profilebean();
				int aid=rs.getInt(1);
				String loginid1=rs.getString(2);
				String password=rs.getString(3);
				String attacktype=rs.getString(4);
				
				pb.setAid(aid);
				pb.setLoginid(loginid1);
				pb.setPassword(password);
				pb.setAttacktype(attacktype);
				list.add(pb);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
	

}