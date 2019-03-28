package com.kopo.human;

public class MethodMain {

	public static void main(String[] args) {
		Send se = new Send(10);
		se.send();
		Mp3 m =new Mp3();
		se.sendObject(m);
		System.out.println(m.i);
//		se.sendObject(new Tv());
//		se.sendObject(new Radio());
		SingleTonTest stt = SingleTonTest.getInstance();
	}
}
