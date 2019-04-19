package com.kopo.human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class CollectionTest {

	public static void main(String[] args) {
		CollectionTest colt = new CollectionTest();
		colt.testArrayList();
		colt.testHashMapList();
	}

	public void testArrayList() {
		// jdk1.6������ ����
//		ArrayList<Mp3> al = new ArrayList<Mp3>();

		// jdk1.7���ʹ� �Ʒ��� ���� ��� ����
		ArrayList<Elec> al = new ArrayList<>();
//		ArrayList<int> al = new ArrayList<>(); ---> (x)
		ArrayList<Integer> al1 = new ArrayList<>();
		
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
			System.out.println("�ش� ��ü�� �ֽ��ϴ�");
		}

		if (al.contains(n)) {
			System.out.println("1 : �ش� ��ü�� �ֽ��ϴ�");
		} else {
			System.out.println("2 : �ش� ��ü�� �����ϴ�");
		}
	}

	public void testHashMapList() {
		HashMap<String, Elec> hm = new HashMap<>();
		hm.put("1st", new Mp3());
		hm.put("2st", new Radio());
		hm.put("3st", new Tv());
		hm.put("4st", new Elec() {
			
			//��ȸ������ �ѹ� �ۿ� �� ��
			@Override
			public void volumeUp() {
				System.out.println("Cell�� ������");
				
			}

			@Override
			public void volumeDown() {
				System.out.println("Cell�� �����ٿ�");
				
			}
			
		});

		System.out.println(hm);
		System.out.println("toString �޼ҵ�:"+ new Mp3()); //print �ȿ� ��ü�� ������ �� ��ü�� �ؽ��±װ� �۵���

		// key���� ���
		Set<String> ss = hm.keySet();
		// Object[] ob = ss.toArray();
		for (String temp : ss) {
			System.out.println(temp);
		}

		// value���� ���
		Collection<Elec> co = hm.values();
		for (Elec temp : co) {
			temp.volumeDown();
			temp.volumeUp();
		}

		// key �� value ���� ���
		Set<String> ss1 = hm.keySet();
		for (String temp : ss1) {
			System.out.print("Ű ����:" + temp + " ");
			System.out.println("value ����:" + hm.get(temp));
		}

		// entrySet()�� �̿��Ͽ� key�� value�� ���� ������
		Set<Map.Entry<String, Elec>> es = hm.entrySet(); // elec�� �ٸ� ��Ű���� �־ ���������µ�? �������� ��� ���� ����
		for (Map.Entry<String, Elec> entry : es) {
			System.out.println("Ű ����:" + entry.getKey());
			System.out.println("value ����:" + entry.getValue());
		}
	}
}
