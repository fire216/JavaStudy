package com.kopo.human;

public class ThrowsMain {
	public void test() {
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.test(0);
		}catch(Exception e) {
//			throw new KopoException(e); --> ���߿� �����鶧 �� ����
		}
	}
	public static void main(String[] args) {
		ThrowsMain tm = new ThrowsMain();
		tm.test();

	}

}
