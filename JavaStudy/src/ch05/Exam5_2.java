package ch05;

//���� 0�� �ƴ� �迭����� �հ� ����� ���ϴ� �ڵ� �ۼ�
public class Exam5_2 {
	public static void main(String[] args) {
		 int[] arr = new int[10];



		 /* �ε����� 2�� ����� ��쿡�� �� �Է� */
		 for(int i = 0; i < arr.length; i++) {
		 if(i % 2 == 0) {
		 arr[i] = i + 10; // 10 12 14 16 18
		 }
		 }

		 int sum = 0;
		 int count = 0;
		 float avg = 0f;
		 // �ڵ��ۼ�
         
//		 for(int i = 0; i < arr.length; i += 2) {
//			 if(arr[i] != 0) {
//				 count = count + 1;
//				 sum = sum + arr[i];
//				 avg = sum/count;
//			 }
//		 }
         
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] > 0) {
				 count = count + 1;
				 sum += arr[i];
			 }
			 
		 }
		 avg = (float)sum / count;
		 System.out.println("�� : " + sum);
		 System.out.println("��� : " + avg);
		 }

}
