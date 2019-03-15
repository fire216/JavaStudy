package ch03;

public class operation1 {
	public static int getA(int a) {
		a= -a;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
	    return a;
	}
		
	
	public static void main(String[] args) {
		int a = 20;
		int result = getA(a);
		System.out.println(result);
		
	}
}
