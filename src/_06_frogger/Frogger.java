package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
	
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    int x;
	int y;
	Car car;
	Car car2;
	Car car3;
	Car car4;
	Car car5;
	Car car6;
	Car car7;
	Car car8;
	Car car9;
	PImage back;
	PImage carLeft;
	PImage carRight;
	PImage frog;

    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        x = width/2;
        y = height-40;
    }

    @Override
    public void setup() {
    	
    	back = loadImage("/Users/league/git/level1-module3-hellocoding123/src/_06_frogger/froggerBackground.png");
    	back.resize(WIDTH, HEIGHT);
        carLeft = loadImage("/Users/league/git/level1-module3-hellocoding123/src/_06_frogger/carLeft.png");
        carLeft.resize(160,100);
        carRight = loadImage("/Users/league/git/level1-module3-hellocoding123/src/_06_frogger/carRight.png");
        carRight.resize(160,100);
        frog = loadImage("/Users/league/git/level1-module3-hellocoding123/src/_06_frogger/frog.png");
        frog.resize(20,20);
    	car = new Car(width,200,2,50);
    	car2 = new Car(-50,150,5,50);
    	car3 = new Car(width,0,3,50);
    	car4 = new Car(-50,50,1,50);
    	car5 = new Car(width,100,4,50);
    	car6 = new Car(-50,250,5,50);
    	car7 = new Car(width,300,3,50);
    	car8 = new Car(-50,425,1,50);
    	
    }

    @Override
    public void draw() {
    	
    	background(back);
        image (frog, x, y);
    	car.display();
    	car2.display();
    	car3.display();
    	car4.display();
    	car5.display();
    	car6.display();
    	car7.display();
    	car8.display();

    	car.moveLeft();
    	car2.moveRight();
    	car3.moveLeft();
    	car4.moveRight();
    	car5.moveLeft();
    	car6.moveRight();
    	car7.moveLeft();
    	car8.moveRight();

    	if (intersects(car)||intersects(car2)||intersects(car3)||intersects(car4)||intersects(car5)||intersects(car6)||intersects(car7)||intersects(car8)) {
    		 x = width/2;
    	     y = height-40;
    	}
    	
    }
    	boolean intersects(Car car) {
    		 if ((y > car.getY() && y < car.getY()+15) &&
    		                (x > car.getX() && x < car.getX()+car.getSize())) {
    		   return true;
    		  }
    		 else  {
    		  return false;
    		 }
    	
    }
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
        
        
    }
    
    public void keyPressed()
    {
        if(key == CODED){
        	
            if(keyCode == UP)
            	
            {
            	//Frog Y position goes up
                y-=5;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y+=5;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	x+=5;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x-=5;
            }
        }
    }

	class Car {
		
		private int x;
		private int y;
		private int speed;
		private int size;
		
		void display()
		{
		   fill(0,255,0);
		   rect(x , y,  size, 15);
		}
		
		void moveLeft() {
			x-=speed;
			
			if (x <= -size) {
				x=width;
			}
		}
		
		void moveRight() {
			x+=speed;
			
			if (x >= width) {
				x=-size;
			}
		}
		
		int getX() {
			return x;
		}
		
		int getY() { 
			return y;
		}
		
		int getSize() {
			return size;
		}

		
		public Car(int x, int y, int speed, int size) {
			
			this.x = x;
			this.y = y;
			this.speed = speed;
			this.size = size;
			
		}
		
	}
}