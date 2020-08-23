package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.honeywords.db.DbCon;

public class Requestacceptdao extends DbCon {

	public int acceptdao(String loginid) {
		
		Connection con=getConnection();
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement("update USERINFO set STATUS=? where LOGINID=?");
			ps.setString(1, "Active");
			ps.setString(2, loginid);
			i=ps.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return i;
	}

}
