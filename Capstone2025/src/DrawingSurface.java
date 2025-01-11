import Characters.*;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {
	//consider adding all players+bots as fields if the number of them is fixed
	private Player plyr = new Player(400,300); // experimental player 
	private boolean up = false , down = false, right =false, left = false;
	public DrawingSurface() {
	}
	
	
	public void settings() {

		setSize(800, 600);
	}
	
	
	public void draw() {
		background(255,255,255);
//		double x= plyr.getX();
//		double y = plyr.getY();
		//rect(50,50,50,50);
		plyr.draw(this);
		if(up) 
			plyr.step("up");
		if(down) 
			plyr.step("down");
		if(right)
			plyr.step("right");
		if(left)
			plyr.step("left");	
		
	}
	public void keyPressed() {
		if(key == 'w')
			up = true;
		if(key == 's') 
			down = true;
		if(key == 'd')
			right = true;
		if(key == 'a')
			left = true;

	}
	public void keyReleased() {
		if(key == 'w')
			up = false;
		if(key == 's') 
			down = false;
		if(key == 'd')
			right = false;
		if(key == 'a')
			left = false;
	}

	
	
	
}
