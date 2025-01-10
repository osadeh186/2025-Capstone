import processing.core.PApplet
public class Rock extends FieldObject{
  public Rock(double x, double y){
    super(x,y);
  }

  public draw(PApplet surface){
    surface.circle(getX(), getY(), 50);
  }
}
