package com.kopo.human.thread;

public class HamTest {
	public static Supply2 sp = new Supply2();
	public static void main(String[] args){	
		
		sp.start();
		try{			
			Consumer cs= new Consumer();
			Consumer cs1= new Consumer();
			Consumer cs2= new Consumer();
			Consumer cs3= new Consumer();
			cs.start();
			cs1.start();
			cs2.start();
			cs3.start();			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
