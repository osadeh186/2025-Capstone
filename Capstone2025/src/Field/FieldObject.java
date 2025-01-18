package Field;

import alevy446.Shapes.Rectangle;
import processing.core.PApplet;

public class FieldObject {

  private double x, y, width, height;
  private Rectangle hitbox;
  private boolean isSolid;
	
  public FieldObject(double x, double y, double width, double height, boolean isSolid){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.isSolid = isSolid;
    hitbox = new Rectangle(x, y, width, height); //apparently the rectangle class is not what we thought it is
    //you could use the processing rect method that just creates a rectangle 
  }//I did add MY jar files of the shapes class you can use it if you want

  public double getX(){
    return x;
  }

  public double getY(){
	  return y;
  }

  public double getWidth(){
    return width;
  }

  public double getHeight(){
	  return height;
  }
  
  public Rectangle getHitbox() {
  	return hitbox;
  }

  public Boolean getIsSolid(){
    return isSolid;
  }

  public void draw(PApplet surface){
    surface.rect(x,y,width,height);
  }
}
