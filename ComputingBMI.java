import java.util.Scanner;
 public class ComputingBMI{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds:");
	double w = input.nextDouble();

	double weightInKilograms = w * 0.45359237;
	
	System.out.print("Enter height in inches:");
	double h = input.nextDouble();

	double heightInMeters = h * 0.0254;

	double BMI = weightInKilograms / (heightInMeters * heightInMeters);

	System.out.printf(" BMI is " + BMI);
	
	}
}