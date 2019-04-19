package ch12;

import java.awt.*;

//메인 스레드가 비프음을 모두 발생한 다음, 프린팅을 시작하는 경우
public class BeepPrintExample1 {
public static void main(String[] args) {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i = 0; i < 5; i++) {
		toolkit.beep();
		try {Thread.sleep(500);} catch(Exception e) {}
			}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
				// 0.5초간 일시정지
			try {Thread.sleep(500); } catch(Exception e) {}
			
		}
	}
}

