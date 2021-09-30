package fibonacciSeries;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
	
	public void Fibonaccis() {
		try {
		int n, num1=0,num2=1;
		System.out.println("How many numbers do you want to be printed.");
		
		Scanner z=new Scanner(System.in);
		n=z.nextInt();
		System.out.println("The "+n+" numbers of Fibanacci series are: ");
		
		int i=1;
		//doing while loop to loop through the numbers as specified by the user.
		while(i<=n) {
			
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(num1+" ");
			i++;
	   }
	  }catch(InputMismatchException e){
			System.out.println("Please input a number " +e.getMessage());
			System.out.println("Restart the program again please");
		}
	}
}

