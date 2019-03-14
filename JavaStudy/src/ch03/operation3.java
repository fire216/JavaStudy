package ch03;

import java.util.Scanner;

public class operation3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요. ");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요. ");
		int num2 = s.nextInt();
	
		System.out.println(num1 + " " + num2);
	
		boolean result = (num1 * num2) % 3 == 0;
		System.out.println(result);
		
		
	}

}
