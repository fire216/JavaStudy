package ch05;

//중첩 반복문을 이용하여 1 ~ 9 까지의 데이터를 배열 arr에 입력하는 코드 작성

public class Exam5_4 {
	 public static void main(String[] args) {
		 int[][] arr = new int[3][3];
		 // 코드 작성
		int count = 0;
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr.length; j++) {
				count = count + 1;
				arr[i][j] = count;
			}
		}
		 
		 
		 
		 
		 
		 /* 입력된 내용 출력 */
		 for(int i = 0; i < arr.length; i++) {
		 for(int j = 0; j < arr[i].length; j++) {
		 System.out.print(arr[i][ j] + "\t");
		 }
		 System.out.println();
		 }
		 }

}
