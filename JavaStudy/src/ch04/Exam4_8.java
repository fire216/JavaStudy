package ch04;

//1 ~ 1000 ������ ���� �� 3�� �����ϰ� �ִ� ���ڸ� ���

public class Exam4_8 {
	public static void main(String[] args) {
		int count = 0;
		 for(int i = 1; i <= 300; i++) {
		 // �ڵ� �ۼ�
	     //i % 3 == 0; (X) 
		 //i == 3
		     int num = i;
			 while(num > 0) {
			// 13    31 	 
			 int n = num % 10; // 3    1    3
			 if(n == 3) {
				 System.out.println(i);
				 count++;
				 break;
			 }
			 num = num / 10; // 3
		 }
	   }
		 System.out.println("���ڵ��� ����:" +count);
	}
	

}
