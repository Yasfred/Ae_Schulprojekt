package AE_Schulprojekt_GUI;




import javax.swing.JFrame;

import AE_Schulprojekt_GUI_Panels.Game_Panel;
import AE_Schulprojekt_GUI_Panels.Menu_Panel;

public class Window {
	public Window(int width, int height, String title, Game game, Page page) {
		// Initialized Frame
		final JFrame frame = new JFrame(title);
		frame.setSize(width, height);


		switch(page) {
			case MENU:
				Menu_Panel.addMenuPanel(frame);
				break;
			case GAME:
				Game_Panel.addGame_Panel(frame);
				break;
		}



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setVisible(true);






	}
}