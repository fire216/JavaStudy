package ch06;

public class Exam6_3_3{
	public static void main(String[] args) {
		getLastYear(1);
		getLastYear(2);
		getLastYear(9);
		getLastYear(11);
	}
	
    public static void getLastYear(int month) {
    	
    	
    	
    	
    	if( month <= 7 && month % 2 != 0 || month == 8 || month == 10 || month == 12) {
    		
    		System.out.println(31);
    	}
    	else if( month <= 2 && month % 2 == 0 ) {
    		
    		System.out.println(28);
    	}else if(month <= 6 && month % 2 == 0 || month <= 11 && month % 2 != 0 ){
    		
    		System.out.println(30);
    		
    	}
    	
    }
}

	
	