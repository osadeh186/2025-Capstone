package Field;
import processing.core.PApplet;

public class Rock extends FieldObject{
  
  private static final double ROCK_WIDTH = 50;
  
  public Rock(double x, double y){
    super(x,y, ROCK_WIDTH, ROCK_WIDTH);
  }

  public void draw(PApplet surface){
    surface.circle((float)getX(), (float)getY(), 50f);
  }
}
