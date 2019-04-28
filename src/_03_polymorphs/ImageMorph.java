package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ImageMorph extends Polymorph{

	private int height;
	private int width;
	private BufferedImage charles;
	
	ImageMorph(int x, int y, int width, int height, BufferedImage charles) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.charles = charles;
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
		g.drawImage(charles, x, y, null);
	
	}

}
