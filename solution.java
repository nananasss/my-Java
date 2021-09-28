package lab1;
//Naseem Khaksar 217755992 ITEC1620 Section C

import java.util.Scanner;

public class solution {
	
	public static void main (String [] args) {
	int a, b, c;
	double x1, x2;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	a = scan.nextInt();
	
	System.out.println("Enter the value of b: ");
	b = scan.nextInt();
	
	System.out.println("Enter the value of c: ");
	c = scan.nextInt();
	
	double d;
	d = Math.pow(b, 2);
	d = d - 4*a*c;
	Math.abs(d);
	
	double x1numerator;
	x1numerator = -1*b + Math.sqrt(d);
	double dominaitor = 2*a;
	x1 = x1numerator/dominaitor;
	
	double x2numerator;
	x2numerator = -1*b - Math.sqrt(d);
	x2 = x2numerator/dominaitor;
			
	
	System.out.println("x1: " + x1);
	System.out.println("x2: " + x2);
	
	
			
			
	
			
	
	
		
	}

		
}
