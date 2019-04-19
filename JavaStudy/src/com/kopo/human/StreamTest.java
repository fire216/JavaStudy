package com.kopo.human;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamTest {
	int temp = 0;

	public void test() {
		try {
			FileInputStream fs = new FileInputStream("d:/a.txt");// '1����Ʈ'�� �о���� Ŭ���� import(Ŭ��������)
			long before = System.currentTimeMillis();
			while ((temp = fs.read()) != -1) {
				System.out.print((char) temp);
			}
			System.out.println();
			long amount = System.currentTimeMillis() - before;
			System.out.println("FileInputStream ��� while ���� �ɸ��ð� " + amount);
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 2.FileReader ���
	public void test1() {
		try {
			FileReader fr = new FileReader("d:/a.txt");
			FileWriter fw = new FileWriter("d:/test1.txt");
			long before = System.currentTimeMillis();
			while ((temp = fr.read()) != -1) {
				fw.write(temp);
			}

			long amount = System.currentTimeMillis() - before;
			System.out.println("����ð�(Reader,Wirter) while���� �ɸ��ð� : " + amount);
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3.
	public void test2() {
		String tempStr;
		try {
			BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("d:/test5.txt"));
			long before = System.currentTimeMillis();

			while ((tempStr = br.readLine()) != null) { // ���پ� �о��
				System.out.println(tempStr);
				bw.write(tempStr + "\r\n");
			}
			long amount = System.currentTimeMillis() - before;
			System.out.println(" �ɸ��ð� : " + amount);
			br.close(); // �ý��� ���� ����
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 4. jdk 1.7���� ��� ����

	public void test3() {
		String tempStr;

		try (BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("d:/test3.txt"))) {

			while ((tempStr = br.readLine()) != null) { // ���پ� �о��
				System.out.println(tempStr);
				bw.write(tempStr + "\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StreamTest st = new StreamTest();
//		st.test();
//		st.test1();
//		st.test2();
		st.test3();
	}
}
