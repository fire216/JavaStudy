package ch06;

public class Exam6_3_2sol {
	public static int getBetweenSum(int n1, int n2) {
		int sum = 0;
		//2 - »ïÇ×¿¬»êÀÚ
		//int start = n1 > n2 ? n2 : n1;
		//int end = n1 < n2 ? n1 : n2;
		
		//1
		if(n1 > n2) { // 5 > 3
			int temp = 0;
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		for(int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}
public static void main(String[] args) {
		int sum = getBetweenSum(5,3);
		System.out.println(sum);
		
	}
	
}

