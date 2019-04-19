package com.kopo.human;

public class TryTest {
	public void test(int number) {
		try {
			int result = 4 / number;
			System.out.println("결과 출력 : " + result);

		} catch (ArithmeticException e) { // 예외처리
			System.out.println("입력값이 0이 올 수는 없습니다");
			e.printStackTrace();
			// e.toString();
			// e.getMessage();
		} catch (Exception a) { //부모가 뒤로 가야된다

		} finally { // DB접속을 끊음
			System.out.println("finally문에서 출력");
		}
	}
	
	

	public static void main(String[] args) {
		TryTest tt = new TryTest();
		tt.test(2);
	}
}
