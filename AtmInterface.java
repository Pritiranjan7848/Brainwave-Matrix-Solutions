package study;

import java.util.Scanner;

public class AtmInterface {
private double balance=1000.0;
private int pin=7848;
private Scanner sc=new Scanner(System.in);
public void run() {
	System.out.println("Welcome to the ATM!");
	
	while(true) {
		System.out.println("Enter your PIN:");
		int enteredPin=sc.nextInt();
		if(enteredPin==pin) {
			while(true) {
				System.out.println("1.Check Balance");
				System.out.println("2.Withdraw");
				System.out.println("3.Deposit");
				System.out.println("4.Exit");
				System.out.println("Choose an option:");
				int option=sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("Your balance is:"+balance);
					break;
				case 2:
					System.out.println("Enter amount to withdraw:");
					double amount=sc.nextDouble();
				if(amount>balance)
				{
					System.out.println("Insufficient balance!");
				}
				else {
					balance-=amount;
					System.out.println("Withdrawl successful!");
				}
				break;
				case 3:
					System.out.println("Enter amount to deposit:");
					amount=sc.nextDouble();
					balance+=amount;
					System.out.println("Deposit successful");
					break;
				case 4:
					System.out.println("Existing");
					return;
					default:
						System.out.println("Invalid option!");
				}
			}
		}
		
			
		else {
			System.out.println("Invalid PIN!");
				
			}
		}
	}
	
	public static void main(String[] args) {
		AtmInterface atm = new AtmInterface();
		atm.run();
	}
		// TODO Auto-generated method stub

	}
