import java.awt.Color;

public class letterCollage {
  public static void main(String [] args) 
  {
    World w = new World(800,800);
    
    /* Create a turtle named t */
    Turtle t = new Turtle(100, 100, w);
    
    t.moveTo(65, 300);
    
    writeName(t, Color.red, false, 2);
    
    t.moveTo(68, 303);
    
    writeName(t, Color.blue, false, 2);
    
    t.moveTo(30,500);
    t.turn(-30);
    
    writeName(t, Color.green, false, 3);
    
    t.moveTo(30,100);
    t.turn(60);
    
    writeName(t, Color.magenta, true, 3);
    
    t.setHeading(0.0);
    t.moveTo(700, 700);
    t.turn(180);
    writeName(t, Color.red, false, 2);
    
    t.moveTo(350,500);
    t.penDown();
    
    t.setPenColor(Color.black);
    t.setHeading(20.0);
    t.drawStar(160);
    t.penUp();
    
    t.moveTo(350,600);
    writeName(t,Color.orange,false,1);
    
    t.moveTo(450,600);
    t.setHeading(0.0);
    t.turn(-45);
    writeName(t,Color.orange,true,1);
     
    /* t.drawJ(Color.blue); //draws 1st letter, J
     
     t.drawA(Color.red);
     
     
     t.drawY(Color.green);
     
     
     t.drawA(Color.orange);
     
     t.moveTo(100,200);
     
     t.drawJBold(Color.blue, true);
     
     t.drawABold(Color.red,true);
     
     t.drawYBold(Color.green,true);
     
     t.drawABold(Color.orange,true);
     
     
     
     t.moveTo(100,300);
     
     t.drawJBoldSize(Color.blue, true, 3);
     
     t.drawABoldSize(Color.red,true, 3);
     
     t.drawYBoldSize(Color.green,true, 3);
     
     t.drawABoldSize(Color.orange,true,3);*/
    
    /*t.drawQuestionMark(Color.red);
     t.drawExclamationMark(Color.blue)*/
  }
  
  public static void drawPattern(Turtle t, Color c) {
    t.drawQuestionMark(c);
    t.drawExclamationMark(c);
    t.drawQuestionMark(c);
    t.drawExclamationMark(c);
  }
  
  public static void writeName(Turtle t, Color c, boolean b, int i)
  {
    t.drawJBoldSize(c, b, i);
    t.drawABoldSize(c, b, i);
    t.drawYBoldSize(c, b, i);
    t.drawABoldSize(c, b, i);
  }
}
