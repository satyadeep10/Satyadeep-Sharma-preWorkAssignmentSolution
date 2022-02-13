package Great_Learning_Week;

import java.util.Scanner;

public class Weekfourlearning {
	
	private static Scanner sc;
	
	public static void main(String[] args) 
	{
	
		Mainweekfour main = new Mainweekfour();
		sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("Enter the choice of function you want to run");
			System.out.println("Enter 0 to exit");
			System.out.println("Enter 1 for checkPalindrome function");
			System.out.println("Enter 2 for checkPrintstar function");
			System.out.println("Enter 3 for checkPrime function");
			System.out.println("Enter 4 for checkFabonacci function");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0: 
				break;
			case 1:
			{
				main.checkPalindrome();
			} break;
			case 2:
			{
				main.checkPrintStars();
			} break;
			case 3:
			{
				main.checkPrime();
				
			}break;
			case 4:
			{
				main.checkFabonacci();
			}break;
			default : System.out.println("User entered incorrect option");
			}
		}
		while (choice !=0);
			System.out.println("User enter incorrect choice !!!!!");
	}

}
