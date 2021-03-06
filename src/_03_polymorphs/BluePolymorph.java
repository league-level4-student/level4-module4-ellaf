package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	private int height;
	private int width;
	
	BluePolymorph(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
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
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
	
}
