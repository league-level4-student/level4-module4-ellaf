package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
    protected int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void setX(int a) {
    	x = a;
    }
    public int getX() {
    	return x;
    }
    
    public void setY(int b) {
    	y = b;
    }
    public int getY() {
    	return y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
