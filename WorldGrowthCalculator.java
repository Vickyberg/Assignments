import java.util.Scanner;
 public class WorldGrowthCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter world population:");
	double population = input.nextDouble();

	System.out.print("Enter world population growth rate:");
	double growthRate = input.nextDouble();

	System.out.print("Enter number of years:");
	double oneYear = input.nextDouble();
	double twoYears = input.nextDouble();
	double threeYears = input.nextDouble();
	double fourYears = input.nextDouble();
	double fiveYears = input.nextDouble();

	double estimatedPopulationOne = population * (growthRate / 100) * oneYear;
	double estimatedPopulationTwo = population * (growthRate / 100) * twoYears;
	double estimatedPopulationThree = population * (growthRate / 100) * threeYears;
	double estimatedPopulationFour = population * (growthRate / 100) * fourYears;
	double estimatedPopulationFive = population * (growthRate / 100) * fiveYears;

	System.out.printf("%n The  estimated world population after one year is " + estimatedPopulationOne); 
	System.out.printf("%n The  estimated world population after two years is " + estimatedPopulationTwo);
	System.out.printf("%n The  estimated world population after three years is " + estimatedPopulationThree);
	System.out.printf("%n The  estimated world population after four years is " + estimatedPopulationFour);
	System.out.printf("%n The  estimated world population after Five years is " + estimatedPopulationFive);
	






	}
}