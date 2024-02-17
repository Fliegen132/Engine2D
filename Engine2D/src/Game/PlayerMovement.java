package Game;

import Im2d.Component;
import Im2d.GamePanel;
import Im2d.Input;
import Im2d.KeyCode;
import Im2d.Window;

public class PlayerMovement implements Component {

	private Player player;
	
	public PlayerMovement(Player player)
	{
		this.player = player;
		Input i = new Input();
	}
	@Override
	public void start() {

	}

	@Override
	public void update() {
		
        if (Input.getKeyDown(KeyCode.A.getCode())) {
            player.transform.x -= player.getSpeed();
            System.out.println(player.transform.x);
        }
        if (Input.getKeyDown(KeyCode.D.getCode())) {
            player.transform.x += player.getSpeed();
            System.out.println(player.transform.x);
        }
        if (Input.getKeyDown(KeyCode.S.getCode())) {
            player.transform.y += player.getSpeed();
            System.out.println(player.transform.x);
        }
        if (Input.getKeyDown(KeyCode.W.getCode())) {
            player.transform.y -= player.getSpeed();
            System.out.println(player.transform.x);
        }
       
	}

}
