/**
 * Created by Sydney on 10/31/2015.
 */
public class Main {
    public static void main (String [] args)
    {
        Fraction test = new Fraction("6/2");
        Fraction test2 = new Fraction("1/2");
        String added = test.divide(test2);
        System.out.println(added);
    }
}
