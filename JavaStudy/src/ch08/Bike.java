package ch08;

import java.awt.Color;

public class Bike {
	 int cc; // 배기량
	 Color color; // 색상
	 String company; // 제조사
	 // 기본 생성자 작성
	 public Bike() {
		 super();
	 }
	 // 매개변수 2개 생성자 작성 (배기량, 제조사)
	 
	 public Bike(int cc, String company) {
		 super();
		 this.cc = cc;
		 this.company = company;
	 }
	 
	 // 매개변수 3개 생성자 작성
	 public Bike(int cc, Color color, String company) {
		 this.cc = cc;
		 this.color = color;
		 this.company = company;
	 }
	 
	 // cc, color, company 의 getter / setter 메소드 작성
	 public int getCc() {
		 return cc;
	 }
	 public void setCc(int cc) {
		 this.cc = cc;
	 }
	 public Color getColor() {
		 return color;
	 }
	 public void setColor(Color color) {
		 this.color = color;
	 }
	 public String getCompany() {
		 return company;
	 }
	 public void setCompany(String company) {
		 this.company = company;
	 }
	 

}
