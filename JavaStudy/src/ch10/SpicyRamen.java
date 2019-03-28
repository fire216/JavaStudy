package ch10;

public class SpicyRamen extends Ramen { // 상속 코드
	public SpicyRamen(String name) {
		super.name = name;
	}
	// 오버라이드 코드

	public String getTaste() {
		return name + " 매운맛";
	}
	
}
