package Characters;

import java.awt.Rectangle;

import Field.FieldObject;
import processing.core.PApplet;
/**
 * A super class for both player and bots. Represents the general character and contains qualities of every character
 * such as the coordinate of the character, 
 * the velocity stamina and strength(which determine the character's ability to help their team winning  
 */
public abstract class Character {
	
	private double x, y;
	private boolean onPlayerTeam; //true - on player's team, false otherwise
	private int velocity, stamina;
	
	public Character(double x, double y, int velocity, int stamina, boolean onPlayerTeam) {
		this.x = x;
		this.y = y;
		this.velocity = velocity;
		this.stamina = stamina;
		this.onPlayerTeam = onPlayerTeam;
	}
	
	public Character() {
		this.x = 0;
		this.y = 0;
		this.velocity = 0;
		this.stamina = 0;
		this.onPlayerTeam = true;
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
	public void sprint() {
		
	}
	public boolean getOnPlayerTeam() {
		return this.onPlayerTeam;
	}
	public abstract void collisionChar(Character other);
		
	
	public abstract void collisionObject(FieldObject other) ;
		
	
	public abstract void draw(PApplet surface);
	
	
}
