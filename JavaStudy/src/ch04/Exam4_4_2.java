package ch04;

public class Exam4_4_2 {
	public static void main(String[] args) {
		
		//1000 ������ �ڿ��� �߿��� 2�� ����̸鼭 7�� ����� ���ڸ� ���
		//��µ� ���ڵ��� ���� ���ϴ� �ڵ� �ۼ�
		// �ڵ� �ۼ�
	
	int a = 0;
	int sum = 0;
	 for(a=1; a<=1000; a++) {
		 if(a % 14 == 0) {
			 sum = sum + a;
			 System.out.println(a);
		 }
	 }
	 System.out.println("");
	 System.out.println("�� ���ڵ��� �� :"+ sum);
	}
}