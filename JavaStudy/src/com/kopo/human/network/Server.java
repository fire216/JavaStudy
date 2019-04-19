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
		System.out.println("서버소켓이 생성되었습니다.");
		while (true) {
			System.out.println("클라이언트를 기다립니다.");
			innerSocket = ss.accept();
			System.out.println("클라이언트가 연결되었습니다.");
			getMessage(innerSocket);
		}
	}
	
	public void getMessage(Socket innerSocket) throws Exception {
		//입력 스트림 만들기
//		InputStream is = innerSocket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		br = new BufferedReader(isr);
		//위의 3줄이 아래 1줄로 이렇게 변형될 수 있음! 위아래 호환가능
		//Socket이 쓸 수 있는 메소드가 InputStream/OutStream이라서 이걸 FileReader로 쓰기 위해 변형하는 작업!
		br = new BufferedReader(new InputStreamReader(innerSocket.getInputStream()));
		
		//출력 스트림
		//PritnWriter음 바로 전송
		bw = new PrintWriter(innerSocket.getOutputStream(),true);
		
		String temp = br.readLine();
		System.out.println("서버쪽에서 클라이언트로 부터 받은 문자열 출력");
		
		if(br!=null) br.close();
		if(ss!=null) innerSocket.close();
		
	}

	public static void main(String[] args) throws Exception {
		Server se = new Server();
		se.serverStart();
	}
}
