package Assignment2;
//Naseem Khaksar 217755992 ITEC 1620 section C
    public class Circle{
	 private double radius;
	 private String color;
	 private double area;
	 //default constructor
	 Circle(){
		 radius = 2.0;
		 color = "Green";
	 }
	//parameterized constructor
	public Circle(double rad, String col){
		this();
		radius = rad;
		color = col;
		}
//getter and setter for radius and color variable
	public double getRadius(double rad) {
		return radius;
	}

	public void setRadius() {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//calculateArea public method
	 double calculateArea(){
		return Math.PI * Math.pow(this.radius, 2);
	
	}
	
	 
	 
	 //getPerimeter public method
	public double getPerimeter() {
		return Math.PI * this.radius * 2;		
		}
		
	
	void display1() {
		System.out.print("The first circle is " + this.color + " and has radius of " + this.radius);
	    
	}
	
	
		} 
	 
