

public class DiceGame {
	public static void main(String [] args) {

   
		String win1 = null; //Initializing global variables
		String win2 = null;
		String win3 = null;
		int sum2 = 0;
		int sum3 = 0;
		int temp3 = 0;
		int temp2 = 0;
		int sum1 = 0;
		int temp1 = 0;
		int sum = 0;
		while(sum<=15) { //the main loop that controls the number of times they each roll a dice
			 //player 1 has dice1 and dice2
			int dice1=(int)(Math.random()*6+1);
			int dice2=(int)(Math.random()*6+1);
			//if player1 gets a double it rolls again
			if(dice1 == dice2) {
				dice1=(int)(Math.random()*6+1);
				dice2=(int)(Math.random()*6+1);
				}
				else {	//this helps with the alternative turns
				int sum11 = 0;
				
			
				System.out.println("Player 1 rolls a " + dice1 + " and a " + dice2);
				 sum11 = dice1 + dice2;
				temp1 = sum11;
			//add each roll's 2 dices together
			}
			sum1 = sum1 + temp1;
			System.out.println("Player 1 now has " + sum1);	
			
			
			
			
			 //player 2 has dice3 and dice4 and repeat everything we did for player1 here for player2 and player3
				int dice3=(int)(Math.random()*6+1);
				int dice4=(int)(Math.random()*6+1);
				
				if(dice3 == dice4) {
					dice3=(int)(Math.random()*6+1);
					dice4=(int)(Math.random()*6+1);
					}
					else {	
					int sum22 = 0;
				
					System.out.println("Player 2 rolls a " + dice3 + " and a " + dice4);
					 sum22 = dice3 + dice4;
					temp2 = sum22;
					}
				sum2 = sum2 + temp2;
				System.out.println("Player 2 now has " + sum2);	
				
				
				

				//player3 has dice5 and dice 	
				int dice5=(int)(Math.random()*6+1);
				int dice6=(int)(Math.random()*6+1);
				
				if(dice5 == dice6) {
					dice5=(int)(Math.random()*6+1);
					dice6=(int)(Math.random()*6+1);
					}
					else {	
					int sum33 = 0;
					
				
					System.out.println("Player 3 rolls a " + dice5 + " and a " + dice6);
					 sum33 = dice5 + dice6;
					temp3 = sum33;
				
				}
				sum3 = sum3 + temp3;
				System.out.println("Player 3 now has " + sum3);
		
		//if the sum of player1 is bigger than or equal than 15 it checks it with sum of the other 2 players and if true player1 wins the first place and
				//then checks if the sum of which two remaining players is bigger and declares that as the second place and the other one as the third place and vice versa
				
				
		            if(sum1>=15 || sum2>=15 || sum3>=15) { //in order to one of them wins or its sum reaches 15 it enters this loop 
					if(sum1>=15  && sum1>sum2 && sum1>sum3) {
				
					sum = sum1;
					 win1 = "player 1 wins the first place with a total of ";
					 if(sum2>sum3)
						 System.out.println( win1 + sum + "\nplayer 2 wins the second place with a total of " + sum2 + "\nplayer 3 wins the third place witha total of " + sum3);		
					 else {
					 if(sum3>sum2)
					  System.out.println( win1 + sum + "\nplayer 3 wins the second place with a total of " + sum3 + "\nplayer 2 wins the third place witha total of " + sum2);
					 }
					}
					
				else {
				
					if( sum2>=15 && sum2>sum1 && sum2>sum3) {
						
						sum = sum2;
						 win2 = "player 2 wins the first place with a total of ";
						 if(sum1>sum3)
							 System.out.println( win2 + sum + "\nplayer 1 wins the second place with a total of " + sum1 + "\nplayer 3 wins the third place witha total of " + sum3);		
						 
							 else {
							 if(sum3>sum1)
						  System.out.println( win2 + sum + "\nplayer 3 wins the second place with a total of " + sum3 + "\nplayer 2 wins the third place witha total of " + sum1);
							 
						 }
					 }
						
				
				   
				if(sum3 >=15 && sum3>sum2 && sum3>sum1) {
					sum = sum3;
					 win3 = "player 3 wins the first place with a total of ";
					  if(sum1>sum2)
						 System.out.println( win3 + sum + "\nplayer 1 wins the second place with a total of " + sum1 + "\nplayer 2 wins the third place witha total of " + sum2);		
					  else
						 if(sum2>sum1)
					  System.out.println( win3 + sum + "\nplayer 2 wins the second place with a total of " + sum2 + "\nplayer 1 wins the third place witha total of " + sum1);
				}
		            }
		}
	}
				
	}}
				
		
		
		

		

	

	
	
		
	


				
		
		







