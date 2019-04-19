package com.kopo.human.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

// 싱글톤 만드는 방법 (메모리에 new로 인하여 무한 인스턴스 되는 것을 막기위함!)
public class DBconnSingleTon {
	private static DBconnSingleTon dst = new DBconnSingleTon();
	
	private DBconnSingleTon() {
		
	}
		
	public static DBconnSingleTon getDBconn() {
		if(dst == null) {
			dst = new DBconnSingleTon();
		}
		return dst;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE"; 
			conn=DriverManager.getConnection(url, "hr", "1234"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}