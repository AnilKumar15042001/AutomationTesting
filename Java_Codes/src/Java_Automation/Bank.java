package Java_Automation;

import java.util.Scanner;

class Bank1{
	private double balance;
	Bank1(double initialbalance)
	{
		balance=initialbalance;
	}
	void deposit(double amount)
	{
		
		System.out.print(balance+"+"+amount+"=");
		balance=balance+amount;
		System.out.println(balance);
		System.out.println("Deposit successful new Balance is="+balance);
	}
	void withdraw(double amount)
	{
		if(amount<=balance)
		{
			//balance=balance-amount;
			System.out.println(balance+"-"+amount+"="+(balance-amount));
			System.out.println("Withdraw successful and Available Balance="+(balance-amount));
		}
		else
		{
			System.out.println("Insufficent Balance and Balance is="+balance);
			System.out.println(balance+"-"+amount+"= "+(balance-amount));
		}
	}
	void checkBalance()
	{
		System.out.println("Balance is="+balance);
	}
}

public class Bank {

	public static void main(String[] args) {
		
		Bank1 obj=new Bank1(1000);
		String name="Anil Kumar";
		System.out.println("Enter pin number!...");
		Scanner s=new Scanner(System.in);
		int pin=s.nextInt();
		if(pin==1504)
		{
			System.out.println(pin+"=="+pin);
			System.out.println("Pin Matched Successfully");
			System.out.println(name+" your account is opened");
			System.out.println();
			System.out.println("1.Check balance!...");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			int choice;
			System.out.println("Choose one option");
			choice=s.nextInt();
			while(choice!=4) {
			switch(choice)
			{
			case 1:obj.checkBalance();
			break;
			case 2:System.out.println("Enter amount to Deposit:");
			       double deposit=s.nextDouble();
				   obj.deposit(deposit);
			break;
			case 3:System.out.println("Enter Withdraw amount:");
			       double withdraw=s.nextDouble();
				   obj.withdraw(withdraw);
			break;
			case 4:System.out.println("Thank You!...");
			break;
			default:System.out.println("Invalid option");
			}
			choice++;
			}
		}
		else
		{
			System.out.println(pin+"!="+"1504");
			System.out.println("Pin Not Matched");
			System.out.println(pin+" is incorrect pin please try again");
		}
		
	}

}
