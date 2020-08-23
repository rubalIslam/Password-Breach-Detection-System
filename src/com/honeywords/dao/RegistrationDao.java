package com.honeywords.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.honeywords.db.DbCon;
import com.honeywords.dto.Profilebean;





public class RegistrationDao extends DbCon{

public int register(Profilebean pb) {
		
		int i=0;
		int k=0;
		int hid=0;
		Connection con=null;
		String loginid=pb.getLoginid();
		String password=pb.getPassword();
		String username=pb.getUsername();
		String email=pb.getEmail();
		String mobile=pb.getMobileno();
		String gender=pb.getGender();
		String address=pb.getAddress();
		String role=pb.getRole();
		String honey1=pb.getHoney1();
		String honey2=pb.getHoney2();
		String honey3=pb.getHoney3();
		String honey4=pb.getHoney4();
		String honey5=pb.getHoney5();
		 
		
		con=getConnection();
		
		System.out.println("connection post***************"+con);
		
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into USERINFO(LOGINID,PASSWORD,ROLE,USERNAME,MAIL,MOBILE,GENDER,ADDRESS,STATUS) values(?,?,?,?,?,?,?,?,?)");
			
		pstmt.setString(1, loginid);
		pstmt.setString(2, password);
		pstmt.setString(3, role);
		pstmt.setString(4, username);
		pstmt.setString(5, email);
		pstmt.setString(6, mobile);
		pstmt.setString(7, gender);
		pstmt.setString(8, address);
		pstmt.setString(9, "Pending");
		
		
		 i=pstmt.executeUpdate();
		
		System.out.println(i+"Record is Inserted successfully");
		
		PreparedStatement ps1=con.prepareStatement("select max(H_ID) from HONEYWORDS_TABLE");
		
		ResultSet rs=ps1.executeQuery();
		while (rs.next()) {
			hid=rs.getInt(1);
			hid=hid+1;
			
		}
		
		PreparedStatement pstmt1=con.prepareStatement("insert into HONEYWORDS_TABLE	(H_ID,LOGINID,HONEYWORD1,HONEYWORD2,HONEYWORD3,HONEYWORD4,HONEYWORD5) values(?,?,?,?,?,?,?)");
		
		pstmt1.setInt(1, hid);
		pstmt1.setString(2, loginid);
		pstmt1.setString(3, honey1);
		pstmt1.setString(4, honey2);
		pstmt1.setString(5, honey3);
		pstmt1.setString(6, honey4);
		pstmt1.setString(7, honey5);
		
		
		 k=pstmt1.executeUpdate();
		
		System.out.println(k+"Record is Inserted successfully");
		
		con.close();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return i;
	}
	
	

}
