import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
/*
Steven Li
31647656
Assignment 10
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that runs multiple animations
 */
public class squareMoving extends JComponent{
	protected int w = 30;
	protected int h = 30;
	//For Problem 3
	protected static int windowX = 0;
	protected static int windowY = 0;
	protected static int howManyLines = 1;
	protected int squareLocationX = 0;
	protected int squareLocationY = 0;
	protected double radian = 0;
	protected boolean start = true;
	protected int lineNumber = 1;
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.GREEN);
		//For problem 1-3
//		g.fillRect(squareLocationX, squareLocationY, w, h);
		
		//For Problem 4
//		while(lineNumber != howManyLines) {
//			int x = (int)(Math.random() * getWidth());
//			int y = (int)(Math.random() * getHeight());
//			int x2 = (int)(Math.random() * getWidth());
//			int y2 = (int)(Math.random() * getHeight());
//			g.drawLine(x, y, x2, y2);
//			lineNumber++;
//		}

	}

	protected Timer timer;
	
	public squareMoving() {
		timer = new Timer(5000, (ActionListener) new TimerCallback()); // 100 ms = 0.1 sec
		timer.start();
	}
	
	protected class TimerCallback implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {	
			int radius = 50;
			
			//For Problem 4
//			if(lineNumber == howManyLines) {
//				repaint();
//				lineNumber = 1;
//			}
			
			//For Problem 3
//			squareLocationX = windowX/2 - 15;
//			squareLocationY = windowY/2 - 15;
//			
//			squareLocationX = (int)(squareLocationX+radius*Math.cos(radian));
//			squareLocationY = (int)(squareLocationY+radius*Math.sin(radian));
//
//			radian+=0.1;

		//For Problem 1 and 2 
//		squareLocationX++;
//		squareLocationY++;
//		if(squareLocationX == getWidth()) {
//			squareLocationX = 0;
//			squareLocationY =0;
//		}
//		if(squareLocationY == getHeight()) {
//			squareLocationY = 0;
//			squareLocationX = 0;
//
//		}
			
			repaint();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a window heigth and width");
		windowY = scn.nextInt();
		System.out.println("Now a width");
		windowX = scn.nextInt();
		System.out.println("Please enter a number of lines to draw per 5 seconds");
		howManyLines = scn.nextInt();
		
		
		JFrame frame = new JFrame("AnimatedSquareCanvas");
		squareMoving canvas = new squareMoving();
		frame.add(canvas);
		frame.setSize(windowX, windowY);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);
	}
}
