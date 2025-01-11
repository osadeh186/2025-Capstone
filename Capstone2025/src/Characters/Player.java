package Characters;


import processing.core.PApplet;

public class Player extends Character {
	
	
	public Player(double x, double y) {
		super(x,y,9,0,0);
	}
	public Player() {
		super();
	}
	@Override
	public void draw(PApplet surface) {
			//will be drawn as a small rectangle until we have graphics done
		surface.rect((float)super.getX(),(float)super.getY(),27,27);
	}
	
}
