import java.util.Scanner;
 public class Interest{
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance:");
	float balance = input.nextFloat();

	System.out.print("Enter annual Interest rate:");
	float annualInterestRate = input.nextFloat();

	float interest = balance * (annualInterestRate / 1200);

	System.out.printf("The interest is %f", interest);
	}
}