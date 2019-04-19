package com.kopo.human.multichat.client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener,Runnable{
	private JTextField chatField;	
	private JTextArea chatContent;
	private BufferedReader chatIn;
	private PrintWriter chatOut;
	private String nickName;
	private boolean flag=false;
	private Socket socket;
	
	// ChatClientMain 메소드에서 실행한 후 이쪽으로 넘어옴!
	public ChatClient(String nickName) {
		super(nickName);
		this.nickName=nickName;
		// 위에서 닉네임을 지정한 것을 아래에서 익명클래스로 지정함
		// 프로그램의 최소화, 최대화, 종료버튼을 만드는 것이 WindowListner라고 함
		this.addWindowListener(new WindowAdapter() { //---> 익명클래스
			// WindowListener가 8가지 메소드를 가지는데 windowAdapter가이 이미 오버라이딩 해둠
			// 그래서 밑에서 8가지 중 하나인 WindowClosing 하나만 오버라이딩 해서 쓸 수 있는 것
			@Override
			//ActionListener 와 ActionPerform 처럼 비슷한  관계
			public void windowClosing(WindowEvent e) {
				stop();
				System.exit(0); // 이 명령어를 적으면, 프로그램 전체가 다 완전 종료되어버림! 우리는 간단하게 만든것이니까 걍 썻음
			}			
		});
		design();	
		initNetwork();
		new Thread(this).start();
	}
	
	public void design() {
		Container ca = this.getContentPane();
		JPanel southPanel = new JPanel();
		chatField= new JTextField(20); // Text를 쓸 수 있는 공간 생성
		chatField.addActionListener(this);
		JButton	jb = new JButton("보내기");
		jb.addActionListener(this);
		
		southPanel.add(chatField);
		southPanel.add(jb);
		chatContent = new JTextArea(); // 채팅프로그램 하단 입력칸 생성
		chatContent.setLineWrap(true); // 한줄 한줄 내려가는 동작
		chatContent.setEditable(false);// 마우스 갖다대면 아무렇게 채팅 쳐지는거 방지
		
		//채팅창 디자인 틀
		ca.add(southPanel, BorderLayout.SOUTH); 
		ca.add(new JScrollPane(chatContent), BorderLayout.CENTER);
	}
	
	public void initNetwork(){
		try {
			socket = new Socket("172.16.144.26", 54545);
			chatIn=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			chatOut =new PrintWriter(socket.getOutputStream() ,true);
			sendMessage("["+nickName+"]님이 입장했습니다");
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}	

	@Override
	public void run() {
		try {
			while(!flag){
				String msg = chatIn.readLine();				
				if(msg != null && !msg.equals("")){
					chatContent.append( msg +"\n"); // 문서의 끝에 첨부하는 텍스트
					chatContent.setCaretPosition(chatContent.getText().length()); // 채팅창에 따라 스크롤바가 자동으로 내려가주는 기능 				
				}else{
					stop();
				}				
			}
			chatIn.close();
			chatOut.close();
			socket.close();			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message=chatField.getText();
		if(!message.equals("")) {
			sendMessage("["+nickName+"]"+message);
			chatField.setText("");
		}
	}
	
	public void sendMessage(String message) {
		chatOut.println(message);
	}
	
	public void stop(){
		sendMessage("[" + nickName + "]:님이 퇴장합니다" );
		flag=true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
