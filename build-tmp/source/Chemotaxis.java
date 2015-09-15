import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 Bacteria bac;//declare bacteria variables here   
 public void setup()   
 {    
 	size(500,500); 
 	bac = new Bacteria(250,250,50,50,50);
 	/*bac.move();
 	bac.show(); */
 	//initialize bacteria variables here   
 }   
 public void draw()   
 {  
	
 	bac.move();
 	bac.show();  
 	//move and show the bacteria   
 }  
 class Bacteria    
 {  
 	int myX, myY, r, g, b;
 	
 	Bacteria(int x, int y, int r1, int g1, int b1)
 	{
 		myX=x;
 		myY=y;
 		r=r1;
 		g=g1;
 		b=b1; 
 	}

 	public void move()
 	{
 		myX= myX + (int)(Math.random()*4)+1;
 		myX= myY + (int)(Math.random()*4)+1;

 	}
 	public void show()
 	{
 		fill(r, g, b);
 		ellipse(myX, myY, 20,20);
 		
 	}

 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
