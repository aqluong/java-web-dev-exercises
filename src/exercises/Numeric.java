package exercises;
import java.util.Scanner;
public class Numeric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        int numMiles = input.nextInt();

        System.out.println("How much gas did you use? (in gallons)");
        int numGallons = input.nextInt();

        int mpg = numMiles/numGallons;
        System.out.println("You are running on " + mpg + " mpg.");
    }
}
