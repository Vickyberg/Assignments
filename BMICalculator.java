import java.util.Scanner;
 public class BMICalculator{
  	public static void main(String[] arg){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds:");
	double weightInPounds = input.nextDouble();

	System.out.print("Enter height in inches:");
	double heightInInches = input.nextDouble();

	double BMI =  weightInPounds * 703 / (heightInInches * heightInInches);

	System.out.printf("The body mass index is " + BMI);

	}
}