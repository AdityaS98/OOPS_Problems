package com.logical;

import java.util.*;

/**
 * 
 * @author DELL
 *
 */

public class AccountManagement {

	/*
	 * To define method to debit amount from balance and report it with remaining
	 * balance in th bank account
	 */

	public static void toDebitAmount(int balance, int amount) {
		if (balance < amount) {
			System.out.println("Debit amount exceeded account balance.");
		} else {
			System.out.println("The amount " + amount + " is debited remaining balance is " + (balance - amount));

		}
	}

	/**
	 * 
	 * @param args
	 */
	/*
	 * Main Function
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account balance");
		int accountBalance = sc.nextInt();

		System.out.println("Enter amount to be debit");
		int amountDebit = sc.nextInt();

		/*
		 * To call method to debit amount
		 */

		toDebitAmount(accountBalance, amountDebit);

	}

}
