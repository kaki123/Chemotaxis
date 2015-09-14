 //declare bacteria variables here   
 void setup()   
 {    
 	size(500,500); 
 	Bacteria bac = new Bacteria();
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
 	int myX, myY, c;
 	c = color(value1, value2, value3);
 	Bacteria(x,y,col)
 	{
 		myX=x;
 		myY=y;
 		c=col; 
 	}

 	void move()
 	{
 		myX= (int)(Math.random()*4);
 		myX= (int)(Math.random()*4);

 	}
 	void show()
 	{
 		
 		
 	}

 }    