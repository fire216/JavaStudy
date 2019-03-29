package com.kopo.human;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	Random rd = new Random();
	TreeSet<Integer> ts = new TreeSet<>();// 중복값 배제
	
	public void start() {
		while (true) {
			int result = rd.nextInt(44) + 1; // 1 ~ 45까지 임의의 수
			ts.add(result);
			if(ts.size() == 6) {
				break;
			}
		}
		
		System.out.println(ts);
		
	}

	public static void main(String[] args) {
		Lotto lo = new Lotto();
		lo.start();
	}
}
