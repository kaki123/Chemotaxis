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

 //Bacteria bac;//declare bacteria variables here  
 Bacteria [] bac; 
 public void setup()   
 {    
 	size(800,800); 
 	bac = new Bacteria[50];
 	/*for (int i=0; i<500; i+=100){
		for (int x=0; x<500; x+=70){
			 bac = new Bacteria(x,i,50,50,50);
			}
	}	*/
	for(int i = 0; i < bac.length;i++){
    	for (int y=0; y<500; y+=100){
			for (int x=0; x<500; x+=70){
				
				bac[i] = new Bacteria(x,y,(int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
				
			}
		}
  	}

 	
 	//bac = new Bacteria(250,250,50,50,50);
 	/*bac.move();
 	bac.show(); */
 	//initialize bacteria variables here   
 }   
 public void draw()   
 {  
	background(224,255,255);
	for(int i = 0; i < bac.length;i++)
  	{

    bac[i].move() ;

    bac[i].show() ;
  	}


	
 	for (int x=0; x<800; x+=70){
		ellipse(x,770,15,15);
		ellipse(x,750,15,15);
		ellipse(x,790,15,15);
		ellipse(x-15,770,15,15);
		ellipse(x+15,770,15,15);

	}

		
 	
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
 		//myX= myX + (int)(Math.random()*4)+8;
 		//myX= myY + (int)(Math.random()*4)+8;
 		int direction = (int)(Math.random()*4);

	  if(direction == 0)
	    myX = myX + 5; //right

	  else if(direction == 1)
	    myX = myX - 10; //left

	  else if(direction == 2)
	    myY = myY + 5; //down
	    
	  else // direction must be 3
	    myY = myY - 10; //up
	if(myX<0||myX>800||myY<0){
		myX=550;
		myY=(int)(Math.random()*500+250);
	}


 	}
 	public void show()
 	{
 		fill(r, g, b);
 		ellipse(myX, myY, 20,20);
 		ellipse(myX-20, myY, 20,20);
 		ellipse(myX, myY-20, 20,20);
 		ellipse(myX-20, myY-20, 20,20);
 		
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
