package ch09;

public class Car {
	int tire = 4;
	int door = 2;
	
	//1.사랑에게 오버라이드를 했다 라는 사실을 알려주기 위해서
	//2.오버라이드를 하면서 오타 발생과 같은 실수를 방지하기 위해서
	@Override // 애노테이션  Annotation
	public String toString() {
		return tire + " " + door;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		String content = c1. toString();
		System.out.println(content);
	}

	Car() {
		System.out.println("Car 객체 생성");
	}

	void move() {
		System.out.println("이동");
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
}