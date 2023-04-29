package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x = 0;
	int y = 0;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
  
    }

    @Override
    public void draw() {
    	background(20,20,20);
    	fill(255, 0, 0);
    	ellipse(x, y, 100, 100);
    	
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
}
