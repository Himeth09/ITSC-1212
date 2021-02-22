public class Lab2Bonus {   
  
  public static void main(String [] args)   
  {     
    World w = new World();
    Turtle tom = new Turtle(100, 100, w);
    
    // call the new drawHexagon method many times
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(100, 200);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(118,90);
    tom.penDown();
    tom.drawMHex();
    
    tom.penUp();
    tom.moveTo(135,80);
    tom.penDown();
    tom.drawSHex();
    
    tom.penUp();
    tom.moveTo(118,190);
    tom.penDown();
    tom.drawMHex();
    
    tom.penUp();
    tom.moveTo(135,180);
    tom.penDown();
    tom.drawSHex();
    
     tom.penUp();
    tom.moveTo(100, 200);
    tom.penDown();
    tom.drawHexagon();
    
     tom.penUp();
    tom.moveTo(200, 200);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(200, 100);
    tom.penDown();
    tom.drawHexagon();
    
    
    tom.penUp();
    tom.moveTo(218,90);
    tom.penDown();
    tom.drawMHex();
    
    tom.penUp();
    tom.moveTo(235,80);
    tom.penDown();
    tom.drawSHex();
    
    tom.penUp();
    tom.moveTo(218,190);
    tom.penDown();
    tom.drawMHex();
    
    tom.penUp();
    tom.moveTo(235,180);
    tom.penDown();
    tom.drawSHex();
     
     
  }
}