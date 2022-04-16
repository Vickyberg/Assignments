import java.util.Scanner;
 public class FutureInvestment{
	public static void  main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amt:");
	double investmentAmount = input.nextDouble();

	System.out.print("Enter annual interest rate:");
	double monthlyInterestRate = input.nextDouble();

	monthlyInterestRate /= 1200;

	System.out.print("Enter number of years:");
	double numberOfYears = input.nextDouble();

double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

	System.out.printf("Accumulated value is $" + futureInvestmentValue);

	
	}
}