package ch05;

//��ø �ݺ����� �̿��Ͽ� 1 ~ 9 ������ �����͸� �迭 arr�� �Է��ϴ� �ڵ� �ۼ�

public class Exam5_4 {
	 public static void main(String[] args) {
		 int[][] arr = new int[3][3];
		 // �ڵ� �ۼ�
		int count = 0;
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr.length; j++) {
				count = count + 1;
				arr[i][j] = count;
			}
		}
		 
		 
		 
		 
		 
		 /* �Էµ� ���� ��� */
		 for(int i = 0; i < arr.length; i++) {
		 for(int j = 0; j < arr[i].length; j++) {
		 System.out.print(arr[i][ j] + "\t");
		 }
		 System.out.println();
		 }
		 }

}
