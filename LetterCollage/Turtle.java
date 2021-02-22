//////////////////Himeth Jayakody////////////////////////////////////
//////////////////Week 5 - program 4////////////////////////////////
import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
    * draw on
    * @param x the starting x position
    * @param y the starting y position
    * @param picture the picture to draw on
    */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
    * display to draw it on
    * @param x the starting x position
    * @param y the starting y position
    * @param modelDisplayer the thing that displays the model
    */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
    * @param modelDisplay the thing that displays the model
    */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  
  
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }
  
  public void drawT() { 
    this.forward(100); 
    this.turnLeft(); 
    this.penUp(); 
    this.forward(40); 
    this.turn(180); 
    this.penDown(); 
    this.forward(80); 
    this.hide();
    
  }
//////////////////////Programs 2 & 3///////////////////////////
  public void drawSquare() {
    this.turnRight();
    this.forward(30);
    this.turnRight(); 
    this.forward(30);
    this.turnRight(); 
    this.forward(30);
    this.turnRight();
    this.forward(30);
  }
  
  public void drawSquare2() {
    int width = 30;
    this.turnRight();
    this.forward(width);
    this.turnRight(); 
    this.forward(width);
    this.turnRight(); 
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
//////////////////////Programs 2 & 3///////////////////////////
  
//////////////////////Hexagaon Methods/////////////////////////
  public void drawHexagon(){
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
  }
  public void drawMHex(){
    this.forward(30);
    this.turn(60);
    this.forward(30);
    this.turn(60);
    this.forward(30);
    this.turn(60);
    this.forward(30);
    this.turn(60);
    this.forward(30);
    this.turn(60);
    this.forward(30);
    this.turn(60);
  }
  public void drawSHex(){
    this.forward(10);
    this.turn(60);
    this.forward(10);
    this.turn(60);
    this.forward(10);
    this.turn(60);
    this.forward(10);
    this.turn(60);
    this.forward(10);
    this.turn(60);
    this.forward(10);
    this.turn(60);
  }
  
  public void drawHexagon(int sideLength) {
    if (sideLength <= 0)
    {
      System.out.println("Error: negative sideLength passed int drawHexagon");
      return;
    }
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    //System.out.println("Pre-conditions: <Method needs to be called from an object and sideLength must be greater than 0>\n Post-conditions: <object will draw a hexagon of desired size>\n Return value: <Turtle t draws a hexagon with sides " + sideLength+" long>");
  }
//////////////////////Hexagaon Methods/////////////////////////
  
//////////////////////Program 4///////////////////////////////
  public void drawSquare(int width) {
    this.turnRight();
    this.forward(width);
    this.turnRight(); 
    this.forward(width);
    this.turnRight(); 
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
//////////////////////Program 4///////////////////////////////
  public void drawStar(int width) {
    this.forward(width);
    this.turn(144);
    this.forward(width);
    this.turn(144);
    this.forward(width);
    this.turn(144);
    this.forward(width);
    this.turn(144);
    this.forward(width);
  }
  
  public static void drawHexP(Turtle fred, int x, int y, double heading, Color color, int width, int length)
  {
    /* Make tom draw a hexagon */
    
    fred.penUp();
    fred.moveTo(x,y);
    fred.turn(heading);
    fred.penDown();
    fred.setColor(color);
    fred.setPenWidth(width);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(30);
  }
  
  public void drawRec(int x)
  {
    this.forward(100*x);
    this.turnRight();
    this.forward(80*x);
    this.turnRight();
    this.forward(100*x);
    this.turnRight();
    this.forward(80*x);
    this.turn(180);
    this.penUp(); 
  }
  
  public void drawJ(Color c) {
    
    this.setPenColor(c); //sets color of pen
    
    //draws letter J
    this.penDown();
    this.turnRight();
    for (int x = 0; x < 3; x++) //for loop creates curve of J
    {
      this.forward(10);
      this.turn(-30);
    }
    this.forward(20);
    this.turnRight();
    this.forward(10);
    this.turn(180);
    this.forward(20);
    this.penUp();
    
    //moves to bottom right of box
    this.turnLeft(); 
    this.forward(32);
    this.turnLeft();
    this.forward(68);
    this.forward(10);//moves to next box
    this.turnLeft();//turns turtle upright
  }
  
  public void drawA(Color c)
  {
    this.setPenColor(c); //sets color of pen
    
    //draws letter A
    this.penDown();
    this.turn(30);
    this.forward(30);
    this.turn(120);
    this.forward(30);
    this.turn(180);
    this.forward(15);
    this.turn(-60);
    this.forward(15);
    this.penUp();
    
    //moves turtle to bottom right of box
    this.turnLeft();
    this.forward(13);
    this.turnLeft();
    this.forward(73);
    this.forward(10);//moves to next box
    this.turnLeft(); //turns turtle upright
  }
  
  public void drawY(Color c)
  {
    this.setPenColor(c); //sets color of pen
    
    //draws letter y
    this.turnRight();
    this.forward(20);
    this.turnLeft();
    this.penDown();
    this.forward(15);
    this.turn(60);
    this.forward(10);
    this.turn(180);
    this.forward(10);
    this.turn(60);
    this.forward(10);
    this.turn(180);
    this.forward(10);
    this.turn(-30);
    this.penUp();
    
    //moves to starting position
    this.turnRight();
    this.forward(15);
    this.turnLeft();
    this.forward(60);
    this.forward(10);//moves to next box
    this.turnLeft(); //turns turtle upright
  }
  
/////////////////////////////////////////////////////
  public void drawJBold(Color c, boolean b) {
    if (b==true)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1); 
    }
    this.setPenColor(c); //sets color of pen
    
    //draws letter J
    this.penDown();
    this.turnRight();
    for (int x = 0; x < 3; x++) //for loop creates curve of J
    {
      this.forward(10);
      this.turn(-30);
    }
    this.forward(20);
    this.turnRight();
    this.forward(10);
    this.turn(180);
    this.forward(20);
    this.penUp();
    
    //moves to bottom right of box
    this.turnLeft(); 
    this.forward(32);
    this.turnLeft();
    this.forward(68);
    this.forward(10);//moves to next box
    this.turnLeft();//turns turtle upright
  }
  
  public void drawABold(Color c, boolean b)
  {
    if (b==true)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1); 
    }
    this.setPenColor(c); //sets color of pen
    
    //draws letter A
    this.penDown();
    this.turn(30);
    this.forward(30);
    this.turn(120);
    this.forward(30);
    this.turn(180);
    this.forward(15);
    this.turn(-60);
    this.forward(15);
    this.penUp();
    
    //moves turtle to bottom right of box
    this.turnLeft();
    this.forward(13);
    this.turnLeft();
    this.forward(73);
    this.forward(10);//moves to next box
    this.turnLeft(); //turns turtle upright
  }
  
  public void drawYBold(Color c, boolean b)
  {
    if (b==true)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1); 
    }
    this.setPenColor(c); //sets color of pen
    
    //draws letter y
    this.turnRight();
    this.forward(20);
    this.turnLeft();
    this.penDown();
    this.forward(15);
    this.turn(60);
    this.forward(10);
    this.turn(180);
    this.forward(10);
    this.turn(60);
    this.forward(10);
    this.turn(180);
    this.forward(10);
    this.turn(-30);
    this.penUp();
    
    //moves to starting position
    this.turnRight();
    this.forward(15);
    this.turnLeft();
    this.forward(60);
    this.forward(10);//moves to next box
    this.turnLeft(); //turns turtle upright
  }
/////////////////////////////////////////////////////
  
/////////////////////////////////////////////////////
  public void drawJBoldSize(Color c, boolean b, int x) {
    if (b==true)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1); 
    }
    this.setPenColor(c); //sets color of pen
    
    //draws letter J
    this.penDown();
    this.turnRight();
    for (int i = 0; i < 3; i++) //for loop creates curve of J
    {
      this.forward(10*x);
      this.turn(-30);
    }
    this.forward(20*x);
    this.turnRight();
    this.forward(10*x);
    this.turn(180);
    this.forward(20*x);
    this.penUp();
    
    //moves to bottom right of box
    this.turnLeft(); 
    this.forward(32*x);
    this.turnLeft();
    this.forward(68*x);
    this.forward(10);//moves to next box
    this.turnLeft();//turns turtle upright
  }
  
  public void drawABoldSize(Color c, boolean b, int x)
  {
    if (b==true)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1); 
    }
    this.setPenColor(c); //sets color of pen
    
    //draws letter A
    this.penDown();
    this.turn(30);
    this.forward(30*x);
    this.turn(120);
    this.forward(30*x);
    this.turn(180);
    this.forward(15*x);
    this.turn(-60);
    this.forward(15*x);
    this.penUp();
    
    //moves turtle to bottom right of box
    this.turnLeft();
    this.forward(13*x);
    this.turnLeft();
    this.forward(73*x);
    this.forward(10);//moves to next box
    this.turnLeft(); //turns turtle upright
  }
  
  public void drawYBoldSize(Color c, boolean b, int x)
  {
    if (b==true)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1); 
    }
    this.setPenColor(c); //sets color of pen
    
    //draws letter y
    this.turnRight();
    this.forward(20*x);
    this.turnLeft();
    this.penDown();
    this.forward(15*x);
    this.turn(60);
    this.forward(10*x);
    this.turn(180);
    this.forward(10*x);
    this.turn(60);
    this.forward(10*x);
    this.turn(180);
    this.forward(10*x);
    this.turn(-30);
    this.penUp();
    
    //moves to starting position
    this.turnRight();
    this.forward(15*x);
    this.turnLeft();
    this.forward(60*x);
    this.forward(10);//moves to next box
    this.turnLeft(); //turns turtle upright
  }
/////////////////////////////////////////////////////
  
  public void drawQuestionMark(Color c) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    // first move over while pen is up
    this.turnRight();
    this.forward(38);
    // now put pen down, set color
    this.setPenColor(c);
    this.penDown();
    // draw vertical part of bottom of question mark
    this.forward(4);
    this.turnLeft();
    this.forward(4);
    this.turnLeft();
    this.forward(4);
    this.turnLeft();
    this.forward(4);
    this.turn(180);
    
    // move up a bit
    this.penUp(); 
    this.forward(10); 
    
    // draw stick below curve
    this.penDown(); 
    this.forward(20); 
    
    // draw round part of question mark
    /*int angle = -40;
     int dist = 15;
     this.turnRight();
     this.forward(5);
     this.turn(angle);
     this.forward(dist);
     this.turn(angle);
     this.forward(dist);
     this.turn(angle);
     this.forward(dist);
     this.turn(angle);
     this.forward(dist);
     this.turn(angle);
     this.forward(dist);*/
    this.turnRight();
    this.forward(5);
    for (int i =0; i<=5; i++)
    {
      this.forward(15);
      this.turn(-40);
    }
    
    
    // move to bottom right of letter area
    this.penUp();
    this.turnLeft();
    this.forward(40);
    this.turn(20);
    this.forward(30);
    
    // move to next letter position`
    this.turnLeft();
    this.forward(35);
    this.turnLeft();  
    
  } // end of question mark method
  
  
  public void drawExclamationMark(Color c) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    // first move over while pen is up
    this.turnRight();
    this.forward(38);
    // now put pen down, set color
    this.setPenColor(c);
    this.penDown();
    // draw bottom of exclamation mark
    this.forward(4);
    this.turnLeft();
    this.forward(4);
    this.turnLeft();
    this.forward(4);
    this.turnLeft();
    this.forward(4);
    this.turn(180);
    
    // move up a bit
    this.penUp(); 
    this.forward(10); 
    // move right a bit
    this.turnRight();
    this.forward(2);
    this.turnLeft();
    
    // draw top of exclamation mrk
    this.penDown(); 
    this.forward(65); 
    
    // move to bottom right of letter area
    this.penUp();
    this.turn(180);
    this.forward(75);
    this.turnLeft();
    this.forward(25);
    
    // move to next letter position`
    //this.turnLeft();
    this.forward(35);
    this.turnLeft();  
    
  } // end of exclamation mark method
  
  public int getDistance2()
  {
    int x1 = 0;
    int x2 = (int)this.getXPos();
    int x = x2-x1;
    
    int y1=0;
    int y2= (int)this.getYPos();
    int y = y2-y1;
    
    int distance = (int)(Math.sqrt((x*x)+(y*y)));
    return distance;
  }
  
  public boolean isTurtleClose(Turtle u, int threshold)
  {
    double x1 = this.getXPos();
    double x2 = u.getXPos();
    double x = x1-x2;
    
    double y1= this.getYPos();
    double y2 = u.getYPos();
    double y = y1-y2;
    
    double dist =Math.sqrt((x*x)+(y*y));
    if (dist<=threshold)
      return true;
    else
      return false;
    
  }
  
  public static String helpGetters()
  {
    String str = "Common getters: isPenDown(), getPenColor(), getXPos(), getYPos()";
    return str;
  }
  
  public static String helpSetters()
  {
    String str = "Common setters: setPenColor(Color c), setPenDown(boolean b), setHeading(int direction)"; 
    return str;
  }
  public static String helpDrawing()
  {
    String str = "Drawing methods: forward(int dist), backward(int dist), turnLeft(), turnRight(), turn(int degrees), moveTo(int x, int y)"; 
    return str;
  }
  
  public static void help()
  {
    String str1=helpGetters();
    String str2=helpSetters();
    String str3=helpDrawing();
    
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
  }
  
  public void drawTriangle(int width)
  {
    this.turn(30);
    this.forward(width);
    this.turn(120);
    this.forward(width);
    this.turn(120);
    this.forward(width);
  }
  
  public void drawEllipse(int length)
  {
    int count = 1;
    
    while (count <= 5)
    {
      this.forward(length);
      this.turn(360/30);   
      count = count + 1;
    }
    
    while (count <= 10)
    {
      this.forward(length*2);
      this.turn(360/30);   
      count = count + 1;
    }
    
    while (count <= 20)
    {
      this.forward(length);
      this.turn(360/30);   
      count = count + 1;
    }
    
    while (count <= 25)
    {
      this.forward(length*2);
      this.turn(360/30);   
      count = count + 1;
    }
    
    while (count <= 30)
    {
      this.forward(length);
      this.turn(360/30);   
      count = count + 1;
    }
  }
  
  public void drawMustache(int x, int y, Color color)
  {
    this.penUp();
    this.moveTo(x,y);
    this.setPenColor(color);
    this.setPenWidth(40);
    this.penDown();
    this.turn(120);
    this.forward(160);
    this.turn(-70);
    this.forward(100);
    this.turn(80);
    this.forward(90);
    this.turn(-80);
    this.forward(80);
    this.turn(80);
    this.forward(80);
    this.turn(-80);
    this.forward(90);
    this.turn(80);
    this.forward(100);
    this.turn(-70);
    this.forward(160);
    this.setHeading(0.0);
  }
  
  public void drawEarrings(int x, int y, Color color)
  {
    this.penUp();
    this.moveTo(x,y);
    this.setPenWidth(10);
    this.setPenColor(color);
    this.penDown();
    int count = 1;
    
    while (count <= 30)
    {
      this.forward(10);
      this.turn(360/30);   
      count = count + 1;
    }
  }
}
// this } is the end of class Turtle, put all new methods before this