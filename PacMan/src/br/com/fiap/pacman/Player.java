package br.com.fiap.pacman;

public class Player extends GameObject{
	private int direction;
	private int life = 10;
	private boolean invencible = false;
	private static final int STEP = 10;
	
	public Player() {};
	
	public Player(int x, int y, int direction) {
		super(x, y);
		setDirection(direction);
	};
	
	
	public boolean canMove() {
		int newY = calculateNewY();;
		int newX = calculateNewX();
		
		if(newY < 0 || newY > getScreenSize() || newX < 0 || newX > getScreenSize()) return false;
		
		return true;
	}

	public void move() {
		if(canMove()) {
			if(direction == 0) super.setY(getY() - STEP);
			if(direction == 90) super.setX(getX() + STEP);
			if(direction == 180) super.setY(getY() + STEP);
			if(direction == 270) super.setX(getX() - STEP);
		}	
	}
	private int calculateNewX() {
		int newX = getX();
		
		if(direction == 90) newX = getX() + STEP;
		if(direction == 270) newX = getX() - STEP;
		return newX;
	}
	private int calculateNewY() {
		int newY = getY();
		
		if(direction == 0) newY = getY() - STEP;
		if(direction == 180) newY = getY() + STEP;
		return newY;
	}
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public boolean isInvencible() {
		return invencible;
	}

	public void setInvencible(boolean invencible) {
		this.invencible = invencible;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		if(this.life > 0) this.life = life;
	};

}
