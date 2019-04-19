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
			FileInputStream fs = new FileInputStream("d:/a.txt");// '1바이트'로 읽어오는 클래스 import(클래스연동)
			long before = System.currentTimeMillis();
			while ((temp = fs.read()) != -1) {
				System.out.print((char) temp);
			}
			System.out.println();
			long amount = System.currentTimeMillis() - before;
			System.out.println("FileInputStream 사용 while 문이 걸린시간 " + amount);
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 2.FileReader 사용
	public void test1() {
		try {
			FileReader fr = new FileReader("d:/a.txt");
			FileWriter fw = new FileWriter("d:/test1.txt");
			long before = System.currentTimeMillis();
			while ((temp = fr.read()) != -1) {
				fw.write(temp);
			}

			long amount = System.currentTimeMillis() - before;
			System.out.println("복사시간(Reader,Wirter) while문이 걸린시간 : " + amount);
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

			while ((tempStr = br.readLine()) != null) { // 한줄씩 읽어낸다
				System.out.println(tempStr);
				bw.write(tempStr + "\r\n");
			}
			long amount = System.currentTimeMillis() - before;
			System.out.println(" 걸린시간 : " + amount);
			br.close(); // 시스템 부하 방지
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 4. jdk 1.7부터 사용 가능

	public void test3() {
		String tempStr;

		try (BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("d:/test3.txt"))) {

			while ((tempStr = br.readLine()) != null) { // 한줄씩 읽어낸다
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
