package another;

import ch07.Notebook;

public class Test {
	public static void main(String[] args) {
		Notebook nb1 = new Notebook();
		nb1.setPrice(100);
		nb1.print();
		//nb1.price = 100; --> 사용불가
	}
}
