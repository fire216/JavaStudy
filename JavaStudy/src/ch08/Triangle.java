package ch08;

public class Triangle {
	float bottom;
	float height;

	 // 기본 생성자 작성
	public Triangle() {}
	 // 매개변수 2개 생성자 작성
	public Triangle(float bottom, float height) {
		this.bottom = bottom;
		this.height = height;
	}
	 // getArea 메소드 작성
	public float getArea() {
		return bottom * height * 0.5f;
	}
	 // bottom, height 의 getter / setter 메소드 작성
	public float getBottom() {
		return bottom;
	}
	public void setBottom(float bottom) {
		this.bottom = bottom;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
}
