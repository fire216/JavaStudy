package ch03;

import java.util.Scanner;

public class operation6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("�����ڸ� �Է����ּ���.");
		String txt = s.next();
		System.out.println(txt);
		//������ ù��° ���ڸ� char�� ��������
		
		char txt2 = txt.charAt(0);
		
		//�Էµ� ���ڰ� ��� �´��� �˻�
		boolean iscorrect = false;
		iscorrect = txt2 >= 'a' && txt2 <= 'z'
		            ||
		            txt2 >= 'A' && txt2 <= 'Z'; 
		
		            
		//���
		System.out.println(iscorrect);
		
		
		
	}
}
