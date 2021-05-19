package AE_Schulprojekt_GUI;


import java.awt.*;
import javax.swing.*;

public class Window {
	public Window(int width, int height, String title, Game game, Page page) {
		// Initialized Frame
		final JFrame frame = new JFrame(title);
		frame.setSize(width, height);
		
		
		switch(page) {
			case MENU:
				frame.add(new AE_Schulprojekt_GUI_Panels.Menu_Panel(frame));
				break;
			case ADMIN:
				frame.add(new AE_Schulprojekt_GUI_Panels.Admin_Panel());
				break;
			case GAME:
				frame.add(new AE_Schulprojekt_GUI_Panels.Game_Panel(frame));
				break;
		}
		
		
		

		System.out.println(frame.getSize());

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setVisible(true);
	

		
			
		
		
	}
}
