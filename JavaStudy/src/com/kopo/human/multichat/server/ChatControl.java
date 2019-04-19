 package com.kopo.human.multichat.server;

import java.util.Vector;

public class ChatControl extends Vector<ChatThread>{
	
	public synchronized void addChatThread(ChatThread ct) {
		this.add(ct);		
	}
	public synchronized void sendAllmessage(String msg){
		for(ChatThread ct: this){			//this를 준 이유 - ChatControl이 오는데 부모니까 자식이 쓸수잇음,라인을 더 줄일수 있어서	
			ct.sendMessage(msg);
		}
	}
	
	public synchronized void removeChatThread(ChatThread ct) {
		if(this.contains(ct)) {
			this.remove(ct);
		}
	}
	
	
	
	
	
	
	
	
	

}
