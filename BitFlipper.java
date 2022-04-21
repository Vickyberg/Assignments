import java.util.Scanner;

public class BitFlipper {
       public static void main( String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 0 or 1:");
        int userInput = input.nextInt();


        if (userInput == 1){
            System.out.println( "0");
        }
        if (userInput == 0){
            System.out.println("1");
        }
        

    }
}
