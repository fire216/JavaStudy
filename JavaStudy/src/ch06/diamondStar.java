package ch06;

public class diamondStar {
	public static void main(String[] args) {
		//1 2 [3] 4 5
		int size = 11;
		int center = size / 2 + 1;
		int left = center - 1;
		int right = center + 1;
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				if(j <= left || j >= right) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			if(i < center) {
				left--;
				right++;	
			}else {
				left++;
				right--;
			}
			
			System.out.println();
		}
		
	}
}
