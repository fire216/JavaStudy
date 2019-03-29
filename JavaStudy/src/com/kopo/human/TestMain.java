package com.kopo.human;

public class TestMain {
	public static void main(String[] args) {
		Radio ra = new Radio();
		Tv tv = new Tv();
		Mp3 m = new Mp3();
		ra.volumeUp();
		ra.volumeDown();
		tv.volumeUp();
		tv.volumeDown();
		m.volumeUp();
		m.volumeDown();
		Elec audio = new Elec() {

			@Override
			public void volumeUp() {
				System.out.println("오디오 볼륨 업");
				
			}

			@Override
			public void volumeDown() {
				System.out.println("오디오 볼륨 다운");
				
			}
			
		};
			
		audio.volumeUp();
		audio.volumeDown();
		
	}
}
