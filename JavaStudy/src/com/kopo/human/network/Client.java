package com.kopo.human.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	BufferedReader br;
	PrintWriter pw;
	Socket client;

	public Client() {
		connect();
	}
	
	public void connect() {
		try {
			System.out.println("�������� ������ �õ��մϴ�.");
			client = new Socket("127.0.0.1",54545); //������ ��ǻ�ͷ� ����
			System.out.println("����Ǿ����ϴ�.");
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			pw = new PrintWriter(client.getOutputStream(),true);
			pw.println("");
		}catch(Exception e) {
			System.out.println("�������...");
		}finally {
			try {
				if(client != null) client.close();
			}catch(IOException ie) {}
		}
	}

	public static void main(String[] args) {
		Client ci = new Client();
	}
}
