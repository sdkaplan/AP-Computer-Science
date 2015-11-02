/**
 * Created by Sydney on 10/31/2015.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(String inputFrac)
    {
        //this didn't fix my problem of whole numbers being entered :,-(
        if (inputFrac.indexOf("/") != -1) //if the fraction is not a whole number
        {
            String denominatorString = inputFrac.substring(inputFrac.indexOf("/") + 1, inputFrac.length()); //creates a new substring that contains just the denominator
            int denominator = Integer.parseInt(denominatorString); //changes the substring an int
            this.denominator = denominator;
        }
        else //the fraction is a whole number
        {
            int denominator = 1;
            this.denominator = denominator;
        }

        if (inputFrac.indexOf("_") != -1) //checks if it is a mixed number
        {
            String wholeNumberString = inputFrac.substring(0, inputFrac.indexOf("_")); //gets string value of the whole number, including the negative value
            int wholeNumber = Integer.parseInt(wholeNumberString); //changes the string into an int
            String numeratorString = inputFrac.substring(inputFrac.indexOf("_") + 1, inputFrac.indexOf("/")); //gets the string value of the numerator
            int numerator = Integer.parseInt(numeratorString); //changes the string into an int

            if (wholeNumber < 0) //checks to see if whole number is negative
            {
                numerator = denominator * wholeNumber - numerator;
                this.numerator = numerator;
            }
            else //if whole number is positive
            {
                numerator = denominator * wholeNumber + numerator;
                this.numerator = numerator;
            }

        }
        else
        {
            String numeratorString = inputFrac.substring(0, inputFrac.indexOf("/")); //creates a new substring that contains just the numerator
            int numerator = Integer.parseInt(numeratorString);
            this.numerator = numerator;
        }
    }

    public int getDenom()
    {
        return denominator;
    }

    public int getNum()
    {
        return numerator;
    }

    public String add(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        if (denominatorOne != denominatorTwo)
        {
            //converts the fractions to have the same denominator
            int numeratorOneNew = numeratorOne * denominatorTwo;
            int numeratorTwoNew = numeratorTwo * denominatorOne;
            int numeratorAnswer = numeratorOneNew + numeratorTwoNew; //performs the addition operation
            int denominatorAnswer = denominatorOne * denominatorTwo;
            return reduce(numeratorAnswer, denominatorAnswer);
            //return numeratorAnswer + "/" + denominatorAnswer;
        }
        else
        {


            int numeratorAnswer = numeratorOne + numeratorTwo; //adds the two numerators together
            return reduce(numeratorAnswer, denominator);
            //return numeratorAnswer + "/" + denominator;
        }
    }

    public String subtract(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        if (denominatorOne != denominatorTwo)
        {
            //converts the fractions to have the same denominator
            int numeratorOneNew = numeratorOne * denominatorTwo;
            int numeratorTwoNew = numeratorTwo * denominatorOne;
            int numeratorAnswer = numeratorOneNew - numeratorTwoNew; //performing subtraction operation
            int denominatorAnswer = denominatorOne * denominatorTwo;

            return reduce(numeratorAnswer, denominatorAnswer);
            //return numeratorAnswer + "/" + denominatorAnswer;
        }
        else
        {
            int numeratorAnswer = numeratorOne - numeratorTwo; //adds the two numerators together

            return reduce(numeratorAnswer, denominator);
            //return numeratorAnswer + "/" + denominator;
        }
    }

    public String multiply(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        int numeratorAnswer = numeratorOne * numeratorTwo; //multiplies the numerators
        int denominatorAnswer = denominatorOne * denominatorTwo; //multiplies the denominators

        return reduce(numeratorAnswer, denominatorAnswer);
        //return numeratorAnswer + "/" + denominatorAnswer;
    }
    public String divide(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        int numeratorAnswer = numeratorOne * denominatorTwo; //multiply numeratorOne and denominatorTwo
        int denominatorAnswer = denominatorOne * numeratorTwo; //multiply denominatorOne and numeratorTwo

        return reduce(numeratorAnswer, denominatorAnswer);
        //return numeratorAnswer + "/" + denominatorAnswer;
    }

    public String reduce(int numerator, int denominator)
    {
        for (int i = 1000; i >= 2; i --) //i should be 2147483647 (????)
        {
            if ((numerator % i == 0) && (denominator % i == 0))
            {
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
        if (Math.abs(numerator) >= denominator)
        {
            int wholeNumber = numerator / denominator; //gets the whole number associated with the improper fraction
            int numeratorNew = numerator % denominator; //gets the new numerator once once the whole number is removed

            if (numeratorNew == 0) //if the fraction represents a whole number
            {
                return Integer.toString(wholeNumber); //return just the whole number
            }
            else if (numeratorNew < 0) //if the fraction is negative
            {
                return wholeNumber + "_" + Math.abs(numeratorNew) + "/" + denominator;
                //return the entire mixed fraction, and only include one negative sign
            }
            else
            {
                return wholeNumber + "_" + numeratorNew + "/" + denominator; //return the entire mixed fraction
            }
        }
        if (numerator == 0)
        {
            return Integer.toString(0);
        }
        return numerator + "/" + denominator;
    }
}
