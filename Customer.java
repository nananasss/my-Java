package Assignment3;
//Naseem Khaksar 217755992 ITEC1620 Section C

public class Customer {
	
	private String name;
	private double balance;
	
	//Parameterized constructor 
	Customer(String n, double b){
		this.name = n;
		this.balance = b;
	}
	//methods
	//gives back the name and balance
	public String ToString() {
		return this.name + this.balance;
	}
	
	//will take a % value and add it to the balance
	public double addPercentage() {
		//15% balance increase
		double per;
		per = (15 * balance)/100;
		double newBalance = per + balance;
		return newBalance;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
