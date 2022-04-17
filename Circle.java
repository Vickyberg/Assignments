import java.util.Scanner;
 public class Circle{
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
 
	System.out.print("Enter radius of circle:");
	double r = input.nextDouble();

	double pie = 3.14159;

	double diameter = 2 * r;

	double circumference = 2 * pie * r;

	double area = pie * (r * r);

	System.out.printf("%n The diameter is " + diameter);
	System.out.printf("%n The circumference is "+ circumference);
	System.out.printf("%n The area is "+ area);





	}
}