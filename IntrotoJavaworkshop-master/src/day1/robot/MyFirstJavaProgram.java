package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
         Robot potatopug = new Robot();
         potatopug.penDown();
         potatopug.setSpeed(4);
         int sides = 33;
         potatopug.setPenColor(Color.pink);
         for (int i = 0; i < sides; i++) {
        	 potatopug.move(100);
             potatopug.turn(360/sides);
		}  
         
         
         
         
         
	
		
		
	}

	
	}

