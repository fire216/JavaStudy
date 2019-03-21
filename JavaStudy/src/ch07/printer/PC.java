package ch07.printer;

public class PC {
	public void request2(Printer p) {
		p.print2();
	}
	public void request() {
		Printer.print();
	}
}
