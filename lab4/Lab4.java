package lab4;

//Darby O'Rear 7/18/18

import java.util.Scanner;

public class Lab4 {
	
public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
	
	String userContinue="";
	
	//Put everything inside a do-while loop
	do {
	
	//Ask user to enter a number and accept input.
	System.out.println("Please enter a number: ");
	int userInput = scnr.nextInt();
	
	//Use a for loop to print a number, its square, and its cube on one line.
	//Do that for each number from 1 to user input.
		for(int i = 1; i <= userInput; i++) {
			//First, print user input + a tab.
			System.out.print(i + "\t");
			//Square the number and print.
			int userSquared = (int) Math.pow(i, 2);
			System.out.print(userSquared + "\t");
			//Cube the number and print.
			int userCubed = (int) Math.pow(i, 3);
			System.out.println(userCubed + "\t");
		}
	//Ask user if they want to enter another number. If so, do-while loop should repeat until user enters something other than "y."
	System.out.println("Would you like to enter another number? (y/n) ");
	userContinue = scnr.next();
	} while (userContinue.equals("y"));
	
	scnr.close();
	
	//When user does not enter "y", do-while loop is done running. Print statement that thanks the user for playing. 
	System.out.println("Thanks for playing!");
}
}

