package com.assiTwo;
import java.util.Scanner;

public class AssiTwo {
	long balance;

	public void depositMoney(long amount) {
		if (amount <= 0) {
			System.out.println("Invalid deposite amount.\n");
			return;
		}
		balance += amount;
		System.out.println(amount + " Money Deposited Sucessfully.\n");
	}

	public void withdrawMoney(long amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.\n");
			return;
		}
		if (amount > balance) {
			System.out.println("Not Sufficient Balanc.\n");
		} else {
			balance -= amount;
			System.out.println(amount + " Money Withdrawn.\n");
		}
	}

	public void showBalance() {
		System.out.println("Available Money : " + balance + "\n");
	}

	private static void showMenu() {
		System.out.println("----- ATM Menu -----");
		System.out.println("1. Deposite Money");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.print("Select option: ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AssiTwo atm = new AssiTwo();
		boolean running = true;
		long amt;

		while (running) {
			showMenu();
			int choice = input.nextInt();
			System.out.println();

			switch (choice) {
				case 1:
					System.out.print("Enter Deposite amount: ");
					amt = input.nextLong();
					atm.depositMoney(amt);
					break;
				case 2:
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextLong();
					atm.withdrawMoney(amt);
					break;
				case 3:
					atm.showBalance();
					break;
				case 4:
					System.out.println("Good bye.! Thank you for using the ATM.");
					System.exit(0);
				default:
					System.out.println("Invalid option.\n");
			}
			System.out.println("------------------------------------");
		}
		input.close();
	}
}
