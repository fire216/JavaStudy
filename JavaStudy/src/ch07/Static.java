package ch07;

public class Static {
	
	static char color = 'R';
	static int num = 0;
	int score = 0;
	
	static void staticMethod() {
		System.out.println("static method");
		num++;
		Static s = new Static();
		s.score++;
	}
	// ↓ 메모리 등록 된 것들 끼리 사용 가능 함
	void instanceMethod() {
		System.out.println("instance method");
		staticMethod();
	}
}