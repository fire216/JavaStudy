package ch08;

import java.awt.Color;

public class Exam8_2 {
	public static void main(String[] args) {
		Bike bike = new Bike(); // 기본 생성자
		System.out.println(bike.getCc());
		System.out.println(bike.getColor());
		System.out.println(bike.getCompany());

		Bike bike2 = new Bike(250, "BMW"); // 매개변수 2개 생성자
		System.out.println(bike2.getCc());
		System.out.println(bike2.getColor());
		System.out.println(bike2.getCompany());

		Bike bike3 = new Bike(250, Color.RED, "SUZUKI"); // 매개변수 3개 생성자
		System.out.println(bike3.getCc());
		System.out.println(bike3.getColor());
		System.out.println(bike3.getCompany());
	}
}
