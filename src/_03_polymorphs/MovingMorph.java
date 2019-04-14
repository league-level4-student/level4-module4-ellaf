package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	private int height;
	private int width;
	int b = 0;
	
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
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update(){
	if(x == 0 || x == (500-width)) {
		b += 1;
	}
	x += 1;
	y += 1;
    }

}
