package ch03;

import java.util.Scanner;

public class operation6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("영문자를 입력해주세요.");
		String txt = s.next();
		System.out.println(txt);
		//문장의 첫번째 글자를 char로 꺼내오기
		
		char txt2 = txt.charAt(0);
		
		//입력된 글자가 영어가 맞는지 검사
		boolean iscorrect = false;
		iscorrect = txt2 >= 'a' && txt2 <= 'z'
		            ||
		            txt2 >= 'A' && txt2 <= 'Z'; 
		
		            
		//출력
		System.out.println(iscorrect);
		
		
		
	}
}
