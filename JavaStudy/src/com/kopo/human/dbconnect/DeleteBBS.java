package com.kopo.human.dbconnect;

public class DeleteBBS {

	public void deleteBBS(int articleNum) {
		BBSDaoImpl.getDBObject().deleteBBS(articleNum);
	}
	public static void main(String[] args) {
		DeleteBBS db = new DeleteBBS();
		db.deleteBBS(27);
	}
}