package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> list = new ArrayList<Polymorph>();
    
    // Polymorph bluePoly;
    // Polymorph redPoly;
    // Polymorph movPoly;
    	
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
    	MouseMorph m = new MouseMorph(0,0,50,50);
    	this.addMouseMotionListener(m);
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
     // bluePoly = new BluePolymorph(50, 50, 50, 50);
     //	redPoly = new RedMorph(100, 100, 50, 50);
     // movPoly = new MovingMorph(150, 150, 50, 50);
     list.add(new BluePolymorph(50,50,50,50));
     list.add(new RedMorph(50,150,50,50));
     list.add(new MovingMorph(150,50,75,75));
     list.add(new CircleMorph(200,200,50,50));
     list.add(m);
     
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 // bluePoly.draw(g);
     // redPoly.draw(g);
     // movPoly.draw(g);
   	 for(Polymorph poly : list) {
   		 poly.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
     // bluePoly.update();
     // redPoly.update();
    	 // movPoly.update();
   	for(Polymorph poly : list) {
  		 poly.update();
  	 }
    }


}
