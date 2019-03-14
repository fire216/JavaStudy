package ch03;

import java.util.Scanner;

public class operation2 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean 배수 = num % 3 == 0;
		System.out.println(배수);
		s.close();
	
	}

}
