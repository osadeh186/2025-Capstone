package Characters;

import processing.core.PApplet;

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
	public void step(String m) {
		
		
		switch(m) {
		case "right": 
			this.moveX(9);
		case "left":
			this.moveX(-9);
		case "up":
			this.moveY(-9);
		case "down":
			this.moveY(9);
			
		}
		
	}
	public void draw(PApplet surface) {
		
	}
	
	
}
