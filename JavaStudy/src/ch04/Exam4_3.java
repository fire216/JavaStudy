package ch04;

import java.util.Scanner;

public class Exam4_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("정수 3개 입력>>");
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();

		 /* 1. a가 b보다 크거나 같고 a가 c보다 적거나 같은 경우 */
		 /* 또는 a가 c보다 크거나 같고 a가 b보다 적거나 같은 경우 */
		 /* 중간 값은 a */
		  
		 /* 2. b가 a보다 크거나 같고 b가 c보다 적거나 같은 경우 */
		 /* 또는 b가 c보다 크거나 같고 b가 a보다 적거나 같은 경우 */
		 /* 중간 값은 b */		 
		 /* 3. 그 이외의 경우 */
		 /* 중간 값은 c */
		 if(a>=b && a<=c || a>=c && a<= b) {
			 System.out.println("중간값은 a");
		 }else if(b>=a && b<=c || b>=c && b<= a) {
			 System.out.println("중간값은 b");
		 }else {
			 System.out.println("중간값은 c");
		 }
		 scanner.close();
	}
}
