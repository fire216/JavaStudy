package com.kopo.human.dbconnect;

public class UpdateBBS {
	
	public void updateBBS(int articleNum) {
		BBSDaoImpl.getDBObject().updateBBS(articleNum);
	}
	public static void main(String[] args) {
		UpdateBBS ub = new UpdateBBS();
		ub.updateBBS(27);
	}
}
