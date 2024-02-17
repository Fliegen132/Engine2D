package Game;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Im2d.GameObject;
import Im2d.ImageRenderer;

public class Player extends GameObject {
	private int speed = 4;
	public Player() {
		try
		{
			BufferedImage image = ImageIO.read(new File("src\\Game\\Image.png"));
			this.addComponent(new ImageRenderer(image, this));
			System.out.println("net");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		this.addComponent(new PlayerMovement(this));
	}
	public int getSpeed()
	{
		return speed;
	}

}
