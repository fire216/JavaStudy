package ch09;

public class InheritanceExam2 {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		Car c = null;
		c = (Car) sc; // 업캐스팅
		c.move();

		SportsCar sc2 = (SportsCar) c; // 다운캐스팅
		sc2.openSunloof();
		Car c2 = new Car();
		SportsCar sc3 = null;
		//sc3 = (SportsCar) c2; // Car 객체로 생성되었기 때문에 오류
		if (c2 instanceof SportsCar) {
			sc3 = (SportsCar) c2;
			sc3.openSunloof();
		} else {
			System.out.println("캐스팅 불가!");
		}
	}
}