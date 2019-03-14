package ch03;

public class Exam03_04 {
	public static void main(String[] args) {
		
		
		int num = 456;
		// 1번 % 연산자 활용
//		int remain = num % 100;
//		num = num - remain;
		// 2번 나누기, 곱하기 활용
		num = num / 100 * 100;
		
		System.out.println( num );
		// 나누기, 곱하기 연산자 이용
	}

}
