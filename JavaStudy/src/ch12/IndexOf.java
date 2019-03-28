package ch12;

public class IndexOf {
	public static void main(String[] args) {
		// 0123456789
		String text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
		System.out.println(text.length());
		int index = -1;

		while (true) {
			index = text.indexOf("ipsum", index + 1);
			System.out.println(index);
			if (index == -1) {
				break;
			}
		}
	}
}
