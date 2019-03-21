package ch07;

// 자료형의 목적
// 반드시 변수가 존재
// 그 변수의 값을 수정할 수 있는 메소드가 존재

//Java Bean (POJO : Plain Old Java Object)
public class Notebook {
	int price;
	String brand;
	float size;
	public void print() {
		System.out.println(price + brand + size);
	}
	
	// set 역할 메소드 / get 역할 메소드
	public void setSize(float s) {
		size = s;
	}
	public float getSize() {
		return size;
	}
	public void setBrand(String s) {
		brand = s;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
}
