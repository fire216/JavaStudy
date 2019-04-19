package com.kopo.human.dbconnect;

import java.util.ArrayList;

public class InsertBBS {
	public void insertBBS() {
		BBSDto article = new BBSDto();
		article.setId("human");
		article.setTitle("테스트용입니다");
		article.setContent("여러분 공부 합시다..~~~");
		
		BBSDaoImpl.getDBObject().insertBBS(article);
	}
	public void insertBBSAll() {
		ArrayList<BBSDto> articleList = new ArrayList<BBSDto>();		
		BBSDto article;
		int i = 0;
		while(i<10) {
			article = new BBSDto();
			article.setId("human");
			article.setTitle("테스트용입니다");
			article.setContent("여러분 주말에도 공부 합시다..~~~");
			articleList.add(article);
			i++;
		}
		BBSDaoImpl.getDBObject().insertBBSAll(articleList);
	}
	public static void main(String[] args) {
		InsertBBS ib = new InsertBBS();
//		ib.insertBBS();
		ib.insertBBSAll();
	}
}