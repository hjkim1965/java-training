package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's createa a variable to define our career
		
		// Declare a variable for career
		String career;
		System.out.print("Program is starting...\n");
		
		career= "Software Developer";
		System.out.print("My career : " + career + ".\n");
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.print("My salaray as a " + career + "at the rate of $"+ rate + "is $" + salary + "per year.\n");
		
		System.out.print("Program is ending...\n");
	}
}
