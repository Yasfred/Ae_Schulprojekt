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
		Fragen_Panel.setBounds(0, 55, 1920, 55);
		JLabel label = new JLabel(frageAntworten[0]);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		Fragen_Panel.add(label);

		// Door_Panel
		Door_Panel.setBounds(0, 200, 1920, 1080);

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
		final ArrayList<String> AEFragen = new ArrayList<String>();
		AEFragen.add("Welche Art einer Schleife gibt es?/Do-While Schleife/While-Do Schleife/Dauerschleife/Induktionsschleife/True-False-Schleife/1/1");
		AEFragen.add("Mit welchem Befehl kann man eine Schleife abbrechen ?/Stop/End/Leave/Break/Terminate/4/1");
		AEFragen.add("Welcher Methoden-Kopf ist richtig ?/public static void printHello()/public void static printBye()/public String void printNull()/public String()/public void String printString()/1/1");
		AEFragen.add("Welche Art von return-Statement ist richtig ?/return/Return boolean/String return/Return int/Return 'richtig'/5/1");		
		AEFragen.add("Mit welchem Begriff werden Methoden von außen nicht zugänglich ?/Public/Static/Void/Ptivate/Final/4/2");		
		AEFragen.add("Welcher Übergabeparameter ist falsch ?/public void printText(int …Zahlen)/public void printText(int Zahl)/public void printText(String Name)/public void printText(Tiere[])/public void printText(double [] Zahlen)/4/2");
		AEFragen.add("Welcher Schleifenkopf ist richtig ?/Do-While(true)/While{}/For(true)/Do(true)/While(true){}/5/2");
		AEFragen.add("Welche Ausgabe erzeugt folgende Schleife ?:for(int i=0; i<10; i++){System.out.print(i + “, ”);if (i == 5){break;}}/'0, 1, 2, 3, 4, 5, '/'1,2,3,4,5,'/'1,2,3,4,5,6,7,8,9,10,'/'12345678910'/Nullpointer Exception/1/3");
		AEFragen.add("Welche Art von Methode gibt es nicht ?/Rekursive/Statische/Main/Abstrakt/Final/5/3");
		AEFragen.add("Was ist an dem Schleifenkopf falsch ?\r\n"
				+ " for(int i = 0; i <  10; i--)/Nichts, ist alles richtig/'i' ist immer kleiner als 10/'i--' gibt es nicht/For-Schleifen haben nur eine Bedingung im Kopf/Falscher Variabeln-Typ/2/2");
		FragenundAntworten = AEFragen;
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// hier muss man mit dem text die Fragen aus der Datenbank üpber Hibernate holen

		frageAntworten = AEFragen.get(i).split("/");
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
