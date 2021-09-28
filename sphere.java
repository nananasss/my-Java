
import java.util.Scanner;


public class sphere {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		//First we should declare that radius is a double then ask the user to enter it
		double r;
		
		System.out.println("Enter the radius of the sphere: ");
		
		r = scan.nextDouble();
		//then using the input r we compute the Area and the volume of the sphere
		// because in the direction the area and volume have only two-digit fraction, so we should use the smaller primitive data type
		//float(32bits) instead of double(64bits)
		float Area;
		r = Math.pow(r , 2);
		Area = (float)(4 * Math.PI * r);
		
		System.out.println("The area of the sphere is: " + Area);
		
		// we have to calculate the square root of r because if we don't the r that program will use is r^2 (it's last value)
		float Volume;
		r = Math.sqrt(r);
		r = Math.pow(r, 3);
		Volume =(float)((4 * Math.PI * r)/3);
		
		System.out.println("The volume of the sphere is: " + Volume);
		
	}

}
