import java.util.Scanner;
 public class ComparingIntegers{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter firstInteger:");
	int firstNumber = input.nextInt();

	System.out.print("Enter secondInteger:");
	int secondNumber = input.nextInt();

	int square = firstNumber * firstNumber;

	if( firstNumber * firstNumber > secondNumber){
	System.out.printf("%d > %d%n", square, secondNumber);

	}
	
	if ( firstNumber * firstNumber == secondNumber){
	System.out.printf("%d == %d%n", square, secondNumber);
	
 	}
	
	if ( firstNumber * firstNumber != secondNumber){
	System.out.printf("%d != %d%n", square, secondNumber);
	
	}

	if ( firstNumber * firstNumber < secondNumber){
	System.out.printf("%d < %d%n", square, secondNumber);
	
	}	
	
	}
}