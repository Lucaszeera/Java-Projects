package br.com.fiap.pacman;

public class Item extends GameObject{

	private boolean visible = true;
	
	public Item() {};
	
	public Item(int x, int y) {
		super.setX(x);
		super.setY(y);
	}
}
