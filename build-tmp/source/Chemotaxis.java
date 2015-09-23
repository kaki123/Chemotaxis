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
    	//for (int y=0; y<500; y+=100){
		//	for (int x=0; x<500; x+=70){
				
				bac[i] = new Bacteria((int)(Math.random()*800),600,(int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
				
		//	}
		//}
  	}

 	
 	//bac = new Bacteria(250,250,50,50,50);
 	/*bac.move();
 	bac.show(); */
 	//initialize bacteria variables here   
 }   
 public void draw()   
 {  
	background(204,255,255);
	 stroke(255,255,255);
  fill(255,255,255);
  ellipse(270,70,130,130);
  ellipse(220,70,90,90);
  ellipse(330,70,90,90);
  ellipse(540,70,130,130);
  ellipse(470,70,90,90);
  ellipse(590,70,90,90);

	noStroke();
	fill(255,150,51);
	ellipse(50, 60, 100, 100);
	//yelloe flowers

		for (int y=700; y<800; y+=70){

		
			for (int x=0; x<800; x+=70){
 		
 		
			/*ellipse(x,770,15,15);
			ellipse(x,750,15,15);
			ellipse(x,790,15,15);
			ellipse(x-15,770,15,15);
			ellipse(x+15,770,15,15);*/
				fill(255,255,0);
				ellipse(x,y,15,15);
				fill(255,0,0);
				ellipse(x-7,y-20,15,22);
				ellipse(x+10,y-17,15,22);
				ellipse(x+4,y+20,15,20);
				
				ellipse(x-15,y+5,20,15);
				ellipse(x+15,y+5,20,15);
			}
		}
	

	if(mousePressed==true){
		background(0,0,0);
		fill(155,255,255);
		ellipse(50, 60, 100, 100);
		//green flowers
		for (int y=700; y<800; y+=70){

		
			for (int x=0; x<800; x+=70){
 		
 	
				fill(255,255,255);
				ellipse(x,y,15,15);
				fill(102,255,102);
				ellipse(x-7,y-20,15,22);
				ellipse(x+10,y-17,15,22);
				ellipse(x+4,y+20,15,20);
				
				ellipse(x-15,y+5,20,15);
				ellipse(x+15,y+5,20,15);
			}
		}


	}
	for(int i = 0; i < bac.length;i++)
  	{

    bac[i].move() ;

    bac[i].show() ;
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
 		Boolean alive = true;

 		if (alive==true){

		  if(mouseX > myX)
		    myX = myX + (int)(Math.random()*4)+2;


		  else if(mouseX < myX)
		    myX = myX - (int)(Math.random()*4)+2;

		  if(mouseY > myY)
		    myY = myY + (int)(Math.random()*4)+2;

		    
		  else // direction must be 3
		     myY = myY -(int)(Math.random()*4)+2;
 			}
 		
	if(myX<0||myX>800||myY<0){
		myX=550;
		myY=(int)(Math.random()*500+250);
	}
/*	if(get(myX,myY)==color(0)){
		myX= myX -30;
	
	}
	else if(get(myX,myY)==color(0)){
		myX= myX +30;
		
	}
	else if(get(myX,myY)==color(0)){
		myX= myX -30;
	
	}
	else if(get(myX,myY)==color(0)){
		myX= myX +30;
	
	}*/
 	}
 	public void show()
 	{
 		
 			
 			fill(r, g, b);
	 		ellipse(myX, myY, 20,20);
	 		ellipse(myX-20, myY, 20,20);
	 		ellipse(myX, myY-20, 20,20);
	 		ellipse(myX-20, myY-20, 20,20);}/*fill(r, g, b);
 		ellipse(myX, myY, 20,20);
 		ellipse(myX-20, myY, 20,20);
 		ellipse(myX, myY-20, 20,20);
 		ellipse(myX-20, myY-20, 20,20);*/
 		
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
