package ch06;

public class Exam6_3_3sol{
	//ctrl + D : 한줄 삭제
	public static int getLastYear(int month) {
		
		int date = 0;
		if(
				month == 1 || month == 3 || month == 5 || month == 7 
				|| month == 8 || month == 10
				) 
		{
			date = 31;
			//return 31;
		}else if(month == 2) {
			date = 28;
			//return 28;
		}else {
			date = 30;
			//return 30;
		}
		
		return date;
	}
	public static void main(String[] args) {
		int result = getLastYear(7);
		System.out.println(result);
    }
}

	
	