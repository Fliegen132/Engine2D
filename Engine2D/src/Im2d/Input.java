package Im2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;

public class Input implements KeyListener {
    private static Set<Integer> keysPressed = new HashSet<>();
	public Input()
	{
		Window.getWindow().addKeyListener(this);
	}
	@Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keysPressed.add(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keysPressed.remove(e.getKeyCode());
    }
    public static boolean getKeyDown(int keyCode) {
        return keysPressed.contains(keyCode);
    }
	
}
