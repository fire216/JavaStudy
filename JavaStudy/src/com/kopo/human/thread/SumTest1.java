package com.kopo.human.thread;

public class SumTest1 extends Thread {	
	long amount;
	
	
	public SumTest1(long amount){
		this.amount= amount;
	}
	@Override
	public void run() {
		long before = System.currentTimeMillis();
		for(long i=amount-3_000_000_000L; i<=amount;i++){
			Test.total= Test.total+i;
		}
		System.out.println(System.currentTimeMillis()-before);
//	    ������������� ���װ� ����..����ȭ�� �������Ƿ� -- �������� �Ϸ��� total�޼ҵ带 ����� synchronized(����ȭ)�ϸ� �� ����
		System.out.println(Test.total);		
	}
	

}
