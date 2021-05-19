package AE_Schulprojekt_GUI_Panels;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game_Panel extends JPanel{

	public Game_Panel(JFrame frame) {
		//Buttons GAME
		Icon iconDoor = new ImageIcon("src/main/java/Images/Door.png");
		Icon iconDoor2 = null;
		
		//1st DOOR Button
		JButton door1 = new JButton(iconDoor);
		door1.setSize(50,500);
		door1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//2nd DOOR Button
		JButton door2 = new JButton(iconDoor);
		door2.setSize(500,50);
		door2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//3rd DOOR Button
		JButton door3 = new JButton(iconDoor);
		door3.setBounds(560, 200, 160, 301);
		door3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//4th DOOR Button
		JButton door4 = new JButton(iconDoor);
		door4.setBounds(790, 200, 160, 301);
		door4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//5th DOOR Button
		JButton door5 = new JButton(iconDoor);
		door5.setBounds(1020, 200, 160, 301);
		door5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		add(door1);
		add(door2);
		add(door3);
		add(door4);
		add(door5);
	
	}
}
