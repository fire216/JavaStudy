package ch12;

import java.awt.*;

//���� �����尡 �������� ��� �߻��� ����, �������� �����ϴ� ���
public class BeepPrintExample1 {
public static void main(String[] args) {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i = 0; i < 5; i++) {
		toolkit.beep();
		try {Thread.sleep(500);} catch(Exception e) {}
			}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
				// 0.5�ʰ� �Ͻ�����
			try {Thread.sleep(500); } catch(Exception e) {}
			
		}
	}
}

