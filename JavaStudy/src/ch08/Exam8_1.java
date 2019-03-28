package ch08;

// Exam8_1 클래스 코드가 동작될 수 있도록 Triangle 클래스의 코드 작성

public class Exam8_1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(); // 기본 생성자
		t1.setBottom(100.0f);
		t1.setHeight(200.0f);
		float tArea1 = t1.getArea();
		System.out.println(tArea1);

		Triangle t2 = new Triangle(20f, 50f); // 매개변수 2개 생성자
		float tArea2 = t2.getArea();
		System.out.println(tArea2);
	}
}
