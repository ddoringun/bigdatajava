package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SelectProcessing {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	
	public String[] select(MemberDTO dto) throws Exception {
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		

		
		String sql = "select * from member where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId() );

		System.out.println("3. SQL문 선택 OK...");
		
		
		System.out.println("4. SQL문 전송 OK...");
//		4. SQL 전송
		rs = ps.executeQuery();
		String[] mem = null;
		if(rs.next()) { //레코드 존재 o
			mem = new String[4];
			String s1= rs.getString(1); //id
			String s2= rs.getString(2); //pw
			String s3= rs.getString(3); //name
			String s4= rs.getString(4); //tel
			mem[0] = s1;
			mem[1] = s2;
			mem[2] = s3;
			mem[3] = s4;
//			System.out.println("검색된 ID : " + s1);
//			System.out.println("검색된 PW : " + s2);
//			System.out.println("검색된 NAME : " + s3);
//			System.out.println("검색된 TEL : " + s4);
			
		}else {// 레코드 존재 X
			System.out.println("검색 결과가 없습니다.");
		}
		
		return mem;
	
	}
	
}

































