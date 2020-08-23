package com.honeywords.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;

public class Attackdao extends DbCon {

	public int bruteforceattack(Profilebean pb) {
		
		int aid=0;
		int i=0;
		Connection con=null;
		String loginid=pb.getLoginid();
		String password=pb.getPassword();		 
		
		con=getConnection();		
		System.out.println("connection post***************"+con);		
		try {		
		PreparedStatement ps1=con.prepareStatement("select max(A_ID) from ATTACK_TABLE");
		
		ResultSet rs=ps1.executeQuery();
		while (rs.next()) {
			aid=rs.getInt(1);
			aid=aid+1;			
		}
		PreparedStatement pstmt=con.prepareStatement("insert into ATTACK_TABLE(A_ID,LOGINID,PASSWORD,ATTACKTYPE) values(?,?,?,?)");
		pstmt.setInt(1, aid);
		pstmt.setString(2, loginid);
		pstmt.setString(3, password);
		pstmt.setString(4, "Bruteforceattack");
		
		 i=pstmt.executeUpdate();
		
		System.out.println(i+"Record is Inserted successfully");
		con.close();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return i;
	}

	public int dosattack(Profilebean pb) {
		int aid=0;
		int i=0;
		Connection con=null;
		String loginid=pb.getLoginid();
		String password=pb.getPassword();		 
		
		con=getConnection();		
		System.out.println("connection post***************"+con);		
		try {		
		PreparedStatement ps1=con.prepareStatement("select max(A_ID) from ATTACK_TABLE");
		
		ResultSet rs=ps1.executeQuery();
		while (rs.next()) {
			aid=rs.getInt(1);
			aid=aid+1;			
		}
		PreparedStatement pstmt=con.prepareStatement("insert into ATTACK_TABLE(A_ID,LOGINID,PASSWORD,ATTACKTYPE) values(?,?,?,?)");
		pstmt.setInt(1, aid);
		pstmt.setString(2, loginid);
		pstmt.setString(3, password);
		pstmt.setString(4, "DenialServiceAttack");
		
		 i=pstmt.executeUpdate();
		
		System.out.println(i+"Record is Inserted successfully");
		con.close();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return i;
		
	}
		
	}
