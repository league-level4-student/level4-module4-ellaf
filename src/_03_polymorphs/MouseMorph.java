package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph implements MouseMotionListener{
	
	private int height;
	private int width;
	int mouseX;
	int mouseY;
	
	MouseMorph(int x, int y, int width, int height) {
		super(x, y);
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
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update(){
		  x = mouseX;
		  y = mouseY;
	    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
	
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
