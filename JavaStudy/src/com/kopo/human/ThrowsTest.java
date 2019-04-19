package com.kopo.human;

public class ThrowsTest {
	
	public void test(int number) throws Exception{
		int result = 4/number;
		System.out.println("결과출력 : " + result);
	}
//	public static void main(String[] args) throws Exception{ //예외처리를 JVM에게 미룬 경우
//		ThrowsTest tt = new ThrowsTest();
//		tt.test(0);
//	}
}
