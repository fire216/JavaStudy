package com.kopo.human.thread;

public class Supply2 extends Thread{
	public int Ham=10;
	static int i=1;
	int j=1;
	
	public void run(){   
		while(true){
			try{
				Thread.sleep(3000);
				make();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public synchronized void make(){								
			Ham=Ham+1;			
			System.out.println(j+" 번째 햄버거 공급");
			// 행버가 0개 일때, 대기하게 만들고 1개 이상 만들어졌을때 (우선순위가 높은 ) 소비자를 먼저 꺠어나게 하는 메소드!
			//(notifyAll을 하면 4명이 동시에 깨어나지만... 구입하러 들어오는 새끼는 1명
			
			this.notify();	
			j++;			
	}
	
	public synchronized void buy(){
		Thread t = Thread.currentThread();
		while( Ham==0){
			System.out.println("햄버거 다팔림");
			System.out.println("wait된 쓰레드"+t.getName());			
			try{
				wait();					
				System.out.println("wait에서 깨어난 쓰레드 "+t.getName());
				System.out.println("쓰레드 상태 "+t.getState());							
			}catch(Exception e){
				e.printStackTrace();
			}			
		}
		Ham=Ham-1;
		System.out.println(t.getName()+" "+i+" 번째햄버거 팔림");
		i++;		
	}
}
