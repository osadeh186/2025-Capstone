package Field;
import processing.core.PApplet;

public class Flag extends FieldObject{
  
  private static final double FLAG_RAD = 15;
  private boolean onPlayerTeam; //true - on player's team, false otherwise

  public Flag(double x, double y){
    super(x,y, FLAG_RAD, FLAG_RAD, false);
  }

  @Override
  public void draw(PApplet surface){
    surface.circle((float)getX(), (float)getY(), (float)FLAG_RAD);
  }
}
