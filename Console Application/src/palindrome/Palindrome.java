package palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public void palindromes(){
	
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter a Number To Determine If Its Palindrome");
		
		int x=s.nextInt();
		int sum = 0, r;
		 int reverse = x;
		
		 // reversed integer is stored in variable 
		 while(x>0) {
			
			 r = x % 10;   
		     sum = (sum*10)+r;    //code to make reverse number
		     x = x/10;
		 }
		 
		 //Check number if to a Palindrome value or not.
		 if(reverse==sum) {
			 System.out.println("Number is Palindrome!!!!.");
		 }else {
			 System.out.println("Number Chosen is Not Palindrome!!!!.");
			 System.out.println("");
		 }
		 
	}
	
}
