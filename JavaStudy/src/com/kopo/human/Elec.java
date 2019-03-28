package com.kopo.human;

public interface Elec {
//	private int j=9; // 캡슐화 -> 접근을 제한하기 위해서
//    int i=7;
//	public int k=11;// 접근 제한 X

	int i = 9; //public static final이 생략 돼있음
	
	public void volumeUp(); //추상메소드
	public void volumeDown();
	
}
