package Im2d;

import java.awt.Component;

import javax.swing.JFrame;
public class Window{
	public static JFrame window;
	private static Vector2 origin;
	
	public Window(Vector2 vec)
	{
		window = new JFrame();
		window.setSize(vec.x, vec.y);
		origin = new Vector2(vec.x / 2, vec.y / 2);


		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	public Window(int x, int y)
	{
		window = new JFrame();
		window.setSize(x, y);
		origin = new Vector2(x / 2, y / 2);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	public void resize(Vector2 vec)
	{
		window.setSize(vec.x, vec.y);
	}

	public void addObject(Component obj)
	{
		window.add(obj);
	}
	public static JFrame getWindow()
	{
		return window;
	}
	public static Vector2 getOrigin()
	{
		return origin;
	}
}
