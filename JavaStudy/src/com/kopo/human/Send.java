package com.kopo.human;

public class Send {
	Receive re = new Receive();
	int send;

	public Send(int send) {
		this.send = send;
	}

	public void send() {
		int result = re.receive(send);
		System.out.println(result);
	}
	
//	public void sendObject(Elec elec) {
//		elec.volumeDown();
//		elec.volumeUp();
//	}
	public void sendObject(Mp3 m) {
	m.i = 28;
	}
}
