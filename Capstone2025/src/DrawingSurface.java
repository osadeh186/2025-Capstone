import Characters.*;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {
	//consider adding all players+bots as fields if the number of them is fixed
	private Player plyr = new Player(400,300); // experimental player 
	private boolean up = false , down = false, right =false, left = false;
	private double relBoX = 0, relBoY = 0; //relative Board / Object x, relative Board /object y
	public DrawingSurface() {
	}
	
	
	public void settings() {

		setSize(800, 600);
	}
	
	
	public void draw() {
		background(255,255,255);
		//every time any kind of object is created (other than the player itself)
		//its coordinates (instead just (x,y)) should be set to:
		//(relBoX + (intended coordinate x), relBoY + (intended coordinate y))
		fill(255,0,0);
		//temporary rectangles :
		rect((float)(relBoX+50),(float)(relBoY+50),50,50);
		rect((float)(relBoX+550),(float)(relBoY+450),50,50);
		rect((float)(relBoX+50),(float)(relBoY+450),50,50);
		rect((float)(relBoX+550),(float)(relBoY+50),50,50);
		fill(0,255,0);
		plyr.draw(this);
		if(up) 
			relBoY += plyr.getVel();
		if(down) 
			relBoY -= plyr.getVel();
		if(right)
			relBoX -= plyr.getVel();
		if(left)
			relBoX += plyr.getVel();
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
