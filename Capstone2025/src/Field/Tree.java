package Field;
import processing.core.PApplet;

public class Tree extends FieldObject{

  private static final double TREE_HEIGHT = 100;
  private static final double TREE_WIDTH = 20;
  
  public Tree(double x, double y){
    super(x,y, TREE_WIDTH, TREE_HEIGHT, true);
  }
}
