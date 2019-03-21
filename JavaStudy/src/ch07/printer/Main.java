package ch07.printer;

public class Main {
	public static void main(String[] args) {
		Printer p = new Printer();
		
		PC pc1 = new PC();
		pc1.request2(p);
		PC pc2 = new PC();
		pc1.request2(p);
	}
}
