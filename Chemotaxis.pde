 Bacteria bac;//declare bacteria variables here   
 void setup()   
 {    
 	size(500,500); 
 	bac = new Bacteria(250,250,50,50,50);
 	/*bac.move();
 	bac.show(); */
 	//initialize bacteria variables here   
 }   
 void draw()   
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

 	void move()
 	{
 		myX= myX + (int)(Math.random()*4)+1;
 		myX= myY + (int)(Math.random()*4)+1;

 	}
 	void show()
 	{
 		fill(r, g, b);
 		ellipse(myX, myY, 20,20);
 		
 	}

 }    