package Characters;

import java.awt.Rectangle;

import processing.core.PApplet;
/**
 * 
 */
public abstract class Character {
	
	private double x, y;
	private int velocity, stamina, strength;
	
	public Character(double x, double y, int velocity, int stamina, int strength) {
		this.x = x;
		this.y = y;
		this.velocity = velocity;
		this.stamina = stamina;
		this.strength = strength;
	}
	
	public Character() {
		this.x = 0;
		this.y = 0;
	}
	public int getVel() {
		return velocity;
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
			this.moveX(velocity);
		
		if(m.equals("up")) 
			this.moveY(-1*velocity);
		
		if(m.equals("left"))
			this.moveX(-1*velocity);
		
		if(m.equals("down"))
			this.moveY(velocity);

		
		
	}
	public abstract void draw(PApplet surface);
	
	
}
