package Game_Pacman;

public final class Player extends GameObject{
	private int up = 0;
	private int right = 90;
	private int down = 180;
	private int left = 270;
	private int vidas;
	private boolean invencivel;
	
	
	public void podeSeMover() {
		if(super.getPositionX() > 0) {
			System.out.println("O jogador pode se mover para a esquerda");
		}if(super.getPositionX() < SCREEN) {
			System.out.println("O jogador pode se mover para a direita");
		}if(super.getPositionY() > 0 ) {
			System.out.println("O jogador pode se mover para o norte");
		}if(super.getPositionY() < SCREEN) {
			System.out.println("O jogador pode se mover para o sul");
		}
	}
	
	
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public boolean isInvencivel() {
		return invencivel;
	}
	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public int getDown() {
		return down;
	}
	public void setDown(int down) {
		this.down = down;
	}
}
