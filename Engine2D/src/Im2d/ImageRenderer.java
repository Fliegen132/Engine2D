package Im2d;

import java.awt.image.BufferedImage;

public class ImageRenderer implements Component{
	private BufferedImage image;
	public ImageRenderer(BufferedImage image, GameObject go)
	{
		this.image = image;
		GamePanel.setImageForObject(image, go);
	}
	
	public BufferedImage getCurrentImage()
	{
		return image;
	}
	public void setImage(BufferedImage image, GameObject go)
	{
		this.image = image;
		GamePanel.setImageForObject(image, go);
	}
	
	@Override
	public void start() {
		
		
	}

	@Override
	public void update() {
		
		
	}
	
}
