package Field;
import processing.core.PApplet;

public class Rock extends FieldObject{
  
  private static final double ROCK_RAD = 50;
  
  public Rock(double x, double y){
    super(x,y, ROCK_RAD, ROCK_RAD, true);
  }

  @Override
  public void draw(PApplet surface){
    surface.circle((float)getX(), (float)getY(), (float)ROCK_RAD);
  }
}
