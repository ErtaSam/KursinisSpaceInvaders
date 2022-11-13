package logic;

import models.Bullet;
import models.PlayerShip;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardController extends KeyAdapter {
    private int key;
    private PlayerShip player;
    private Bullet bullet;
    public KeyboardController(PlayerShip playerShip, Bullet bullet) {
        this.player = playerShip;
        this.bullet = bullet;
    }
    public void keyReleased(KeyEvent keyEvent) {
        this.key = keyEvent.getKeyCode();
    }
    public void keyPressed(KeyEvent keyEvent) {
        this.key = keyEvent.getKeyCode();
        if (key == 39){
            player.moveRight();
        }if (key == 37){
            player.moveLeft();
        }if(key == 32){
            bullet.setKeepMoving(true);
            bullet.setCoordinateY(player.getCoordinateY());
            bullet.setCoordinateX(player.getCoordinateX() + (player.getWidth() / 2));
            bullet.moveUp();
        }
    }
}
