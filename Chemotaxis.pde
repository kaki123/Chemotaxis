 //Bacteria bac;//declare bacteria variables here  
 Bacteria [] bac; 
 void setup()   
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
 void draw()   
 {  
	background(224,255,255);
	for(int i = 0; i < bac.length;i++)
  	{

    bac[i].move() ;

    bac[i].show() ;
  	}
	
		for (int y=700; y<800; y+=70){

		
			for (int x=0; x<800; x+=70){
 		
 		
			/*ellipse(x,770,15,15);
			ellipse(x,750,15,15);
			ellipse(x,790,15,15);
			ellipse(x-15,770,15,15);
			ellipse(x+15,770,15,15);*/
				ellipse(x,y,15,15);
				ellipse(x,y-20,15,15);
				ellipse(x,y+20,15,15);
				ellipse(x-15,y,15,15);
				ellipse(x+15,y,15,15);
			}
		}
	
	noStroke();
	fill(255,150,51);
	ellipse(50, 60, 100, 100);


		
 	
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
 		//myX= myX + (int)(Math.random()*4)+8;
 		//myX= myY + (int)(Math.random()*4)+8;
 		int direction = (int)(Math.random()*4);

	  if(direction == 0)
	    myX = myX + 2; //right

	  else if(direction == 1)
	    myX = myX - 2; //left

	  else if(direction == 2)
	    myY = myY + 2; //down
	    
	  else // direction must be 3
	    myY = myY - 2; //up
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
 	void show()
 	{
 		fill(r, g, b);
 		ellipse(myX, myY, 20,20);
 		ellipse(myX-20, myY, 20,20);
 		ellipse(myX, myY-20, 20,20);
 		ellipse(myX-20, myY-20, 20,20);
 		
 	}

 }    