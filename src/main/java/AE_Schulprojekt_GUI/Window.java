package AE_Schulprojekt_GUI;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import AE_Schulprojekt_GUI_Panels.Game_Panel;
import AE_Schulprojekt_GUI_Panels.Menu_Panel;

public class Window {

	private final List<Drawable> drawables = new ArrayList<>();

	public Window(int width, int height, String title, Game game, Page page) {

		Image background;
		ImageIcon iconbackground = new ImageIcon("src/main/java/Images/Background1.png");
		background = iconbackground.getImage();
		// Initialized Frame
		final JFrame frame = new JFrame(title);
		frame.setSize(width, height);

		switch (page) {
		case MENU:
			Menu_Panel.addMenuPanel(frame);
			break;
		case GAME:
			drawables.add(new Background(background));
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