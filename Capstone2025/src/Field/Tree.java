package Field;
import processing.core.PApplet;

public class Tree extends FieldObject{

  private double TREE_HEIGHT = 100;
  private double TREE_WIDTH = 20;
  
  public Tree(double x, double y){
    super(x,y, TREE_WIDTH, TREE_HEIGHT);
  }

  public void draw(PApplet surface){
    surface.rect((float)getX(), (float)getY(), (float)TREE_WIDTH, (flaot)TREE_HEIGHT);
  }
}
