import java.util.Scanner;
  public class FeetsToMeters{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print ("value Of Feet:");
	double f = input.nextDouble ();

	double m = 0.305 * f;
	System.out.printf("%f feet is %f meters%n", f, m) ;
  }
}