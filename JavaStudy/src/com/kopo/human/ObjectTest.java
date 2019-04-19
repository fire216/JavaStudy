package com.kopo.human;

public class ObjectTest {

	public void test() {
		Radio rd = new Radio();
		Radio rd1 = new Radio();
		Radio rd2 = rd1;
		Radio rd3 = rd2;
		String st = new String("ㄱㄱ");
		String st1 = new String("ㄱㄱ");
		String st2 = st1;
//		if(rd1.equals(rd2)) {
//			System.out.println("참조값이 같습니다");
//		}
//		if(rd1==rd2) {
//			System.out.println("참조값이 같습니다");
//		}
		if (st == st1) { // 참조값이 다름
			System.out.println("참조값이 같습니다");
		}
		if (st.equals(st1)) { // 문자열 내용이 같다
			System.out.println("문자열이 같습니다");
		}
		System.out.println(new Mp3());
		System.out.println(new BDSDto());
	}

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.test();
	}
}
