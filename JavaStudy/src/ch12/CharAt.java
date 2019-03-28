package ch12;

public class CharAt {
	public static void main(String[] args) {
		String pw = "pAss12!@";
		boolean upper = false;// 대문자 확인 변수
		boolean lower = false;// 소문자 확인 변수
		boolean num = false;
		for(int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if(ch >= 65 && ch <= 90) { //대문자
				upper = true;
			}else if(ch >= 97 && ch <= 122) { //소문자
				lower = true;
			}else if(ch >= 48 && ch <= 57) { //숫자
				num = true;
			}
		}
		if(upper && lower && num) {
			System.out.println("회원가입");
		}else {
			System.out.println("다시 입력해주세요");
		}
	}
	
	
}
