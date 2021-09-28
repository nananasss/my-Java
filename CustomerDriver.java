
import java.util.*;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer[] cus = new Customer[6]; //creating the array of 6 customers
		Scanner scan = new Scanner(System.in);
		
		System.out.println("For 6 customers enter the name and in the next line enter the balance");
		for(int i =0; i<cus.length; i++) {
			
			String a = scan.nextLine(); //customer's name
			double b = scan.nextDouble();scan.nextLine(); //customer's balance
			cus[i] = new Customer(a,b); //adding to the array
			}
		//methods
		CustomerSearch(cus);
		averageBalance(cus);
		customerHighLowBal(cus);
		balanceIncrease(cus);
		
		

}
	
	private static void CustomerSearch(Customer[] cus1) {
		System.out.println();
		System.out.println("Search for all customers who have less than $150");
		for(int i = 0; i<cus1.length; i++) { //running the loop up to array's length
			if(cus1[i].getBalance()<150) { //check the balance
				System.out.println(cus1[i].getName());
			}
		}
	
		
	}

	private static void averageBalance(Customer[] cus) {
		double sum = 0.0 , avg;
		for(int i =0 ; i<cus.length; i++) {
			sum = sum + cus[i].getBalance(); //summing all the values
		}
		avg = sum/cus.length; //finding avg
		System.out.println("The average balance is: " + avg);
		System.out.println();
	}
	
	private static void customerHighLowBal(Customer[] cus) {
		double high = cus[1].getBalance(); //initializing the high to cus[0].balance
		double low = cus[1].getBalance();//getting the name for the said high balance
		String high1 = cus[1].getName();//initializing the low to cus[0].balance
		String low1 = cus[1].getName();//getting the name for the said low balance
		
				for(int i = 0; i<cus.length ; i++) {
			if(cus[i].getBalance()>high) { //if if is true we change the high
			 high = cus[i].getBalance();
			 high1 = cus[i].getName();			 
			}
			
			else
			{
				if(cus[i].getBalance()<low) { //if if is true we change the low
					low = cus[i].getBalance();
					low1 = cus[i].getName();
			}}
		}
	System.out.println("The customer with the highesr balance is: " + high1);
	System.out.println();
	System.out.println("The customer with the lowest balance is: " + low1);
	System.out.println();
	}
	
	private static void balanceIncrease(Customer[] cus) {
		double value;
		for(int i = 0; i<cus.length; i++) {
			value = cus[i].addPercentage(); //use the method in the constructor
			cus[i].setBalance(value);
			}
		System.out.println("Show all accounts after a 15% balance increase");
		for(int i =0; i<cus.length; i++) {
			
			System.out.println(cus[i].getName() + " has \t" + cus[i].getBalance() );
			
		}
	}
	
	
	
}
