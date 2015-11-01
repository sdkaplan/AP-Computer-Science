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
            String numeratorString = inputFrac.substring(inputFrac.indexOf("_") + 1, inputFrac.indexOf("/")); //gets the string value of the numerator
            int numerator = Integer.parseInt(numeratorString); //changes the string into an int
            numerator = numerator + denominator * wholeNumber;
            this.numerator = numerator;
        }
        else
        {
            String numeratorString = inputFrac.substring(0, inputFrac.indexOf("/")); //creates a new substring that contains just the numerator
            int numerator = Integer.parseInt(numeratorString);
            this.numerator = numerator;
        }
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
            return "nothing yet";
        }
        else
        {
            int numeratorAnswer = numeratorOne + numeratorTwo; //adds the two numerators together
            String numeratorAnswerString = Integer.toString(numeratorAnswer); //changes the numerator to a string
            String denominatorAnswerString = Integer.toString(denominatorOne); //changes the denominator to a string
            String fracAnswer = numeratorAnswerString + denominatorAnswerString; //combines the numerator and denominator into one string
            //NEED TO DO: add in a / between the numerator and denominator
            return fracAnswer;
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
            //find the lowest common multiple of denominatorOne and denominatorTwo = denominatorAnswer
            int multiplierOne = denominatorAnswer / denominatorOne;
            int multiplierTwo = denominatorAnswer / denominatorTwo;
            numeratorOne = numeratorOne * multiplierOne;
            numeratorOne = numeratorTwo * multiplierTwo;
            int numeratorAnswer = numeratorOne - numeratorTwo;

            String numeratorAnswerString = Integer.toString(numeratorAnswer); //changes the numerator to a string
            String denominatorAnswerString = Integer.toString(denominatorAnswer); //changes the denominator to a string
            String fracAnswer = numeratorAnswerString + denominatorAnswerString; //combines the numerator and denominator into one string
            //NEED TO DO: add in a / between the numerator and denominator
            return fracAnswer;

            //return "nothing yet";
        }
        else
        {
            int numeratorAnswer = numeratorOne - numeratorTwo; //adds the two numerators together
            String numeratorAnswerString = Integer.toString(numeratorAnswer); //changes the numerator to a string
            String denominatorAnswerString = Integer.toString(denominatorOne); //changes the denominator to a string
            String fracAnswer = numeratorAnswerString + denominatorAnswerString; //combines the numerator and denominator into one string
            //NEED TO DO: add in a / between the numerator and denominator
            return fracAnswer;
        }

        //return numeratorAnswer + “/” + denominatorAnswer
    }

    public String multiply(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        int numeratorAnswer = numeratorOne * numeratorTwo; //multiplies the numerators
        int denominatorAnswer = denominatorOne * denominatorTwo; //multiplies the denominators

        String numeratorAnswerString = Integer.toString(numeratorAnswer); //changes the numerator to a string
        String denominatorAnswerString = Integer.toString(denominatorAnswer); //changes the denominator to a string
        String fracAnswer = numeratorAnswerString + denominatorAnswerString; //combines the numerator and denominator into one string
        //NEED TO DO: add in a / between the numerator and denominator

        return fracAnswer;
    }
    public String divide(Fraction theFraction)
    {
        int numeratorOne = this.numerator;
        int denominatorOne = this.denominator;

        int numeratorTwo = theFraction.getNum();
        int denominatorTwo = theFraction.getDenom();

        int numeratorAnswer = numeratorOne * denominatorTwo; //multiply numeratorOne and denominatorTwo
        int denominatorAnswer = denominatorOne * numeratorTwo; //multiply denominatorOne and numeratorTwo

        String numeratorAnswerString = Integer.toString(numeratorAnswer); //changes the numerator to a string
        String denominatorAnswerString = Integer.toString(denominatorAnswer); //changes the denominator to a string
        String fracAnswer = numeratorAnswerString + denominatorAnswerString; //combines the numerator and denominator into one string
        //NEED TO DO: add in a / between the numerator and denominator

        return fracAnswer;
    }
/*
    public String reduce()
    {
        return "nothing yet";
    }
*/
}
