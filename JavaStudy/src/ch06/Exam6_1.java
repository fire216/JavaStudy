package ch06;

public class Exam6_1 {
	public static void main(String[] args) {
		 int result1 = plus(5, 3);
		 System.out.println("plus => " + result1);

		 int result2 = minus(5, 3);
		 System.out.println("minus => " + result2);
		 }

		 public static int plus(int num1, int num2) {
		 // 코드 작성
			 int plus = num1 + num2;
			 return plus;
		 }
		 public static int minus(int num1, int num2) {
		 // 코드 작성
			 int minus = num1 - num2;
			 return minus;
		 }
}
