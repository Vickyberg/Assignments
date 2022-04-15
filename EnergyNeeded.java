import java.util.Scanner;
public class EnergyNeeded{
	public static void main(String[] args){
	Scanner input= new Scanner (System. in) ;

	System.out.println("Enter amount of water") ;
	float M = input.nextFloat();

	System.out.println("Enter initial temperature");
	float initialTemperature = input.nextFloat() ;

 	System.out.println("Enter final temperature");
	float finalTemperature = input.nextFloat() ;

	float Q = M * (finalTemperature-  initialTemperature) * 4184;

	System.out.printf("The energy needed is %f%n", Q);
	}
}