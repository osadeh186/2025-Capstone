package Characters;

import processing.core.PApplet;

public abstract class Character {

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
	public void step(String m) {
		if(m.equals("right"))
			this.moveX(9);
		
		if(m.equals("up")) 
			this.moveY(-9);
		
		if(m.equals("left"))
			this.moveX(-9);
		
		if(m.equals("down"))
			this.moveY(9);

		
		
	}
	public abstract void draw(PApplet surface);
	
	
}
