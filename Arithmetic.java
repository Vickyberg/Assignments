import java.util.Scanner;
 public class Arithmetic{
	public static void main(String[] args){
	
	Scanner input = new Scanner( System.in);
	
	System.out.print("Insert first Number:");
	int firstNumber = input.nextInt();

	System.out.print("Insert second Number:");
	int secondNumber = input.nextInt();

	int sum = (firstNumber * firstNumber) + (secondNumber * secondNumber);

	int difference = (firstNumber * firstNumber) - (secondNumber * secondNumber); 

	System.out.printf("The sum is %d%n",sum);
	System.out.printf("The difference is %d%n",difference);

	}
}