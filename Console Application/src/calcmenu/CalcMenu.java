package calcmenu;

import palindrome.Palindrome;
import fibonacciSeries.Fibonacci;
import comparingString.StringCompare;
import patternConsole.Pattern;
import consoleFileDisplay.FileDisplay;
import appendingFile.AppendFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcMenu {

	public static void main(String[] args) {
		
		// Instantiating the Palindrome class
		Palindrome obj=new Palindrome();
		// Instantiating the Fibonacci class
		Fibonacci obj1=new Fibonacci();
		// Instantiating the StringCompare class
		StringCompare obj2=new StringCompare();
		// Instantiating the Pattern class
		Pattern obj3=new Pattern();
		// Instantiating the FileDisplay class
		FileDisplay obj4=new FileDisplay();
		// Instantiating the AppendFile class
		AppendFile obj5=new AppendFile();
				
		//Scanner class for inputing menu values
		Scanner userInput = new Scanner(System.in);
		int num = 0;
		int i = 0;//variable used for creating the for loop
		String name;
		
		//Asks the user for their Name
		System.out.println("Enter your name");
		name = userInput.nextLine();
		
		//Declares infinite loop to display Menu
		for(i = 0; i >= 0 ; ++i ){
		//This is the menu
		System.out.println("");
		System.out.println("Welcome " +name + " to Torvald Application!");
		System.out.println("");

    	System.out.println("Enter the number of the task you wish to performshem"
    			+ "");
    	System.out.println("");
		
		System.out.println("1: Pattern Application");
		System.out.println("2: Fibonacci series");
		System.out.println("3: Palindrome");
		System.out.println("4: String Compare");
		System.out.println("5: Append pattern to File");
		System.out.println("6: Display Content of a File");
		System.out.println("7: Exit Program");
		
		if(userInput.hasNextInt()){
			//Used for asking the user for input for the Menu above
			num = userInput.nextInt();
			
			//choose values that are displayed between the range that is in the menu
			if (num == 1){
			//Display pattern based output 
			obj3.patterns();

			}
			else if (num == 2){
			//Displays number you want to be printed.
			obj1.Fibonaccis();

			}

			else if (num == 3){
			//Determine number if palindrome or not
			obj.palindromes();
			}

			else if (num == 4){
			//Compares two strings 
			obj2.StringCompares();
			}

			else if (num == 5){
			//Add a word to existing text. 
			obj5.AppendFiles();
			
			}
			
			else if (num == 6){
			//Displays file output
			obj4.FileDisplays();
			}

			else if (num == 7){
			//Exits the menu
			System.out.println("Finish");
			break;
			}	
			//Prints out error if values are not within range
			else{
			System.out.println("Error Please input numbers between 1 to 7");
		   }
		 }
	   }
	 }
   }
  
 


