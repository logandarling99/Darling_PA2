package darling_p2;

import java.util.Scanner;

public class BMICalc {
	public static void main(String args[]) {
		int numberSystem;
		double bmi = -1, weight, height;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Press 1 for metric or press 2 for standard U.S. units: ");
		numberSystem = scnr.nextInt();
		
		if(numberSystem == 2) {
			
			System.out.print("Type in your weight in pounds: ");
			weight = scnr.nextDouble();
			System.out.print("Type in your height in inches: ");
			height = scnr.nextDouble();
			
			bmi = (703*weight)/(height*height);
			System.out.println("Your BMI is " + bmi + " in lbs/in2");
		}
		else if(numberSystem == 1) {
			
			System.out.print("Type in your weight in kilograms: ");
			weight = scnr.nextDouble();
			System.out.print("Type in your height in meters: ");
			height = scnr.nextDouble();
			
			bmi = (weight)/(height*height);
			System.out.println("Your BMI is " + bmi + " in kgs/m2");
		}
		else {
			System.out.print("You did not type a valid option.");
			System.exit(0);
		}
		
		System.out.println("The BMI Categories are: ");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = 30 or greater");

	}
}
