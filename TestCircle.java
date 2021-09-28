package Assignment2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = 0.0;
		double perimeter = 0.0;
		double area = 0.0;
		String coll = null;
		//call on the constructor
		Circle c1 = new Circle();
		
		//get objects from the constructor
		c1.display1();
		double area1 = c1.calculateArea();
		double perimeter1 = c1.getPerimeter();
		//use this import class to control the numbers that come after decimal point
		DecimalFormat fmt = new DecimalFormat("0.####");
		
		System.out.println(", area of " + fmt.format(area1) + " and perimeter of " + fmt.format(perimeter1));
		
		//and extra empty line to be cleaner
		System.out.println();
		
       
		System.out.println("Please enter the radius for the second circle:");
        c1.setRadius();
         r = scan.nextDouble();
        //this loop works until the user inputs a positive number
         while( r <  0) {
        	System.out.println("Please enter a positive value of the radius for second circle:");
        r = scan.nextDouble();
        }
        	
        System.out.println("Please enter color for the second circle:");
        c1.setColor(coll);
         coll = scan.next();
        //call on the method in the constructor and use the user input
         Circle c2 = new Circle();
         c2.calculateArea();
         c2.getPerimeter();
        
         area = Math.PI * Math.pow(r, 2);
         perimeter = Math.PI * r * 2;
         System.out.println("The second circle is " + coll + " and has radius of " + r + ", area of " + fmt.format(area) + " and perimeter of " + fmt.format(perimeter) );
        
         
         System.out.println();
         
         
         System.out.println("Please enter the NEW radius for the second circle:");
         c1.setRadius();
          r = scan.nextDouble();
         while( r <  0) {
         	System.out.println("Please enter a positive value of the NEW radius for second circle:");
         r = scan.nextDouble();
         }
       //call on the method in the constructor and use the NEW user input 	
          Circle c3 = new Circle();
          c3.calculateArea();
          c3.getPerimeter();
          
          area = Math.PI * Math.pow(r, 2);
          perimeter = Math.PI * r * 2;
          
          System.out.println("The radius of the " + coll + " become " + r + ", its area now is " + fmt.format(area) + " and its perimeter is now " + fmt.format(perimeter));
         
	}

}
