import Characters.*;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {
	//consider adding all players+bots as fields if the number of them is fixed
	private Player plyr = new Player(400,300); // experimental player 
	
	public DrawingSurface() {
	}
	
	
	public void settings() {

		setSize(800, 600);
	}
	
	
	public void draw() {
		background(255,255,255);

		
		//movement still isn't working well 
		plyr.draw(this);
		if(keyPressed) {
			if(key == 'w')
				plyr.step("up");
			if(key == 's') 
				plyr.step("down");
			if(key == 'd')
				plyr.step("right");
			if(key == 'a')
				plyr.step("left");	

		}
		
	}
	
	
	
}
