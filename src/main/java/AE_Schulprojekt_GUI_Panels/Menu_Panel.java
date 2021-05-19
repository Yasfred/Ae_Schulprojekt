package AE_Schulprojekt_GUI_Panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import AE_Schulprojekt_GUI.Game;
import AE_Schulprojekt_GUI.Page;


public class Menu_Panel extends JPanel{
	
	public Menu_Panel(final JFrame frame) {
		//Button
		JButton settings_Button = new JButton("Einstellungen");
		JButton start_Button = new JButton("Start");
		JButton change_Course = new JButton("Fach wählen");
		JButton admin_Button = new JButton("Admin");
		JButton close_Button = new JButton("Beenden");
		
		setSize(900, 550);
		// StartButton
	
					start_Button.setBounds(50, 300, 200, 300);
					start_Button.setBackground(Color.BLACK);
					start_Button.setForeground(Color.WHITE);
					start_Button.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							Game.Start(Page.GAME);
						}
					});

					// ChangeCourseButton
					change_Course.setBounds(50, 350, 200, 30);
					change_Course.setBackground(Color.BLACK);
					change_Course.setForeground(Color.WHITE);
					change_Course.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							frame.add(new Cours_Panel());
							
							
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
						}
					});
		
		add(start_Button);
		add(change_Course);
		add(settings_Button);
		add(admin_Button);
		add(close_Button);
	}
}
