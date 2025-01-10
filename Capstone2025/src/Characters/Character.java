package Characters;

public class Character {

	private double x, y;
	private int velocity, agility, stamina;
	
	public Character(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Character() {
		this.x = 0;
		this.y = 0;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void moveY(double change) {
		this.y += change;
	}
	public void moveX(double change) {
		this.x += change;
	}
	public void step(int m) {
		//method takes in a number 0-3
		//0 go right 
		//1 go left
		//2 go up 
		//3 go down 
		switch(m) {
		case 0: 
			this.moveX(9);
		case 1:
			this.moveX(-9);
		case 2:
			this.moveY(-9);
		case 3:
			this.moveY(9);
			
		}
		
	}
	
	
}
