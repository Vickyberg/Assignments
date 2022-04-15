import java.util.Scanner;
 public class PoundsToKilograms{
	 public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Number of pounds:");
	double p = input.nextDouble();

	double kilograms = p * 0.454;
	
	System.out.printf("%f pounds is %f kilograms", p, kilograms);

	}

}