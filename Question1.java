//Find factorial of number
import java.util.Scanner;
class Question1 
{
	public static void main(String args[])
	{
		int i=1,f=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = scan.nextInt();
		
		for(; i<=num ; i++)
		{
			f = f*i;
		}
		
		System.out.println("Factorial is "+f);
	}
}
