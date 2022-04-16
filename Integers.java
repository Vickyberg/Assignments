import java.util.Scanner;
 public class Integers{
	public static void main(String[] args){
 	 Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer:");
	int numOne = input.nextInt();

	System.out.print("Enter second integer:");
	int numTwo = input.nextInt();

	System.out.print("Enter third integer:");
	int numThree = input.nextInt();

	System.out.print("Enter fourth integer:");
	int numFour = input.nextInt();

	System.out.print("Enter fifth integer:");
	int numFive = input.nextInt();

	if (numOne > numTwo && numOne > numThree && numOne > numFour && numOne > numFive)
	System.out.printf("The highest integer is %d%n",numOne);

	if (numTwo > numOne && numTwo > numThree && numTwo > numFour && numTwo > numFive)
	System.out.printf("The highest integer is %d%n",numTwo);

	if (numThree > numTwo && numThree > numOne && numThree > numFour && numThree > numFive)
	System.out.printf("The highest integer is %d%n",numThree);	

	if (numFour > numTwo && numFour > numThree && numFour > numOne && numFour > numFive)
	System.out.printf("The highest integer is %d%n",numFour);

	if (numFive > numTwo && numFive > numThree && numFive > numFour && numFive > numOne)
	System.out.printf("The highest integer is %d%n",numFive);

	if (numOne < numTwo && numOne < numThree && numOne < numFour && numOne < numFive)
	System.out.printf("The lowest integer is %d%n",numOne);

	if (numTwo < numOne && numTwo < numThree && numTwo < numFour && numTwo < numFive)
	System.out.printf("The lowest integer is %d%n",numTwo);

	if (numThree < numTwo && numThree < numOne && numThree < numFour && numThree < numFive)
	System.out.printf("The lowest integer is %d%n",numThree);

	if (numFour < numTwo && numFour < numThree && numFour < numOne && numFour < numFive)
	System.out.printf("The lowest integer is %d%n",numFour);

	if (numFive < numTwo && numFive < numThree && numFive < numFour && numFive < numOne)
	System.out.printf("The lowest integer is %d%n",numFive);




	}
}