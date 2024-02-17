import Game.Player;
import Im2d.*;
public class Start  {
	public static void main(String[] args) {
		GamePanel panel = new GamePanel();
		Window window = new Window(800,500);
		window.addObject(GamePanel.getPanel());
		Player player = new Player();
		player.transform.setHeight(250);
		player.transform.setWidth(250);
		player.transform.setTransform(Window.getOrigin());
		player.start();
	}
}
