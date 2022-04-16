import java.util.Scanner;
 public class CostOfDriving{
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
 	
	System.out.print("Enter distance to drive:");
	float distance = input.nextFloat();

	System.out.print("Enter miles per gallon:");
	float miles = input.nextFloat();

	System.out.print("Enter price per gallon:");
	float price = input.nextFloat();

	float cost = distance / price * miles;

	System.out.printf("The cost of driving is $" + cost);



	}
}