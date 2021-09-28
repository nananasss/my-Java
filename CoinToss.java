package tut4;

import java.util.*;

public class CoinToss {
	public static void main (String [] args) {
	Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	
		System.out.println("PLease input your guess(1 for heads. 0 for tails): ");
		int yourcoin = scan.nextInt();
		if (yourcoin == 1)
			System.out.println("you chose heads");
		else if (yourcoin == 0)
			System.out.println("you chose tails");
		
		int coin = generator.nextInt(2);
		
		if (coin == 1)
		{
			System.out.println("the toss was head");
		    if (yourcoin == 1)
			System.out.println("you win");
		    else
		    	System.out.println("you lose");
		}
		else
		{
		    System.out.println("the toss was tails");
		    if (yourcoin == 0)
		    	System.out.println("you win");
		    else
		    	System.out.println("you lose");
		}
		
		
	}

}
