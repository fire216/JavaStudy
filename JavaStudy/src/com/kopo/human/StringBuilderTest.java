package com.kopo.human;

public class StringBuilderTest {
	//StringBuffer(동기화 기능 있음)와
	//StringBuilder(동기화 기능 없음)는 기능은 같음
	void test() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT *");
		sb.append("FROM BBS ");
		sb.append("WHERE ID=?");
		
		System.out.println(sb);
	}
	public static void main(String[] args) {
		StringBuilderTest sbt = new StringBuilderTest();
		sbt.test();
	}

}
