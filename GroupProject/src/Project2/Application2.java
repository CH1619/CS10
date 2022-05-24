package Project2;

import java.util.Scanner;

public class Application2 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter the amount of change you have: ");
	
		int change = userinput.nextInt();
	
		int quarters = change / 25;
	
		int dimes = (quarters % 25)/10;
	
		int nickels = ((dimes % 25)%10)/5;
	
		System.out.println("The amount of change you have is: " + quarters);
	
		System.out.println("Quarters: " + change);
	
		System.out.println("Dimes: " + dimes);
	
		System.out.println("Nickels: " + nickels);

	




	}

}
/* Screen Dump
Enter the amount of change you have: 
219
The amount of change you have is: 219
Quarters: 8
Dimes: 1
Nickels: 1	 
*/