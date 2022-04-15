import java.util.Scanner;
	public class ConversionMinutesToYears{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("number of minutes:");
	int m =input.nextInt();

	
	int years = m / 525_600;

	int days = m % 525_600 / 1440; 	
	System.out.printf("%d minutes is approximately %d years And %d days", m, years, days);	

	}

}