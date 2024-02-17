package Im2d;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class GamePanel  {
	 private static List<GameObject> gameObjects = new ArrayList<GameObject>();
	 private static List<BufferedImage> images = new ArrayList<BufferedImage>();
	 private static JPanel panel = new JPanel() {
		 @Override
		 protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        for(int i = 0; i < gameObjects.size(); i++)
	        if (images.get(i) != null && gameObjects.get(i) != null) {
	            g.drawImage(images.get(i), (int) gameObjects.get(i).transform.x, (int) gameObjects.get(i).transform.y, (int) gameObjects.get(i).transform.getHeight(),
	                    (int) gameObjects.get(i).transform.getWidth(), null);
	            repaint();
	        }
	    }
	 };

	 public static void setImageForObject(BufferedImage img, GameObject gameobject) {
		 gameObjects.add(gameobject);
		 images.add(img);
		 panel.repaint();
	 }
	 public static JPanel getPanel()
	 {
		 return panel;
	 }
	 
   
}
