package models;

import interfaces.MoveX;

public class PlayerShip extends Character implements MoveX {
    public PlayerShip(int coordinateX, int coordinateY,int width, int height, int speed) {
        super(coordinateX, coordinateY, width, height, speed);
    }
    @Override
    public void moveLeft() {
        if(this.getCoordinateX() > 5){
            this.setCoordinateX(this.getCoordinateX() - this.getSpeed());
        }
    }
    @Override
    public void moveRight() {
        if(this.getCoordinateX() < Singleton.getInstance().boardWidth - 5) {
            this.setCoordinateX(this.getCoordinateX() + this.getSpeed());
        }
    }

}
