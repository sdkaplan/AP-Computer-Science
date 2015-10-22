/**
 * Created by bal_Sdkaplan on 9/29/2015.
 */
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        for(int x = 0; x < 3; x++) {
            Double mathNumbers = Math.random();
            mathNumbers = mathNumbers * 50;
            System.out.println(Math.round(mathNumbers));
        }

        for(int x = 0; x < 3; x++) {
            Random numbers = new Random();
            System.out.println(numbers.nextInt(50));
        }
        
    }
}
