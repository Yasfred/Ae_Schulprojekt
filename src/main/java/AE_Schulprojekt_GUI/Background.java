package AE_Schulprojekt_GUI;

import java.awt.Graphics;
import java.awt.Image;

public class Background implements Drawable {
	private Image image;

	public Background(Image grass) {
		this.image = grass;
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(this.image, 0, 0, null, null);
		
	}
}
