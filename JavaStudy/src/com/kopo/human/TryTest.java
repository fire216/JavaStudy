package com.kopo.human;

public class TryTest {
	public void test(int number) {
		try {
			int result = 4 / number;
			System.out.println("��� ��� : " + result);

		} catch (ArithmeticException e) { // ����ó��
			System.out.println("�Է°��� 0�� �� ���� �����ϴ�");
			e.printStackTrace();
			// e.toString();
			// e.getMessage();
		} catch (Exception a) { //�θ� �ڷ� ���ߵȴ�

		} finally { // DB������ ����
			System.out.println("finally������ ���");
		}
	}
	
	

	public static void main(String[] args) {
		TryTest tt = new TryTest();
		tt.test(2);
	}
}
