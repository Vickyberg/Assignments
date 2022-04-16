import java.util.Scanner;
 public class CompoundValue{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("enter monthly saving amount:");
	double savingAmount = input.nextDouble();

	double monthlyInterestRate = 0.00417;

	double firstMonth = savingAmount * (1 + monthlyInterestRate);

	double secondMonth = (savingAmount + firstMonth) *  (1 + monthlyInterestRate);

	double thirdMonth = (savingAmount + secondMonth) * (1 + monthlyInterestRate);

	double fourthMonth = (savingAmount + thirdMonth) * (1 + monthlyInterestRate);

	double fifthMonth = (savingAmount + fourthMonth) * (1 + monthlyInterestRate);

	double sixthMonth = (savingAmount + fifthMonth) * (1 + monthlyInterestRate);

	System.out.printf("After the sixth month, the account value is $" + sixthMonth);




	}
}