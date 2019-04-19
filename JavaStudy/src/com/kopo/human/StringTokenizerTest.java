package com.kopo.human;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public void test() {
		String test1 = "aaa bb ccc dd ggg jejej aaa";
		StringTokenizer st1 = new StringTokenizer(test1);
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		String test = "aaa&bbb&hhh&kkk&HHUHU";
		StringTokenizer st = new StringTokenizer(test, "&");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

	public static void main(String[] args) {
		StringTokenizerTest stt = new StringTokenizerTest();
		stt.test();
	}
}
