package ch09;

import ch07.blood.Human;

public class SportsCar extends Car {
	char color = 'R';
	String s;

	@Override //권장
	void move() {
		System.out.println("스포츠가 이동 시속 300km");
	}
	
	SportsCar() {
		System.out.println("SportsCar 객체 생성");
		Object obj = null;
		
		Human human4 = null;
		Human human3 = null;
		Human human2 = null;
		Human human1 = null;
		
		//Object ob = human4;
		
		Object[] ob = { human1,human2 };
	}

	void openSunloof() {
		System.out.println("썬루프 열림");
	}
}
