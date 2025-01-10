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
    hitbox = new Rectangle(x, y, width, height);
  }

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
