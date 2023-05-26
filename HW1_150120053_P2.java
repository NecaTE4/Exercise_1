//Name: Necati
//Surname: Koçak
//Student ID: 150120053

//Problem: Write a program that converts a date that is given in days to “Year: <years>, Mount: <mounts>, Day: <days>” format.

//Step 1: The user is prompted for the total number of days.
//Step 2: Dividing the total number of days by 365 gives the year, dividing the remainder by 31 gives the month, and the remainder gives us the day.
//Step 3: We display the results.


import java.util.Scanner; //Scanner is in the java.util package

public class HW1_150120053_P2 {

	public static void main(String[] args) {
		

		System.out.print("Welcome to Date Calculator.");
		System.out.println(" You can calculate how many years, how many months and how many days from the number of days.");
		
		//We create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total number of days: ");
			int totdays = input.nextInt(); //The variable  totdays is the name of the total number of days.
		
		// We did the steps we described in step 2. 	
		int years = (totdays/365); // year is equal to the year resulting from the transaction.
		
		int months = (totdays%365)/31; // months is equal to the year resulting from the transaction.
		
		int days = (totdays%365)%31; // days is equal to the year resulting from the transaction.
		
		// Display results
		System.out.println("Year: "+ years);
		
		System.out.println("Month: "+ months);
		
		System.out.println("Day: "+ days);
			
	}

}
