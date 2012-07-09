package main.java;

import java.awt.event.*;

public class Control implements KeyListener {
	Player player;
	Map map;

	Control(Game game) {
		this.player = game.player;
		this.map = game.map;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();

		// Check for KeyCode after event
		switch (keyCode) {
		case KeyEvent.VK_ESCAPE:
			System.out.print("pressed: ESC - System.Exit");
			System.exit(0);
			break;
		case KeyEvent.VK_UP:
			// System.out.println("pressed: UP");
			if (this.map.getMap(this.player.getY() - 1, this.player.getX()) != 1) {
				this.player.move(0, -1);
			}
			break;
		case KeyEvent.VK_DOWN:
			// System.out.println("pressed: DOWN");
			if (this.map.getMap(this.player.getY() + 1, this.player.getX()) != 1) {
				this.player.move(0, 1);
			}
			break;
		case KeyEvent.VK_LEFT:
			// System.out.println("pressed: LEFT");
			if (this.map.getMap(this.player.getY(), this.player.getX() - 1) != 1) {
				this.player.move(-1, 0);
			}
			break;
		case KeyEvent.VK_RIGHT:
			// System.out.println("pressed: RIGHT");
			if (this.map.getMap(this.player.getY(), this.player.getX() + 1) != 1) {
				this.player.move(1, 0);
			}
			break;
		case KeyEvent.VK_Q:
			System.out.println("pressed: Q - Spell 1");
			break;
		case KeyEvent.VK_W:
			System.out.println("pressed: W - Spell 2");
			break;
		case KeyEvent.VK_E:
			System.out.println("pressed: E - Spell 3");
			break;
		case KeyEvent.VK_R:
			System.out.println("pressed: R - Spell 4");
			break;
		case KeyEvent.VK_D:
			System.out.println("pressed: D - Spell 5");
			break;
		case KeyEvent.VK_F:
			System.out.println("pressed: F - Spell 6");
			break;
		default:
			System.out.println("pressed");
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// no code for this function yet.
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// no code for this function yet.
	}
}