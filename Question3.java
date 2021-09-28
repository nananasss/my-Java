package Assignment3;
//Naseem Khaksar 217755992 ITEC1620 Section C

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
	//creating and initializing local variables
		int n;
		int array[];
		
		
		int maxindex = 0, minindex =0, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("The array lenght is: ");
		
		n = scan.nextInt();
		array = new int[n];
		System.out.println();
		//getting the value for the array
		for(int i = 0; i<n ; i++) {
			System.out.println("Please enter the value for the array:");
			array[i]=scan.nextInt();
			while(array[i]<0) {
				System.out.println("Please enter a positive value:");
				array[i]=scan.nextInt();
			}
			
		}
		//before swap
		System.out.println();
		System.out.print("Before swapping the min max, the array is\n");
		for(int i = 0; i<n ;i++) {
			System.out.print(array[i]+" ");
		}
		//finding the max value
		int maxValue = array[0];
		for(int i = 1; i<array.length; i++) {
			if(array[i]>maxValue) {
				maxValue = array[i];
				maxindex = i;
			}
		}
		System.out.println();
		System.out.println("\nThe max is " + maxValue + " and its location is "+ maxindex);
		
		//finding the min value
		int minValue = array[0];
		for(int i = 1; i<array.length; i++) {
			if(array[i] < minValue) {
				minValue = array[i];
				minindex = i;
			}
		}
		System.out.println("The min is " + minValue + " and its location is "+ minindex);
		//swapping
		
		temp = array[maxindex];
		array[maxindex]=array[minindex];
		array[minindex]=temp;
		System.out.print("\nAfter swapping the min max, the array is\n");
		for(int i = 0; i<n ;i++) {
			System.out.print(array[i]+" ");
		}
		//sort the array in ascending order
		for(int i = 0; i<array.length; i++) {
			for(int j = i +1; j<array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//array after sorting
		System.out.println();
		System.out.print("\nThe array sorted in Ascending Order:");
		for(int i = 0; i<n ; i++) {
			System.out.print(array[i]+ " ");
		}
		//finding the maiden
		int Mid = 0, midNext = 0;
		float a = 0;
		if((n%2) != 0) {
			Mid = (n/2)+1;
			a = array[Mid];
		}
		else {
			Mid = n/2;
			midNext = Mid + 1;
			float add = array[Mid-1] + array[midNext -1];
			float div = add/2;
			a = div;
		}
	
		System.out.println();
		System.out.print("\nThe median is: " + a);
		
		
		
	}

}
