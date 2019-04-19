package ch12;

import java.awt.*;

//프린팅은 메인 메소드가 담당하고 비프음을 들려주는 것은 작업 스레드가 담당하도록 수정
public class BeepPrintExample2 {
public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
}

