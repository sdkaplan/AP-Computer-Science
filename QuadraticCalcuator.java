import java.util.Scanner;

/**
 * Created by jimverhaeghe on 10/20/15.
 */
public class QuadraticCalcuator {

    public static void main(String args[]) {

        boolean NotDone = true;
        Scanner inputScanner = new Scanner(System.in);

        while (NotDone) {

            // enter code to get the information for the equation here
            System.out.println("Please enter the three numbers you want to solve for a, b and c of a quadratic equation:");
            System.out.println("(enter all numbers with spaces, or enter quit to stop the program)");

            // if the first input is a string, then make sure it is time to quit
            if (inputScanner.hasNext("quit")) {
                NotDone = false;
                inputScanner.next();
            }
            // otherwise check to see if it is something we can use
            else if (inputScanner.hasNextDouble()) {
                double a = inputScanner.nextDouble();
                double b = inputScanner.nextDouble();
                double c = inputScanner.nextDouble();

                // do quadratic calculation and output possible answers (there are two)
                double x = (-1 * b + Math.sqrt(b^2 - 4 * a * c)) / (2 * a);
                double xx = (-1 * b + Math.sqrt(b^2 - 4 * a * c)) / (2 * a);
                System.out.println("x is equal to " + x + " and " + xx);
            }
            // if it is none of the above, it is probably invalid input
            else {
                inputScanner.next();
            }
        }


        // we should always clean up after ourselves! Close the scanner object
        inputScanner.close();
        System.out.println("Goodbye!");
    }
}
