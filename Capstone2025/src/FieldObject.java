import java.awt.Rectangle;

public class FieldObject {

  private double x, y;
  private Rectangle hitbox;

  public FieldObject(double x, double y){
    this.x = x;
    this.y = y;
    hitbox = new Rectangle();
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  
  public Rectangle getHitbox() {
	  return hitbox;
  }
}
