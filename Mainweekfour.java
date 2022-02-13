package Great_Learning_Week;

import java.util.Scanner;

public class Mainweekfour {
	
	private Scanner sc;
	
	//Method to check palindrome
	public void checkPalindrome()
	{
		int a ; int b; int sum=0; int c;
		
		System.out.println("Enter number to check Palindrome");
		// Get value of integer
		sc = new Scanner(System.in);
		a = sc.nextInt();
		c=a;
		
		while(a>0)	
		{
			b=a%10;
			sum=(sum*10)+b;
			a=a/10;	
		}
		if(c==sum) 
		{
			System.out.println("Number is Palindrome");
		}
		else 
		{
			System.out.println("Number is NOT Palindrome");
		}
	}
	
	public void checkPrintStars() 
	{
		int i ; int j;
		System.out.println("Enter number to print star lines");
		sc = new Scanner(System.in);
		i=sc.nextInt();
		
		while(i>0)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			i--;
			System.out.println();
		}
		
	}
	
	public void checkPrime()
	{
		sc= new Scanner(System.in);
		System.out.println("Enter number to check if number is prime or not");
		int num1=sc.nextInt();
		int count =0;
		int i=2;
		do 
		{
			if(num1%i==0)
			{
				count++;
			}
			i++;
		} while (i<num1);
		
		if(count>0) 
		{
			System.out.println(num1+"  "+ "is Not prime number");
		}
		else 
		{
		System.out.println(num1+"  "+ "is prime number");	
		}
	}
	public void checkFabonacci() 
	{
		int a=0;  int b=1; int c;
		System.out.println("Enter number to print Fabonnaci series");
		sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("0 1"+" ");
		
		for(int i=2;i<num1;i++) 
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
		
	}
}
