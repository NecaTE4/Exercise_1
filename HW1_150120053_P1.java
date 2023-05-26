//Name: Necati
//Surname: Koçak
//Student ID: 150120053

/*Problem:Write a program that prompts the user to enter the distance to drive, the fuel 
efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.*/

//Step 1: The user is prompted to enter data on total distance traveled, distance traveled per gallon in miles, and price per gallon.
//Step 2: We multiply the total distance traveled by the price per gallon and divide by the distance traveled per gallon.
//Step 3: We display the results.

import java.util.Scanner; //Scanner is in the java.util package

public class HW1_150120053_P1 {
	
	public static void main(String[] args) {
		

		
		System.out.println("Welcome to Travel Calculator. You can calculate money of your travel distance. ");
	//We create a Scanner object	
	Scanner input = new Scanner(System.in);
	
	//Prompt the user to enter travel distance in miles	
	System.out.print("Please enter the your travel distance in miles: ");
		
		double trvldis = input.nextDouble(); // The variable trvldis is the name of the your travel distance in miles.
		
	//Prompt the user to enter the distance in miles your car travels per gallon
	System.out.print("Enter the distance in miles your car travels per gallon: ");
		
		double milespergal = input.nextDouble(); // The variable  milespergal is the name of the distance travels per gallon
		
	//Prompt the user to enter the price per gallon	
	System.out.print("Enter the price per gallon: ");	
		
		double pricepergal = input.nextDouble(); // The variable  pricepergal is the name of the price per gallon.
		
	double moneyoftrvl = (trvldis * pricepergal)/ milespergal; // The variable moneyoftrvl is the name of the cost of the trip. We explained the process in step 2
	
		moneyoftrvl = (int)(moneyoftrvl * 100)/100.0; // We did this because we wanted to have two digits after the point.
	
	// Display results
	System.out.print("The distance cost of your amazing travel is " + moneyoftrvl + " $");
	}

}
