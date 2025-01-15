package Characters;

import Field.FieldObject;
import processing.core.PApplet;

public class Bot extends Character {
	private boolean defenseMode; 
	private boolean onPlayerTeam; //true - on player's team, false otherwise
	public Bot(double x, double y, boolean defenseMode, boolean onPlayerTeam) {
		super(x,y,9,0,0);
	}
	
	@Override
	public void draw(PApplet surface) {
		
	}

	@Override
	public void collisionChar(Character other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collisionObject(FieldObject other) {
		// TODO Auto-generated method stub
		
	}

}
