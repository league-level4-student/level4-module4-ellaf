package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	private int width;
	private int height;
	double num = 0;
	double dx;
	double dy;
	
	CircleMorph(double dx, double dy, int width, int height) {
		super((int)dx, (int)dy);
		this.dx = dx;
		this.dy = dy;
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	public void setHeight(int a) {
		height = a;
	}
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int b) {
		width = b;
	}
	public int getWidth() {
		return width;
	}


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.pink);
		g.fillRect((int)dx, (int)dy, width, height);
	}
	
	@Override
	public void update(){
	  num += 0.05;
	  dx += Math.sin(num)*2;
	  dy += Math.cos(num)*2;
	  
    }

}
