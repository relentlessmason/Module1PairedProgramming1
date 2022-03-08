package com.techelevator;

import java.util.Scanner;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

$ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //scans for input
		System.out.println("What is your weight on Earth?"); //first query
		String humanWeight = input.nextLine(); //holds the first input

		String[] userInput = humanWeight.split(" "); // creates an array based on the input


		for (int i=0; i<userInput.length; i++){ // goes through array
			int inputNumber = Integer.parseInt(userInput[i]);

			double martianWeight = inputNumber * .378; //the equation to calculate martian weight

			System.out.println("If you weigh " + inputNumber + " lbs on Earth, your weight in Martian is: " + martianWeight + " lbs.");
		}

	}

}
