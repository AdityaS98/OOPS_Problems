package com.logical;

/**
 * Prgram for calculating total balance in the demat account of the user
 */

import java.util.*;

/**
 * 
 * @author DELL
 *
 */

class Shares {

	// Instance variables
	private static String nameOfStock;
	private static int quantityOfStock;
	private static int priceOfStock;

	// Constructor

	public void StockManagenent(String nameOfStock, int quantityOfStock, int priceOfStock) {

		this.nameOfStock = nameOfStock;
		this.quantityOfStock = quantityOfStock;
		this.priceOfStock = priceOfStock;
		/*
		 * Initializing Getters
		 */
	}

	public static String getNameOfStock() {
		return nameOfStock;
	}

	public static int getQuantityOfStock() {
		return quantityOfStock;
	}

	public static int getPriceOfStock() {
		return priceOfStock;
	}
	/*
	 * Method for calculating the total amount
	 */

	public static int toCalculateStock(String nameOfStock, int quantityOfStock, int priceOfStock) {

		return quantityOfStock * priceOfStock;

	}

	public class StockManagenent {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of shares user has brought");

			int totalAmount = 0;
			int numberofShares = sc.nextInt();

			/*
			 * To iterate loop with respect to number of stocks
			 */

			for (int i = 1; i <= numberofShares; i++) {

				System.out.println("Enter the name of the share brought by the user");

				String nameOfShares = sc.next();

				System.out.println("Enter the quantity of shares user has brought");

				int quantityOfShares = sc.nextInt();

				System.out.println("Enter the price of each share brought by the user");

				int priceOfShare = sc.nextInt();

				/*
				 * To create object of Shares using class Shares
				 */

				Shares obj = new Shares();

				Shares(nameOfShares, quantityOfShares, priceOfShare);

				totalAmount = toCalculateStock(getNameOfStock(), getQuantityOfStock(), getPriceOfStock());

			}

			System.out.println("The total balance of the user in demat account is" + totalAmount);

		}

	}

}
