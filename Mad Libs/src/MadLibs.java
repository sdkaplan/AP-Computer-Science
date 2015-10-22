/**
 * Created by bal_Sdkaplan on 9/30/2015.
 */
import java.util.Scanner;

public class MadLibs {
        public static void main(String[] args)
        {
            Scanner ml = new Scanner(System.in); //creates a scanner that will take input from the user

            System.out.println("Please type in a living thing. ");
            String wordOne = ml.next(); //Takes input word from user, stores in wordOne
            System.out.println("Please type in a adjective. ");
            String wordTwo = ml.next(); //Takes input word from user, stores in wordTwo
            System.out.println("Please type in a funny sound. ");
            String wordThree = ml.next(); //Takes input word from user, stores in wordThree

            System.out.print("There once was a ");
            System.out.print(wordOne); //Prints the word inputted to wordOne
            System.out.print(" who lived in a very ");
            System.out.print(wordTwo); //Prints the word inputted to wordTwo
            System.out.print(" city. Its name was ");
            System.out.print(wordThree); //Prints the word inputted to wordThree
            System.out.print(".");

        }
}
