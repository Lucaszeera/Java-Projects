package br.com.fiap.pacman;

public class Ghost extends GameObject{
	
	private int direction;
	private static final int STEP = 10;
	
	public Ghost() {};
	
	public Ghost(int x, int y, int direction) {
		super.setX(x);
		super.setY(y);
		this.direction = direction;
	}

	
	public boolean canMove() {
		int newY = calculateNewY();;
		int newX = calculateNewX();
		
		if(newY < 0 || newY > getScreenSize() || newX < 0 || newX > getScreenSize()) return false;
		
		return true;
	}

	public void move() {
		if(canMove()) {
			double sorteio = Math.random();
			if(sorteio < 0.3) direction = turn();
			
			setX(calculateNewX());
			setY(calculateNewY());
		}	
	}
	private int turn() {
		int newDirection = 0;
		double sorteio = Math.random();
		if(sorteio < 0.25) newDirection = 90;
		if(sorteio >= 0.25 && sorteio < 0.5) newDirection = 180;
		if(sorteio >= 0.5 && sorteio < 0.75) newDirection = 270;
		this.direction = direction;
		return newDirection;
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
	
	

}
