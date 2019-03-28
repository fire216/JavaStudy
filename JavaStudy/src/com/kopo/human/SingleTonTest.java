package com.kopo.human;

public class SingleTonTest {
	private static SingleTonTest stt = new SingleTonTest(); 
	
	private SingleTonTest() { //�ܺο��� ���� ����
		
	}
	
	public static SingleTonTest getInstance() {
		if(stt == null) {
			stt = new SingleTonTest();
		}
		return stt;
	}
}
