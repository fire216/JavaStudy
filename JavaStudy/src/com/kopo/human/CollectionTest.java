package com.kopo.human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class CollectionTest {

	public static void main(String[] args) {
		CollectionTest colt = new CollectionTest();
		colt.testArrayList();
		colt.testHashMapList();
	}

	public void testArrayList() {
		// jdk1.6까지의 사용법
//		ArrayList<Mp3> al = new ArrayList<Mp3>();

		// jdk1.7부터는 아래와 같이 사용 가능
		ArrayList<Elec> al = new ArrayList<>();
		Mp3 m = new Mp3();
		Mp3 n = new Mp3();
		al.add(m);
		al.add(new Radio());
		al.add(new Tv());

		for (Elec temp : al) {
			temp.volumeUp();
			temp.volumeDown();
		}

		if (al.contains(m)) {
			System.out.println("해당 객체는 있습니다");
		}

		if (al.contains(n)) {
			System.out.println("1 : 해당 객체는 있습니다");
		} else {
			System.out.println("2 : 해당 객체는 없습니다");
		}
	}

	public void testHashMapList() {
		HashMap<String, Elec> hm = new HashMap<>();
		hm.put("1st", new Mp3());
		hm.put("2st", new Radio());
		hm.put("3st", new Tv());

		System.out.println(hm);

		// key값만 출력
		Set<String> ss = hm.keySet();
		// Object[] ob = ss.toArray();
		for (String temp : ss) {
			System.out.println(temp);
		}

		// value값만 출력
		Collection<Elec> co = hm.values();
		for (Elec temp : co) {
			temp.volumeDown();
			temp.volumeUp();
		}

		// key 와 value 동시 출력
		Set<String> ss1 = hm.keySet();
		for (String temp : ss1) {
			System.out.print("키 값은:" + temp +" ");
			System.out.println("value 값은:" + hm.get(temp));
		}

	}

}
