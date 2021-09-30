package patternConsole;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern {

	public void patterns() {
		System.out.println("Welcome");
		System.out.println();
		
		//using try catch to prevent the user from inputting a String/words
		//asking user input
		try {
		Scanner z=new Scanner(System.in);
		int[] arr= new int [5];
		System.out.println("Enter 5 Numbers to be sorted");
	    for(int a=0;a<arr.length;a++){
	    System.out.print("Entered Value " + (a+1) +"=");
	       arr[a]=z.nextInt();
	    }
	    
	    //printing array in ascending Order
	    System.out.println();
	    System.out.println("Numbers in Ascending Order:" );

	    for(int i = 0; i < arr.length; i++) {
	        Arrays.sort(arr);
	        System.out.print( " " +arr[i]);
	    }
	   
	    //printing array in Descending order
	    System.out.println();
	    System.out.println("Numbers in Descending Order: " );
	    for(int i = arr.length - 1; i >= 0; i--){
	    	Arrays.sort(arr);
	      System.out.print( " " +arr[i]);
	    }
		}catch(InputMismatchException e){
			System.out.println("Please input a number " +e.getMessage());
			System.out.println("Restart the program again please");
		}
	}
}
