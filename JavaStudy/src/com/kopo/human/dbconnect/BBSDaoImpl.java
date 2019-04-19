package com.kopo.human.dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BBSDaoImpl {
	private Connection conn; // 연결하는 클래스 (연결할때마다 인스턴스 하지 않기위해 싱글톤[그냥 암기하자] & Imple도 싱글톤해줌!)
	private PreparedStatement pstmt; // 쿼리문을 사전에 컴파일하는 클래스
	private ResultSet rs; // SELECT의 결과로 뿌려주는 클래스
	private StringBuilder query; // 쿼리문을 형식을 변환하여 받아오는 스트림
	private static BBSDaoImpl bbsDao = new BBSDaoImpl();
	
	private BBSDaoImpl() {
		
	}
	public static BBSDaoImpl getDBObject() {
		if(bbsDao == null) {
			bbsDao = new BBSDaoImpl();
		}
		return bbsDao;
	}
	public void insertBBS(BBSDto article) {
		try {
			query = new StringBuilder();
			query.append("INSERT INTO BBS VALUES(");
			query.append("BBS_SEQ.NEXTVAL,?,?,?,SYSDATE,?)");
			conn=DBconnSingleTon.getDBconn().getConnection();
			conn.prepareStatement(query.toString());
			pstmt=conn.prepareStatement(query.toString());
			pstmt.setString(1,article.getId());
			pstmt.setString(2,article.getTitle());
			pstmt.setString(3,article.getContent());
			pstmt.setString(4,article.getFname());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void insertBBSAll(ArrayList<BBSDto> articleList) {
		try {
			query = new StringBuilder();
			query.append("INSERT INTO BBS VALUES(");
			query.append("BBS_SEQ.NEXTVAL,?,?,?,SYSDATE,?)");
			conn=DBconnSingleTon.getDBconn().getConnection();
			conn.prepareStatement(query.toString());
			pstmt=conn.prepareStatement(query.toString());
			for(BBSDto article:articleList) {
			pstmt.setString(1,article.getId());
			pstmt.setString(2,article.getTitle());
			pstmt.setString(3,article.getContent());
			pstmt.setString(4,article.getFname());
			pstmt.executeUpdate();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectBBS(int articleNum) {
		try {
			query = new StringBuilder();
			query.append("SELECT * ");
			query.append("FROM BBS ");
			query.append("WHERE ARTICLENUM=? ");
			conn=DBconnSingleTon.getDBconn().getConnection();
			conn.prepareStatement(query.toString());
			pstmt=conn.prepareStatement(query.toString());
			pstmt.setInt(1,articleNum);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.print(rs.getInt("articleNum")+ " ");
				System.out.print(rs.getString("id")+ " ");
				System.out.print(rs.getString("title")+ " ");
				System.out.print(rs.getString("content")+ " ");
				System.out.print(rs.getString("writeDate")+ " ");
				System.out.print(rs.getString("fname"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateBBS(int articleNum) {
		try {
			query = new StringBuilder();
			query.append("UPDATE BBS ");
			query.append("SET ID = ? ");
			query.append("WHERE ARTICLENUM=? ");
			conn=DBconnSingleTon.getDBconn().getConnection();
			conn.prepareStatement(query.toString());
			pstmt=conn.prepareStatement(query.toString());
			pstmt.setString(1,"TODAY");
			pstmt.setInt(2,articleNum);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteBBS(int articleNum) {
		try {
			query = new StringBuilder();
			query.append("DELETE ");
			query.append("FROM BBS ");
			query.append("WHERE ARTICLENUM=? ");
			conn=DBconnSingleTon.getDBconn().getConnection();
			conn.prepareStatement(query.toString());
			pstmt=conn.prepareStatement(query.toString());
			pstmt.setInt(1,articleNum);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}