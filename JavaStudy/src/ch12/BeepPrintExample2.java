package ch12;

import java.awt.*;

//�������� ���� �޼ҵ尡 ����ϰ� �������� ����ִ� ���� �۾� �����尡 ����ϵ��� ����
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

