package com.kopo.human.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket ss;
	private Socket innerSocket;
	private BufferedReader br;
	private PrintWriter bw;
	private PrintWriter pw;

	public void serverStart() throws Exception {
		ss = new ServerSocket(54545);
		System.out.println("���������� �����Ǿ����ϴ�.");
		while (true) {
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ��ϴ�.");
			innerSocket = ss.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			getMessage(innerSocket);
		}
	}
	
	public void getMessage(Socket innerSocket) throws Exception {
		//�Է� ��Ʈ�� �����
//		InputStream is = innerSocket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		br = new BufferedReader(isr);
		//���� 3���� �Ʒ� 1�ٷ� �̷��� ������ �� ����! ���Ʒ� ȣȯ����
		//Socket�� �� �� �ִ� �޼ҵ尡 InputStream/OutStream�̶� �̰� FileReader�� ���� ���� �����ϴ� �۾�!
		br = new BufferedReader(new InputStreamReader(innerSocket.getInputStream()));
		
		//��� ��Ʈ��
		//PritnWriter�� �ٷ� ����
		bw = new PrintWriter(innerSocket.getOutputStream(),true);
		
		String temp = br.readLine();
		System.out.println("�����ʿ��� Ŭ���̾�Ʈ�� ���� ���� ���ڿ� ���");
		
		if(br!=null) br.close();
		if(ss!=null) innerSocket.close();
		
	}

	public static void main(String[] args) throws Exception {
		Server se = new Server();
		se.serverStart();
	}
}
