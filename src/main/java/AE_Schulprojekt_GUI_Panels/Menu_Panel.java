package AE_Schulprojekt_GUI_Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import AE_Schulprojekt_GUI.Game;
import AE_Schulprojekt_GUI.Page;


public class Menu_Panel{

	public static void addMenuPanel(final JFrame frame) {
		//Panel Größe
		final int height = 35;
		final int width = 170;

		//Hier werden alle Panels erstellt die auf das Frame kommen
		//Panel für das ausgewählte Fach
		final JPanel fach_Panel = new JPanel(new FlowLayout());
		//Panel für start Button
		JPanel start_Panel = new JPanel(new FlowLayout());
		//Panel für Fach wählen Button
		JPanel cours_Panel = new JPanel(new FlowLayout());
		//Panel für Beenden und Admin Button
		JPanel option_Panel = new JPanel(new FlowLayout());
		//Panel für die Fächer die man auswählen kann
		final JPanel faecher_Panel = new JPanel();
		//Panel alles klappt
		JPanel nutz_Panel = new JPanel();
		//frame die Panels adden
		frame.add(fach_Panel);
		frame.add(start_Panel);
		frame.add(cours_Panel);
		frame.add(option_Panel);
		frame.add(faecher_Panel);
		frame.add(nutz_Panel);

		//Button
		JButton start_Button = new JButton("Start");
		JButton change_Course = new JButton("Fach & Themen");
		JButton admin_Button = new JButton("Admin");
		JButton close_Button = new JButton("Beenden");

		//FachPanel
		fach_Panel.setBounds(20, 215, width, height);
		
		//startPanel
		start_Panel.setBounds(20, 250, width, height);
		start_Panel.add(start_Button);
		//StartButton
		start_Button.setPreferredSize(new Dimension(170,30));
		start_Button.setBackground(Color.BLACK);
		start_Button.setForeground(Color.WHITE);
		start_Button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		start_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Game.Start(Page.GAME);
			}
		});

		//coursPanel
		cours_Panel.setBounds(20, 285, width, height);
		cours_Panel.add(change_Course);
		// ChangeCourseButton
		change_Course.setPreferredSize(new Dimension(170,30));
		change_Course.setBackground(Color.BLACK);
		change_Course.setForeground(Color.WHITE);
		change_Course.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		change_Course.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				faecher_Panel.setVisible(true);
			}
		});

		//option Panel
		option_Panel.setBounds(20, 320, width, height);
		option_Panel.add(admin_Button);
		option_Panel.add(close_Button);
		// AdminButton
		admin_Button.setPreferredSize(new Dimension(80,30));
		admin_Button.setBackground(Color.BLACK);
		admin_Button.setForeground(Color.WHITE);
		admin_Button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		admin_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Game.Start(Page.ADMIN);

			}
		});

		// closeButton
		close_Button.setPreferredSize(new Dimension(80,30));
		close_Button.setBackground(Color.BLACK);
		close_Button.setForeground(Color.WHITE);
		close_Button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		close_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		//ThemenButton
		faecher_Panel.setBounds(250,0,650,515);
		final ArrayList<String> faecher = new ArrayList<String>();
		final ArrayList<JLabel> labels = new ArrayList<JLabel>();
		faecher.add("Mathe");
		faecher.add("Deutsch");
		faecher.add("ITS");
		faecher.add("AE");
		faecher.add("Politik");		
		double rows = faecher.size()/2.;
		rows = Math.round(rows);
		faecher_Panel.setLayout(new java.awt.GridLayout((int) rows,0));
		for(int i = 0; i < faecher.size(); i++) {
			JButton button = new JButton(faecher.get(i));
			final int j = i;
			final JLabel label = new JLabel(faecher.get(j));
			labels.add(label);
			label.setVisible(false);
			fach_Panel.add(label);
			button.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					for(int i = 0; i < labels.size();i++) {
						JLabel labe = labels.get(i);
						labe.setVisible(false);
					}
						label.setVisible(true);
					
				}
			});
			
			faecher_Panel.add(button);
		}
		faecher_Panel.setVisible(false);
		
	}


	
}