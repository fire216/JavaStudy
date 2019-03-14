package ch03;

public class operation4 {
	public static void main(String[] args) {
		int num = 1242324;
		int sum = 0;
		while(num > 0) {
			int n = num % 10;// 마지막 자리 숫자 뜯어내기
			System.out.println(n);
			num = num / 10;
			sum = sum + n;
		}
		System.out.println(sum);
		
		
		
		
//		int n1 = num % 10;
//		
//		num = num / 10;
//		
//		int n2 = num % 10;
//		
//		num = num / 10;
//		
//		int n3 = num % 10; 
//		
//		num = num / 10;
//		
//		int n4 = num % 10; 
//		
//		System.out.println(n1+n2+n3+n4);
//		
		
		
	}

}
