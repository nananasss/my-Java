

import java.util.Scanner;
public class Queen {
	 public static void main(String[] args) {
     	Scanner scan = new Scanner(System.in);
	//create and initialize our board's row and column
    int r = 10, c =10;
	char board[][] = new char[r][c];
	
	int count;
	for(int i =0; i < r ; i++) { //to ask for column number 10 times
		System.out.println("Please enter the column to put queen");
		count = scan.nextInt();
		
		while(count<0 || count>c) {//to make sure we have the correct column number
			System.out.println("Invalid column. please enter value between 0-"+c);
			count = scan.nextInt();
			}
		board[i][count] = 'Q';
		
	}
			//to make the shape of the board
			for(int i =0; i<r ; i++) {
				for(int j = 0; j<c ; j++) {
					if(board[i][j] != 'Q') {
						System.out.print(" . ");
				}
				else 
					System.out.print(" Q ");
				}
			System.out.println();
			}}
	        
		
		
	 }


