

import java.util.Scanner;

public class Echo {
	public static void main(String[] args)
	{
		String text;
		System.out.println("Enter a line of message: ");
		
		Scanner scan = new Scanner(System.in);
		text = scan.nextLine();
		System.out.println("You entered: \""  + text + "\"");
		
	}

}
