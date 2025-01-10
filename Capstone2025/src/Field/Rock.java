package Field;
import processing.core.PApplet;
public class Rock extends FieldObject{
  public Rock(double x, double y){
    super(x,y);
  }

  public void draw(PApplet surface){
    surface.circle((float)getX(), (float)getY(), 50f);
  }
}
