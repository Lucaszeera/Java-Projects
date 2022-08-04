package Game_Pacman;

public abstract class GameObject {
	private int positionX;
	private int positionY;
	static int SCREEN = 600;
	
	public GameObject() {
	}
	public GameObject(int x, int y) {
		if(positionX + x >= 0 && positionX + x <= SCREEN) {
		this.positionX += x;
		}else System.out.println("Não é possivel iniciar fora do tamanho da tela");
		if(positionY + y >= 0 && positionY + y <= SCREEN) {
		this.positionY += y;
		}else System.out.println("Não é posivel iniciar fora do tamanho da tela");
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int x) {
		if(this.positionX + x >= 0 && this.positionX + x <= SCREEN) {
			this.positionX += x;}
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int y) {
		if(this.positionY + positionY >= 0 && this.positionY + y <= SCREEN) {
			this.positionY += y;}
	}
	
}
