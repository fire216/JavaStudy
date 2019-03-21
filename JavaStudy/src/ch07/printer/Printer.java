package ch07.printer;

public class Printer {
	int count2 = 0;
	public void print2() {
		count++;
		System.out.println("출력");
	}
	
	
	static int count = 0;
	public static void print() {
		count++;
		System.out.println("출력");
	}
}
