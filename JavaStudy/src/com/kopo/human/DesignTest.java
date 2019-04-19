package com.kopo.human;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DesignTest extends JFrame {

	private static final long serialVersionUID = -7307768698180053636L;
	private JButton east;
	private JButton west;
	private JButton south;
	private JButton north;
	private JButton center;

	public DesignTest() {
		design();
	}

	public void design() {
		Container ca = this.getContentPane();
		east = new JButton("동");// this 넣은 이유 -> 직접 수행하기 위해
		east.addActionListener(new East());
		west = new JButton("서");
		west.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("west");

			}

		});
		south = new JButton("남");
//		 south.addActionListener(new south());
		north = new JButton("북");
//		 north.addActionListener(new north());
		center = new JButton("중앙");
//		 center.addActionListener(new center());

		ca.add(east, BorderLayout.EAST);
		ca.add(west, BorderLayout.WEST);
		ca.add(south, BorderLayout.SOUTH);
		ca.add(north, BorderLayout.NORTH);
		ca.add(center, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		DesignTest dt = new DesignTest();
		dt.setBounds(200, 200, 300, 400);
		dt.setVisible(true);
	}

}
