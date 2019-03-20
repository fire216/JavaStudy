package ch07;

import java.util.Scanner;

import com.java.Util;

public class test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.hasNext();
		
		int a = 10;
		boolean b = false;
		Util util = new Util();
		int last = util.getLastYear(12);
		System.out.println(last);
	}
}
