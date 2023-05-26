//Name: Necati
//Surname: Koçak
//Student ID: 150120053

//Problem: Write a program that will calculate the compound monthly interest.

//Step 1: The user is prompted for initial principal, annual interest rate percentage and number of time periods in months.
//Step 2: To find the monthly interest rate percentage, we divide the annual interest rate percentage by 12. 
//Step 3: To find the total compound interest amount, we subtract the initial principal from the final balance amount.
/*Step 4: To find the final balance amount, we divide the annual interest rate percentage by 1200, add one and square it. 
Multiply the result by the initial principal.*/
//Step 5: We display the results.

import java.util.Scanner; //Scanner is in the java.util package

public class HW1_150120053_P3 {

	public static void main(String[] args) {
		System.out.println("Welcome to The Compound Monthly Interest Calculator.");
		
		System.out.println("Enter the desired values below and see the results");
		
		//We create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter initial principal amount in USD: ");
		
		double inpriamount = input.nextDouble(); // The variable  inpriamount is the name of the initial principal amount in USD.
		
		System.out.print("Enter annual interest rate (e.g. 9.45): ");		
		
		double annintrate = input.nextDouble(); // The variable  annintrate is the name of the annual interest rate.
		
		System.out.print("Enter number of time periods in months: ");
		
		double notpim = input.nextDouble(); // The variable  notpim is the name of the number of time periods in months.
		
		double monthinrate = annintrate/12; // The variable  monthinrate is the name of the monthly interest rate percentage. We mentioned ​the process in step 2.
				
		double exponent = Math.pow(1+annintrate/1200, notpim); // We use this to square. 
			
		double finalbalamount = inpriamount * exponent; // The variable  finalbalamount is the name of the final balance amount. We mentioned ​the process in step 4.	
			
		double totalcominamount = (finalbalamount - inpriamount); // The variable  totalcominamount is the name of the total compound interest amount. We mentioned ​the process in step 3.
			
		totalcominamount = (int)(totalcominamount*100)/100.0; // We did this because we wanted to have two digits after the point.
			
		finalbalamount = (int)(finalbalamount*100)/100.0; // We did this because we wanted to have two digits after the point.
		
		monthinrate = (int)(monthinrate*100)/100.0; // We did this because we wanted to have two digits after the point.
		
			
		// Display results
		System.out.println("Initial principal amount: "+ inpriamount);
		
		System.out.println("Monthly interest rate: "+ monthinrate);
		
		System.out.println("Total compound interest amount: "+ totalcominamount);
		
		System.out.println("Final balance amount: "+ finalbalamount);
		
	}

}


