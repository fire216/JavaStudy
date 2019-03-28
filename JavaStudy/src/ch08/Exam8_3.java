package ch08;

public class Exam8_3 {
	public static void main(String[] args) {
		// 매장 5개 정보 저장
		Shop[] shops = new Shop[5];
		// 1번 매장
		Shop s1 = new Shop();
		s1.setShopName("A");
		s1.setTelNum("001");
		s1.setHasParking(true);
		shops[0] = s1;

		// 2번 매장
		Shop s2 = new Shop("B", "002", false);
		shops[1] = s2;
		// 3번 매장
		shops[2] = new Shop("C", "003", true);
		// 4번 매장
		shops[3] = new Shop("D", "004", false);

		// 5번 매장
		shops[4] = new Shop("E", "005", true);
		
		
	}
}
