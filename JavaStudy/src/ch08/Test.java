package ch08;

public class Test {
	public static void main(String[] args) {
		String data = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
		data= "map";
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);// < == g
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				if (c == 'y' || c == 'z' || c == 'Y' || c == 'Z') {
					System.out.print((char) (c + 2 - 26));
				}else {
					
					System.out.print((char) (c + 2));
				}

			} else {
				System.out.print(c);
			}
		}

//	    double result = Math.pow(2, 38);
//		System.out.println((int)result);
//		System.out.println((long)result);

	}

}
