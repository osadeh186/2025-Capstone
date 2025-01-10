package Field;
import processing.core.PApplet;
public class Tree extends FieldObject{
  public Tree(double x, double y){
    super(x,y);
  }

  public void draw(PApplet surface){
    surface.rect((float)getX(), (float)getY(), 50f, 50f);
  }
}
