package com.kopo.human.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BasicDBConnection {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public void connect() throws Exception {

//  -오라클 접속방법
//	1.오라클 드라이버 로드(Class,forName()사용)
//	2.DriverManager의 getConnection() 이용하여 db접속	
//	3.Connection의 prepareStatement()를 이용하여 쿼리문을 심고  PreparedStatement리턴 받음
//	4.PreparedStatement를 이용하여 쿼리실행
//	5.쿼리문 실행은 두가지가 있음
//	  a. select문 : executeQuery()
//	  b. insert, delete,update 문 : executeUpadate()
//  6. 5번 경우에서 a는 ResultSet을 리턴 받음,
//		b는 정수를 리턴받음
//	7. select문을 쿼리로 실행했으면 ResultSet을 이용하여 리턴 받은 값을 읽어내야함
		
		//1.
		Class.forName("oracle.jdbc.driver.OracleDriver"); //하나를 공유해서 쓰기 위해
		//2.
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		conn = DriverManager.getConnection(url,"hr","1234");
		
		StringBuilder query = new StringBuilder();
		query.append("SELECT FIRST_NAME,SALARY,DEPARTMENT_ID ");
		query.append("FROM EMPLOYEES ");
		
		pstmt = conn.prepareStatement(query.toString());
		rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString("FIRST_NAME")+" ");
			System.out.print(rs.getInt("SALARY")+" ");
			System.out.println(rs.getInt("DEPARTMENT_ID")+" ");
		}
		
		rs.close();
		pstmt.close();
		conn.close();
	}
	public static void main(String[] args) throws Exception {
		BasicDBConnection dbc = new BasicDBConnection();
		dbc.connect();
	}

}
