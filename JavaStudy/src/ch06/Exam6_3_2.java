package ch06;

public class Exam6_3_2{
	
	public static void main(String[] args) {
		
		getBetweenSum(3, 5);
		getBetweenSum(7, 7);
		getBetweenSum(5, 3);
		getBetweenSum(1, 10);
		
		
	}
	
	public static void getBetweenSum(int a, int b) {
		
	int sum = 0;
	if(a <= b) {
		for(int i = a; i <= b; i++) {
			sum = sum + i;
		} 
		System.out.println(sum);
	}
		
	if(a > b) {
		for(int i = b; i <= a; i++ ) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	}
	
	
	}

	
	