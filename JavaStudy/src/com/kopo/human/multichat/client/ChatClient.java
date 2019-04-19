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
	
	// ChatClientMain �޼ҵ忡�� ������ �� �������� �Ѿ��!
	public ChatClient(String nickName) {
		super(nickName);
		this.nickName=nickName;
		// ������ �г����� ������ ���� �Ʒ����� �͸�Ŭ������ ������
		// ���α׷��� �ּ�ȭ, �ִ�ȭ, �����ư�� ����� ���� WindowListner��� ��
		this.addWindowListener(new WindowAdapter() { //---> �͸�Ŭ����
			// WindowListener�� 8���� �޼ҵ带 �����µ� windowAdapter���� �̹� �������̵� �ص�
			// �׷��� �ؿ��� 8���� �� �ϳ��� WindowClosing �ϳ��� �������̵� �ؼ� �� �� �ִ� ��
			@Override
			//ActionListener �� ActionPerform ó�� �����  ����
			public void windowClosing(WindowEvent e) {
				stop();
				System.exit(0); // �� ��ɾ ������, ���α׷� ��ü�� �� ���� ����Ǿ����! �츮�� �����ϰ� ������̴ϱ� �� ����
			}			
		});
		design();	
		initNetwork();
		new Thread(this).start();
	}
	
	public void design() {
		Container ca = this.getContentPane();
		JPanel southPanel = new JPanel();
		chatField= new JTextField(20); // Text�� �� �� �ִ� ���� ����
		chatField.addActionListener(this);
		JButton	jb = new JButton("������");
		jb.addActionListener(this);
		
		southPanel.add(chatField);
		southPanel.add(jb);
		chatContent = new JTextArea(); // ä�����α׷� �ϴ� �Է�ĭ ����
		chatContent.setLineWrap(true); // ���� ���� �������� ����
		chatContent.setEditable(false);// ���콺 ���ٴ�� �ƹ����� ä�� �����°� ����
		
		//ä��â ������ Ʋ
		ca.add(southPanel, BorderLayout.SOUTH); 
		ca.add(new JScrollPane(chatContent), BorderLayout.CENTER);
	}
	
	public void initNetwork(){
		try {
			socket = new Socket("172.16.144.26", 54545);
			chatIn=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			chatOut =new PrintWriter(socket.getOutputStream() ,true);
			sendMessage("["+nickName+"]���� �����߽��ϴ�");
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
					chatContent.append( msg +"\n"); // ������ ���� ÷���ϴ� �ؽ�Ʈ
					chatContent.setCaretPosition(chatContent.getText().length()); // ä��â�� ���� ��ũ�ѹٰ� �ڵ����� �������ִ� ��� 				
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
		sendMessage("[" + nickName + "]:���� �����մϴ�" );
		flag=true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
