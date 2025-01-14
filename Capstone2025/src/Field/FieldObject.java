package Field;
import java.awt.Rectangle;

public class FieldObject {

  private double x, y, width, height;
  private Rectangle hitbox;
	
  public FieldObject(double x, double y, double width, double height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
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
}
