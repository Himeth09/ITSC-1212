import java.util.*;

public class turtleDrawStar
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a value for size");
    int x = input.nextInt();
    input.close();
    
    Wolrd w = new World();
    Turtle t = new Turtle(w);
    t.drawStar(x);
  }
}