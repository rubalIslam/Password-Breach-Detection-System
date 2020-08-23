package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;

public class Honeyworddao extends DbCon {

	public ArrayList<Profilebean> honeywords(String loginid) {
		
		Connection con=getConnection();
		ArrayList<Profilebean> list=new ArrayList<Profilebean>();
		try {
			PreparedStatement ps=con.prepareStatement("select HONEYWORD1,HONEYWORD2,HONEYWORD3,HONEYWORD4,HONEYWORD5 from HONEYWORDS_TABLE where LOGINID=? ");
			ps.setString(1, loginid);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Profilebean pb=new Profilebean();
				String honey1=rs.getString(1);
				String honey2=rs.getString(2);
				String honey3=rs.getString(3);
				String honey4=rs.getString(4);
				String honey5=rs.getString(5);
				
				pb.setHoney1(honey1);
				pb.setHoney2(honey2);
				pb.setHoney3(honey3);
				pb.setHoney4(honey4);
				pb.setHoney5(honey5);
				list.add(pb);
			}
		} catch (SQLException e) {
			           
			e.printStackTrace();
		}
		return list;
	}
	

}
