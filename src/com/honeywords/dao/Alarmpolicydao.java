package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.honeywords.db.DbCon;

public class Alarmpolicydao extends DbCon {

	public int viewalarampolicy(String loginid) {

		Connection con=getConnection();
		int count=0;
		try {
			PreparedStatement ps=con.prepareStatement("select count(*) from ATTACK_TABLE where loginid=?");
		ps.setString(1, loginid);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				 count=rs.getInt(1);
				
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return count;
	}
	

}
