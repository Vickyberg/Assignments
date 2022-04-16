import java.util.Scanner;
 public class ArithmeticTwo{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("enter firstNumber:");
	int firstNumber = input.nextInt();

	System.out.print("enter secondNumber:");
	int secondNumber = input.nextInt();
	
	System.out.print("enter thirdNumber:");
	int thirdNumber = input.nextInt();

	int sum = firstNumber + secondNumber + thirdNumber;

	int average = (firstNumber + secondNumber + thirdNumber) / 3;

	int product =  firstNumber * secondNumber * thirdNumber;

	if (firstNumber > secondNumber && firstNumber > thirdNumber)
	System.out.printf("The highest number is %d%n" , firstNumber);

	if (secondNumber > firstNumber &&  secondNumber > thirdNumber)
	System.out.printf("The highest number is %d%n", secondNumber);

	
	if (thirdNumber > firstNumber && thirdNumber > secondNumber)
	System.out.printf("The highest number is %d%n", thirdNumber);

	if (firstNumber < secondNumber && firstNumber < thirdNumber)
	System.out.printf("The lowest number is %d%n" , firstNumber);

	if (secondNumber < firstNumber &&  secondNumber < thirdNumber)
	System.out.printf("The lowest number is %d%n", secondNumber);

	if (thirdNumber < firstNumber && thirdNumber < secondNumber)
	System.out.printf("The lowest number is %d%n", thirdNumber);
	

	System.out.printf("The sum is %d%n", sum);
	System.out.printf("The average is %d%n", average);
	System.out.printf("The product is %d%n", product);

	}

}