package AE_Schulprojekt_GUI_Panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import AE_Schulprojekt_GUI.Game;
import AE_Schulprojekt_GUI.Page;

public class Game_Panel {

	static JFrame frame1;
	static JPanel Health_Panel = new JPanel(new FlowLayout());
	static JPanel Fragen_Panel = new JPanel(new FlowLayout());
	static JPanel Door_Panel = new JPanel(new FlowLayout());
	static ArrayList<String> FragenundAntworten = new ArrayList<String>();
	static String text;
	static String[] frageAntworten = null;
	static String richtigeAntwort;
	static String schwierigkeit;
	static int i;
	static int health = 3;

	public static void addGame_Panel(JFrame frame) {
		
		frame1 = frame;
		
		// holt sich die Fragen und die dazu gehörigen Antworten
		getFragenundAntworten();

		// Panel
		JPanel nutz_Panel = new JPanel();

		// Panels ans frame adden
		frame.add(Health_Panel);
		frame.add(Fragen_Panel);
		frame.add(Door_Panel);
		frame.add(nutz_Panel);

		// Heaöth_Panel
		Health_Panel.setBounds(0, 0, 100, 30);

		// Fragen_Panel
		Fragen_Panel.setBounds(0, 45, 1320, 30);
		JLabel label = new JLabel(frageAntworten[0]);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		Fragen_Panel.add(label);

		// Door_Panel
		Door_Panel.setBounds(0, 100, 1280, 720);

		addDoors();

	}

	private static void addDoors() {

		// Herzen anzeigen 
		Icon heart = new ImageIcon("src/main/java/Images/Heart.png");
		Health_Panel.removeAll();
		


		for (int i = 0; i < health; i++) {
			JLabel heartLabel = new JLabel();
			heartLabel.setIcon(heart);
			Health_Panel.add(heartLabel);
		}

		// Frage an das Frame adden
		JLabel label = new JLabel(frageAntworten[0]);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 26));

		Fragen_Panel.removeAll();
		Fragen_Panel.add(label);

		// Hier werden die Türe gemacht und die Antworten geaddet
		// Buttons GAME
		Icon iconDoor = new ImageIcon("src/main/java/Images/Door.png");

		// 1st DOOR Button
		final JButton door1 = new JButton(frageAntworten[1], iconDoor);
		door1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				checkAnswer(1);
			}

		});
		// 2nd DOOR Button
		final JButton door2 = new JButton(frageAntworten[2], iconDoor);
		door2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				checkAnswer(2);

			}
		});
		// 3rd DOOR Button
		final JButton door3 = new JButton(frageAntworten[3], iconDoor);
		door3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				checkAnswer(3);

			}
		});
		// 4th DOOR Button
		final JButton door4 = new JButton(frageAntworten[4], iconDoor);
		door4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				checkAnswer(4);

			}
		});

		// 5th DOOR Button
		final JButton door5 = new JButton(frageAntworten[5], iconDoor);
		door5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				checkAnswer(5);
			}
		});

		Door_Panel.removeAll();
		Door_Panel.add(door1);
		Door_Panel.add(door2);
		Door_Panel.add(door3);
		Door_Panel.add(door4);
		Door_Panel.add(door5);

		Door_Panel.revalidate();
		Door_Panel.repaint();
		Fragen_Panel.revalidate();
		Fragen_Panel.repaint();
		Health_Panel.revalidate();
		Health_Panel.repaint();
	}

	private static void getFragenundAntworten() {
		final ArrayList<String> FrageMathe1 = new ArrayList<String>();
		FrageMathe1.add("Was ist 1 + 1;2;4;6;8;9;1;1");
		FrageMathe1.add("Was ist 2 + 2;20;40;60;4;09;4;1");
		FragenundAntworten = FrageMathe1;
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// hier muss man mit dem text die Fragen aus der Datenbank üpber Hibernate holen

		frageAntworten = FrageMathe1.get(i).split(";");
		richtigeAntwort = frageAntworten[6];
		schwierigkeit = frageAntworten[7];

	}

	public static void Text(String text2) {
		String[] text1 = text2.split(": ");
		text = text1[1];

	}

	public static void checkAnswer(int j) {
		if (j == Integer.parseInt(richtigeAntwort)) {
			if(i < FragenundAntworten.size()-1) {
				i += 1;
				getFragenundAntworten();
				addDoors();				
			}else {
				Health_Panel.removeAll();
				Fragen_Panel.removeAll();
				Door_Panel.removeAll();
				
				Icon finish = new ImageIcon("src/main/java/Images/Geschafft.png");
				
				JLabel label = new JLabel();
				label.setIcon(finish);
				Door_Panel.add(label);
				
				Door_Panel.revalidate();
				Door_Panel.repaint();
				Fragen_Panel.revalidate();
				Fragen_Panel.repaint();
				Health_Panel.revalidate();
				Health_Panel.repaint();
			}
		} else if (health > 1) {
			health -= 1;
			addDoors();
		}else {
			frame1.dispose();
			new Game(Page.MENU);
		}
	}
}
