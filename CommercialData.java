package com.logical;

/**
 * 
 * @author DELL
 *
 */

import java.util.*;

class StockDetails {

}

public class CommercialData {

	/*
	 * To print the value of stock in the account
	 */

	public static double value(int totalAccount) {
		return totalAccount;
	}
	/*
	 * Method to buy stocks add it into the account
	 */

	public static void buy(int amount, String symbol, int totalAccount) {
		totalAccount += amount;
		System.out.println(amount + "worth stocks of " + symbol + " is added to account");
	}

	/*
	 * Method to sell stocks and subtract the value of shares from account
	 */

	public static void sell(int amount, String symbol, int totalAccount) {
		totalAccount -= amount;
		System.out.println(amount + "worth stocks of " + symbol + " is sold");
	}

	/*
	 * To print stocks in account
	 */

	public static void printReport(String symbol, int valuestock) {

		System.out.println("Current stocks " + symbol + "value is " + valuestock);

	}

	/**
	 * 
	 * @param args
	 */

	/*
	 * This is our main function
	 */
	public static void main(String[] args) {
		// Array List
		ArrayList<StockDetails> stockAccount = new ArrayList<StockDetails>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter current stock account value");

		int totalStockValue = sc.nextInt();

		System.out.println("Enter stocks amount to buy stocks");

		int stockAmount = sc.nextInt();

		System.out.println("Enter stock symbol to buy stocks");

		String stockSymbol = sc.next();

		/*
		 * To call out add stocks function
		 */

		buy(stockAmount, stockSymbol, totalStockValue);

		System.out.println("Enter stocks amount to buy stocks");

		int stockAmount2 = sc.nextInt();

		System.out.println("Enter stock symbol to buy stocks");

		String stockSymbol2 = sc.next();

		/*
		 * To call out sell stocks functon
		 */
		sell(stockAmount2, stockSymbol2, totalStockValue);
	}

}
