package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter bill amount: ");
		String billAmount = input.nextLine();
		double numberAmount = Double.parseDouble(billAmount);

		System.out.println("Please enter the amount tendered: ");
		String amountTendered = input.nextLine();
		double numberTendered = Double.parseDouble(amountTendered);
		double total = numberTendered - numberAmount;

		System.out.println("Your change back is $" + total +".");

	}

}
