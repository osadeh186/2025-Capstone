package Characters;

import Field.FieldObject;
import processing.core.PApplet;

public class Bot extends Character {
	private boolean defenseMode; 
	public Bot(double x, double y,  int velocity, int stamina, boolean defenseMode, boolean onPlayerTeam) {
		super(x,y,velocity,stamina, onPlayerTeam);
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
	public void figureNextStep() {
		
	}

}
