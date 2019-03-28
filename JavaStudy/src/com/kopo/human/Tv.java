package com.kopo.human;

public class Tv implements Elec{

	@Override
	public void volumeUp() {
		System.out.println("티비 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("티비 볼륨 다운");
	}
	
}
