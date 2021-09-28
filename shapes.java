package Assignment1;
 //Naseem Khaksar 217755992 ITEC1620 section c

import java.util.Scanner;

public class shapes {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		//First we need to get a text message from the user
		
		String message;
		System.out.println("Enter greeting message: ");
		message =scan.nextLine();	
		//we print the user's msg between to empty lines as it was directed 
	System.out.println();
	System.out.println(message);
	System.out.println();
	// we print the shapes using escape sequence
	
	System.out.println("   *\n  ***\n *****\n  ***\n   *");
	System.out.println();
	int a=7;
	int b=8;
	System.out.println(" *********\n *\t *\n *\t *\n *\t *\n *\t " + a +"\t *\n *\t " + b + "\t *"
			+ "\n *\t *\n *\t " +(2*a) + "\t *\n *\t " + (2*b) + "\t *\n *\t *\n *\t *\n *\t *\n"
			+ " *********");
	System.out.println();
	System.out.println("     *\n  *\t*\n * \t *\n*\t  *\n * \t *\n  *\t*\n     *");
	System.out.println();
	System.out.println("\\\'Enjoy!\'\\\\\\\\\\");
	
	}

}
