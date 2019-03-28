package com.kopo.human;

public class SingleTonTest {
	private static SingleTonTest stt = new SingleTonTest(); 
	
	private SingleTonTest() { //외부에서 접근 못함
		
	}
	
	public static SingleTonTest getInstance() {
		if(stt == null) {
			stt = new SingleTonTest();
		}
		return stt;
	}
}
