package AE_Schulprojekt_GUI;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Game extends Canvas{


	private static final long serialVersionUID = 1L;

	private final List<Drawable> drawables = new ArrayList<Drawable> ();

    /**
     * Window Constants
     */
	private static Page page = Page.MENU;
    private static final String TITLE   = "THE LEGEND OF THE FIVE DOORS";

    /**
     * Main Function, instantiating Game 
     */
    public static void main(String[]args) {
        new Game ();
    }

    /**
     * Game constructor, initialized by main ()
     */
    public Game () {
    	Window window = null;
    	if(page == Page.MENU) {
    		int WIDTH = 900;
    		int HEIGHT = 550;
    		window = new Window (WIDTH, HEIGHT, TITLE, this, page);
    	}
    	else if(page == Page.GAME){
    		int WIDTH = 1280;
    		int HEIGHT = 720;
    		window = new Window (WIDTH, HEIGHT, TITLE, this, page);
    	}
    	else if(page == Page.ADMIN) {
    		int WIDTH = 1280;
    		int HEIGHT = 720;
    		window = new Window (WIDTH, HEIGHT, TITLE, this, page);
    	}
    	System.out.println(window);
    }
    public static void Start(Page side) {
    	page = side;
    	new Game();
    }

    //shows all Courses you can choose
	public static void showCourses(JFrame frame) {
		System.out.println(frame.getComponentCount());
		//Fächer aus der Datenbank ziehen
		//erwarte die Fächer in einer Array List
		JButton button = new JButton("MOIN");
		button.setBounds(100, 100, 100, 100);
		button.setVisible(true);
		frame.add(button);
		System.out.println(frame.getComponents());
		System.out.println(frame.getComponentCount());
		
		
	}


}
