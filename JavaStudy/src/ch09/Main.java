package ch09;

public class Main {
	public static void drive(Car sc) {
		sc.move();
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		SportsCar sc = new SportsCar();
		Truck t = new Truck();
		
		drive(t);
		drive(sc);
		drive(c);
		
//		c.move();
//		sc.move();
//		sc.openSunloof();
//		
//		Car car2 = sc; // 업캐스팅
//	//	car2.openSunloof();// 오류
	}
}
