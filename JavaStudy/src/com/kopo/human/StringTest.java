package com.kopo.human;

public class StringTest {
public static void main(String[] args) {
	long first=System.currentTimeMillis();
	long result=0;
	for(long i = 0; i < 10_000_000_000l; i++) {
		result = result+1;
	}
	String aa = "aa";
	String bb = "aa";
	String cc = new String("aa");
	String dd = bb;
	System.out.println(aa.equals(bb));
	System.out.println(aa.equals(cc));
	System.out.println(aa==bb);
	System.out.println(bb==cc);
	System.out.println(aa==cc);
	System.out.println(dd==bb);
	System.out.println(dd.equals(cc));
	System.out.println(System.currentTimeMillis()-first);
	
}
}
