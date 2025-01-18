package Field;
import processing.core.PApplet;

public class Flag extends FieldObject{
  
  private static final double FLAG_RAD = 15;
  
  public Flag(double x, double y){
    super(x,y, FLAG_RAD, FLAG_RAD, false);
  }

  public void draw(PApplet surface){
    surface.circle((float)getX(), (float)getY(), (float)FLAG_RAD);
  }
}
