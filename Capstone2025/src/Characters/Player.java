package Characters;


import Field.FieldObject;
import processing.core.PApplet;

public class Player extends Character {
	
	
	public Player(double x, double y) {
		super(x,y,8,0, true);
	}
	public Player() {
		super();
	}
	@Override
	public void draw(PApplet surface) {
			//will be drawn as a small rectangle until we have graphics done
		surface.rect((float)super.getX(),(float)super.getY(),27,27);
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
