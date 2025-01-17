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
	private int velocity, stamina, strength;
	/**
	 * constructs a general character. constructor of super class to Bot and Player
	 * @param x coordinate x
	 * @param y coordinate y
	 * @param velocity determine the velocity of the character 
	 * @param stamina determine the stamina of the character 
	 * @param strength determine the strength of the character 
	 * @param onPlayerTeam true if character belongs to player's team, false otherwise
	 */
	public Character(double x, double y, int velocity, int stamina, int strength, boolean onPlayerTeam) {
		this.x = x;
		this.y = y;
		this.velocity = velocity;
		this.stamina = stamina;
		this.strength = strength;
		this.onPlayerTeam = onPlayerTeam;
	}
	/**
	 * constructs default character with default traits 
	 */
	public Character() {
		this.x = 0;
		this.y = 0;
		this.velocity = 0;
		this.stamina = 0;
		this.strength = 0;
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
	/**
	 * move the character on the Y axis
	 * @param change the change of the Y coordinate (negative for up, positive for down)
	 */
	public void moveY(double change) {
		this.y += change;
	}
	/**
	 * move the character on the X axis
	 * @param change the change of the X coordinate
	 */
	public void moveX(double change) {
		this.x += change;
	}
	/**
	 * take a step on the board
	 * step is determined by the velocity of the character,
	 * one step = moving the amount of pixels as the value of the velocity 
	 * @param m the direction in which the step is taken. example: "right" would make the character take a step to the right
	 */
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
	public boolean getOnPlayerTeam() {
		return this.onPlayerTeam;
	}
	public abstract void collisionChar(Character other);
		
	
	public abstract void collisionObject(FieldObject other) ;
		
	
	public abstract void draw(PApplet surface);
	
	
}
