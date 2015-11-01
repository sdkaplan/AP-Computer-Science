/**
 * Created by Sydney on 10/31/2015.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(String inputFrac)
    {
        String denominatorString = inputFrac.substring(inputFrac.indexOf("/") + 1, inputFrac.length()); //creates a new substring that contains just the denominator
        int denominator = Integer.parseInt(denominatorString); //changes the substring an int

        if (inputFrac.indexOf("_") != -1) //checks if it is a mixed number
        {
            String wholeNumberString = inputFrac.substring(0, inputFrac.indexOf("_")); //gets string value of the whole number
            int wholeNumber = Integer.parseInt(wholeNumberString); //changes the string into an int
            String numeratorString = inputFrac.substring(inputFrac.indexOf("_") + 1, inputFrac.indexOf("/")); //
            int numerator = Integer.parseInt(numeratorString);
            numerator = numerator + denominator * wholeNumber;
        }
        else
        {
            String numeratorString = inputFrac.substring(0, inputFrac.indexOf("/")); //creates a new substring that contains just the numerator
            int numerator = Integer.parseInt(numeratorString);
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenom()
    {
        return denominator;
    }

    public int getNum()
    {
        return numerator;
    }
/*
    public String add(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        if (denominatorOne != denominatorTwo)
        {
            //find the lowest common multiple of denominatorOne and denominatorTwo = denominatorAnswer
            //denominatorAnswer / denomintatorOne = multiplierOne
            //denominatorAnswer / denominatorTwo = multiplierTwo
            //numeratorOne * multiplierOne = numeratorOne
            //numeratorTwo * multiplierTwo = numeratorTwo
            //numeratorOne + numeratorTwo = numeratorAnswer
        }
        else
        {
            //add numeratorOne and numeratorTwo
            //set equal to numeratorAnswer
        }

        //return numeratorAnswer + “/” + denominatorAnswer
        return "nothing yet";
    }

    public String subtract(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        if (denominatorOne != denominatorTwo)
        {
            //find the lowest common multiple of denominatorOne and denominatorTwo = denominatorAnswer
            //denominatorAnswer / denomintatorOne = multiplierOne
            //denominatorAnswer / denominatorTwo = multiplierTwo
            //numeratorOne * multiplierOne = numeratorOne
            // numeratorTwo * multiplierTwo = numeratorTwo
            //numeratorOne - numeratorTwo = numeratorAnswer
        }
        else
        {
            //subtract numeratorOne and numeratorTwo
            //set equal to numeratorAnswer
        }

        //return numeratorAnswer + “/” + denominatorAnswer
        return "nothing yet";
    }

    public String multiply(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        //multiply numeratorOne and numeratorTwo store in numeratorAnswer
        //multiply denominatorOne and denominatorTwo store in denominatorAnswer
        //return numeratorAnswer + “/” + denominatorAnswer
        return "nothing yet";
    }

    public String divide(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        //multiply numeratorOne and denominatorTwo store in numeratorAnswer
        //multiply denominatorOne and numeratorTwo store in denominatorAnswer
        //return numeratorAnswer + “/” + denominatorAnswer
        return "nothing yet";
    }

    public String reduce()
    {
        return "nothing yet";
    }
*/
}
