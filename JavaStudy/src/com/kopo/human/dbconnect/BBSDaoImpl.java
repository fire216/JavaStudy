package com.kopo.human.dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BBSDaoImpl {
	private Connection conn; // �����ϴ� Ŭ���� (�����Ҷ����� �ν��Ͻ� ���� �ʱ����� �̱���[�׳� �ϱ�����] & Imple�� �̱�������!)
	private PreparedStatement pstmt; // �������� ������ �������ϴ� Ŭ����
	private ResultSet rs; // SELECT�� ����� �ѷ��ִ� Ŭ����
	private StringBuilder query; // �������� ������ ��ȯ�Ͽ� �޾ƿ��� ��Ʈ��
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