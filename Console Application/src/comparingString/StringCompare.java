package comparingString;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringCompare {

	public void StringCompares() {
		Scanner s=new Scanner(System.in);
		String[]arr=new String[3];
		System.out.println("Enter three words to be compared");
		System.out.println("Two of the words should be the same and the third one different");
		System.out.println("");
		
		//using for loop so as to input three string 
		 for(int a=0;a<arr.length;a++){
			    System.out.print("Entered String Value is: ");
			       arr[a]=s.nextLine();
		 
		 

	        // Test any of the above Strings equal to one another
	     boolean equals1 = arr[0].equalsIgnoreCase(arr[1]);
	     boolean equals2 = arr[0].equalsIgnoreCase(arr[2]);
	     System.out.println();
	    
	     // Display the results of the equality checks.
	     System.out.println("\"" + arr[0] + "\" equals \"" + arr[1] + "\"? " + equals1);
	     
	     System.out.println("\"" + arr[0] + "\" equals \"" + arr[2] + "\"? " + equals2);
	     System.out.println();
	     
	     //combining bool value
	     boolean combine=equals1&&equals2;
	    		 
	     
	     
	     try {
	        String fileName="abc.txt";
			PrintWriter outputStream=new PrintWriter(fileName);
			
			outputStream.println(combine);//stores data in Ram
			outputStream.close();//data sent to file
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	   }
	}
}
	


