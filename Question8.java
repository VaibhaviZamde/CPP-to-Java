/*
8) WAP of bank class with following details 
1. Customer name, Account no. Bank name, account type, balance 
2. Operations
2.1 get customer data
2.2 print customer data
2.3 debit given amount If balance is more than 2000
2.4 credit given amount
2.5 show balance
*/
import java.util.Scanner;
class Bank
{
	String cust_name , bank_name , acc_type ;
	double balance,amount;
	long acc_no;
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String args[])
	{
		Bank b = new Bank();	
		b.getData();
		b.displayData();
		b.debit();
		b.credit();
		b.balance();
	}
	
	public void getData()
	{
		System.out.print("Enter customer name : ");
		cust_name = scan.nextLine();
		System.out.print("Enter bank name : ");
		bank_name = scan.nextLine();
		System.out.print("Enter account type : ");
		acc_type = scan.nextLine();
		System.out.print("Enter Account Number : ");
		acc_no = scan.nextInt();
		System.out.print("Enter balance : ");
		balance = scan.nextDouble();
	}
	
	public void displayData()
	{
		System.out.println("Customer name = "+ cust_name);
		System.out.println("Account number = "+ acc_no);
		System.out.println("Bank name = "+ bank_name);
		System.out.println("Account type = "+ acc_type);
		System.out.println("balance = "+ balance);
	}
	
	public void debit()
	{
		if(balance >= 2000)
		{
			System.out.print("Enter amount you want to debit : ");
			amount = scan.nextDouble();
			
			balance = balance - amount;
			System.out.println("Amount debited Successfully..");
		}
		else
		{
			System.out.println("You can't debit..");
		}
	}
	
	public void credit()
	{
		System.out.print("Enter amount you want to credit : ");
		amount = scan.nextDouble();
		
		balance = balance + amount;
		System.out.println("Amount credited Successfully..");	
	}
	
	public void balance()
	{
		System.out.print("Balance is "+balance);
	}
}
