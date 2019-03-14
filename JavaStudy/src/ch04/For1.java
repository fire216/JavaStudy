package ch04;

public class For1 {
	public static void main(String[] args) {
		//1.시작값	 2.끝값 (조건)  3.증감식
		
		int total = 0; // 항상 반복문 위에 위치 -> 반복문의 영향을 받지 않기 위해
		int realTotal = 0;
		
		//1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + ... + 10)
		for(int start = 1; start <= 10; start++) {
			//System.out.println("출력" + start);
			total = total + start;
			realTotal = realTotal + total;
		}
		System.out.println(total);
//		for(int end = 10; end >= 1; end--) {
//			System.out.println("감소출력" + end);
//		}
//		System.out.println("출력");
//		System.out.print("한 줄 출력");
//		System.out.print("또 한 줄 출력");
//		System.out.println();
//		System.err.println("에러 출력");
//		// 1 2 3 조건이 제대로 맞지 않는 조건
//		for(int idx = 1; ;idx++) {
//			System.out.println(idx);
//		}
	}
}
