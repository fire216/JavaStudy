package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Constant {
	public static void main(String[] args) {
		JFrame j = new JFrame("내 창");
		
		JButton b = new JButton("내 버튼");
		b.setBackground(Color.CYAN);
		
		j.add(b);       //프레임에 버튼을 장착(?)
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(300,200);      //너비 300, 높이 200
		j.setVisible(true);
	}
}
