package ch04;

public class Exam4_4_2 {
	public static void main(String[] args) {
		
		//1000 이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력
		//출력된 숫자들의 합을 구하는 코드 작성
		// 코드 작성
	
	int a = 0;
	int sum = 0;
	 for(a=1; a<=1000; a++) {
		 if(a % 14 == 0) {
			 sum = sum + a;
			 System.out.println(a);
		 }
	 }
	 System.out.println("");
	 System.out.println("각 숫자들의 합 :"+ sum);
	}
}