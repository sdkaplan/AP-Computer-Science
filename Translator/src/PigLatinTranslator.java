/**
 * Created by bal_sdkaplan on 10/13/2015.
 */
import java.util.Scanner;

public class PigLatinTranslator {
    //private String text;
    private Scanner space;
    //Scanner space = new Scanner(text);

    public PigLatinTranslator(){
        //this.text = text;
        //Scanner space = new Scanner(text);
    }
    //can use indexof in the string method in java docs
    //Make the scanner look for spaces in the text
    public String translate(String words){
        Scanner space = new Scanner(words);
        space.next(" ");

        if (words.startsWith("a")) {
        }
        else if (words.startsWith("e")) {
        }
        else if (words.startsWith("i")) {
        }
        else if (words.startsWith("o")) {
        }
        else if (words.startsWith("u")) {
        }
        else{
        }
        return space.next(" ");
    }

    //public startsWithVowel
}
