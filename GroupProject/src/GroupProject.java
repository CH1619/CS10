import java.util.Scanner;

public class GroupProject 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
	
		
		int randomnum1 = 1 + (int) (Math.random() * 10);
	
		int randomnum2 = 1 + (int) (Math.random() * 10);
	
		System.out.println("Select an operator by typing the associated number: ");
	
		System.out.println("1 : Addition"); 
		System.out.println("2 : Subtraction");
		System.out.println("3 : Division");
		System.out.println("4 : Multiplication");
	
		int operator = userinput.nextInt();
		
		double answer = 0;
		
		
		
		switch (operator);
		{
			case 1:
				Canswer = randomnum1 + randomnum2;
				System.out.println("What is " + randomnum1 + "/" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				
	
			case 2:
				Canswer = randomnum1 - randomnum2;
				System.out.println("What is " + randomnum1 + "*" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				
	
			case 3:
				Canswer = randomnum1/randomnum2;
				System.out.println("What is " + randomnum1 + "-" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				
	
			case 4:
				Canswer = randomnum1*randomnum2;
				System.out.println("What is " + randomnum1 + "+" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				 
		}
		double Canswer = 0;
		
		if (answer == Canswer);
		{
			System.out.println("You got it right! Congratulations!!");
			
		}
		if (answer != Canswer);
		{
			System.out.println("you were incorrect. You'll get it next time!");
		}	

	}

}
/* Screen Dump
1 : Addition
2 : Subtraction
3 : Division
4 : Multiplication
4
What is 4*8?
32
You got it right! Congratulations!!
*/