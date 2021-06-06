package AE_Schulprojekt.AE_Schulprojekt;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import AE_Schulprojekt.AE_Schulprojekt.Panels.Cours_Panel;

public class Window {
	public Window(int width, int height, String title, Game game, Page page) {
		// Initialized Frame
		final JFrame frame = new JFrame(title);

		//Button
		final JButton settings_Button = new JButton("Einstellungen");
		final JButton start_Button = new JButton("Start");
		final JButton change_Course = new JButton("Fach wählen");
		final JButton admin_Button = new JButton("Admin");
		final JButton close_Button = new JButton("Beenden");

		game.setPreferredSize(new Dimension(width, height));
		game.setMaximumSize(new Dimension(width, height));
		game.setMinimumSize(new Dimension(width, height));

		if (page == Page.MENU) {
			// Buttons MENU
			// StartButton
			start_Button.setBounds(50, 300, 200, 30);
			start_Button.setBackground(Color.BLACK);
			start_Button.setForeground(Color.WHITE);
			start_Button.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					Game.Start(Page.GAME);
				}
			});

			// ChangeCourseButton
			change_Course.setBounds(50, 350, 200, 30);
			change_Course.setBackground(Color.BLACK);
			change_Course.setForeground(Color.WHITE);
			change_Course.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					change_Course.setVisible(false);
					settings_Button.setVisible(false);
					close_Button.setVisible(false);
					start_Button.setVisible(false);
					admin_Button.setVisible(false);

				}
			});

			// SetingsButton
			settings_Button.setBounds(50, 400, 200, 30);
			settings_Button.setBackground(Color.BLACK);
			settings_Button.setForeground(Color.WHITE);
			settings_Button.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

				}
			});

			// AdminButton
			admin_Button.setBounds(50, 450, 100, 15);
			admin_Button.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

				}
			});

			// closeButton
			close_Button.setBounds(150, 450, 100, 15);
			close_Button.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});


			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(new Dimension(300, 300));
			frame.add(new Cours_Panel());
			frame.setVisible(true);
			// Add Buttons
//			frame.add(start_Button);
//			frame.add(change_Course);
//			frame.add(settings_Button);
//			frame.add(admin_Button);
//			frame.add(close_Button);
		}
		else if(page == Page.GAME) {
			//Buttons GAME
			Icon iconDoor = new ImageIcon("src/main/java/Images/Door.png");
			//1st DOOR Button
			JButton door1 = new JButton(iconDoor);
			door1.setBounds(100, 200, 160, 301);
			door1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

				}
			});
			//2nd DOOR Button
			JButton door2 = new JButton(iconDoor);
			door2.setBounds(330, 200, 160, 301);
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

			frame.add(door1);
			frame.add(door2);
			frame.add(door3);
			frame.add(door4);
			frame.add(door5);
		}


		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}