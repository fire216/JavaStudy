package ch06;

import java.util.Calendar;

public class Exam6_3_3sol2{
	//ctrl + D : ���� ����
	public static int getLastYear2(int month) {
	
		Calendar cal = Calendar.getInstance();
		//������ ��¥�� �޷� ����
		cal.set(2019, month - 1, 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		return lastDate;	
	}
	public static void main(String[] args) {
		int lastDate = getLastYear2(2);
		System.out.println(lastDate);
	}
}

	
	