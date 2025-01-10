import processing.core.PApplet
public class Tree extends FieldObject{
  public Tree(double x, double y){
    super(x,y);
  }

  public draw(PApplet surface){
    surface.quad(getX(), getY(), 50, 50);
  }
}
