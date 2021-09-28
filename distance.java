package Assignment1;
//Naseem Khaksar 217755992 ITEC1620 Section c

import java.util.Scanner;

public class distance {
	public static void main(String [] args) {
		int Xa ;
		int Ya;
		Scanner scan = new Scanner(System.in);
		// First we get point A's coordinates from user
		System.out.println("Enter the x coordinate of point A: ");
		Xa = scan.nextInt();
		System.out.println("Enter the y coordinate of point A: ");
		Ya = scan.nextInt();
		
		// Second we get the slope and slope-intercrept of the line from user
		double a , b;
		System.out.println("Enter the slope of line: ");
		a = scan.nextDouble();
		System.out.println("Enter the slope-intercept of the line: ");
		b = scan.nextDouble();
		System.out.println();
		
		// Third we calculate the slope of perpendicular line anf get Ap
		double Ap = -1/a;
		//use Ap to calculate the slope intercrept of the perpendicular line to get the Bp
		double Bp = Ya - (Ap*Xa);
		
		System.out.println("The slope of the perpendicular line is: " + Ap);
		System.out.println("The slope intercept of the perpendicular line is: " + Bp);
		System.out.println();
		
		// Fourth using Ap & Bp we calculate the coordinates of the intersection point
		double x1, y1;
		x1 = (Bp - b)/(a - Ap);
		y1 = (a*x1)+b;
		
		System.out.println("The coordinates of the intersection point are x= " + x1 +" and y= " + y1);
		System.out.println();
		
		// fifth using x1 & y1 we calculate the distance between point A and the line
		double X;
		X = Xa - x1;
		X = Math.pow(X, 2);
		
		// for easy understanding i have separated the radicand into X=(xa-x1)^2 and Y=(ya-y1)^2
		double Y;
		Y = Ya - y1;
		Y = Math.pow(Y, 2);
		
		//just add X & Y and compute the square root and we have the distance
		double distance = X + Y;
		distance = Math.sqrt(distance);
		
		System.out.println("The distance from point A to the line is: " + distance + "! !" );
		
	}

}
