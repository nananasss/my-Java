

import java.util.Scanner;

public class mortagage {
	public static void main (String[] args) {

	int  A , n;
	double p , r;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the amount: ");
	A = scan.nextInt();
	// A is the mortagage amount
	
	System.out.println("Enter the annual intrest persent: ");
	r = scan.nextInt();
	r = r/100/12;
	//r is the intrest rate we have to converted to monthly
	
	System.out.println("Enter the amortization in years: ");
	n = scan.nextInt();
	n = n*12;
	//n is the monthly amortization that's why its n times 12 
	
	double numerator;
	numerator = r*A;
	
	r++;
	r = Math.pow(r, n);
	double denominator;
	denominator = 1 - 1/r;
	
	p= numerator/denominator;
	
	System.out.println("The monthly payment is: " + p);
	
	
			
		
	
}
}
