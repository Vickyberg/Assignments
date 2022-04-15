import java.util.Scanner;
public class Calculator{
	
	public static void main(String[] args){
		Scanner input  = new Scanner( System.in);
		System.out.print("enter first number:");
		int firstNumber = input.nextInt();

		System.out.print("enter second number:");
		int secondNumber = input.nextInt();
		
		int sum = firstNumber + secondNumber ;

		int product = firstNumber * secondNumber;

		int difference = firstNumber - secondNumber;
	
	System.out.printf("The Sum is %d%n",sum);
	System.out.printf("The Product is %d%n",product);
	System.out.printf("The Difference is %d%n", difference);
	}
	
}