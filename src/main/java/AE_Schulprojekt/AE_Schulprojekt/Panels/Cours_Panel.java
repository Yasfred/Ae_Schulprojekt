package AE_Schulprojekt.AE_Schulprojekt.Panels;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Cours_Panel extends JPanel {

	public Cours_Panel() {
		//Fächer aus der Datenbank ziehen
		//TestList mit Testfächern
		ArrayList<String> faecher = new ArrayList<>();
		faecher.add("Mathe");
		faecher.add("Deutsch");
		faecher.add("ITS");
		faecher.add("AE");
		faecher.add("Politik");
		double rows = faecher.size()/2.;
		rows = Math.round(rows);	
		setLayout(new java.awt.GridLayout((int) rows,0));
		for(int i = 0; i < faecher.size(); i++) {
			JButton button = new JButton(faecher.get(i));
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			add(button);
		}
	}

}
