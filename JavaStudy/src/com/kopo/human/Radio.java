package com.kopo.human;

public class Radio implements Elec {

	@Override
	public void volumeUp() {

		System.out.println("라이도 볼륨 업");
	}

	@Override
	public void volumeDown() {

		System.out.println("라이도 볼륨 다운");
	}

}
