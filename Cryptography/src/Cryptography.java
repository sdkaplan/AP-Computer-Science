public class Cryptography
{
    private int rotations = 13;  // used in the second part

    public Cryptography()
    {
        // no need to put anything here for now.
    }

    public int convertToNumbers(char letter)
    {
        // fill in this method!
        int letterInt = (int)(letter);
        int letter123 = letterInt - 64;
        return letter123;
    }

    // create a similar method for the ROT13 portion.
    // This method will return a character instead.
    public char rotate13(char letter)
    {
        // fill in this method!
        int letterInt = (int)(letter);
        int letter123 = letterInt - 65;
        int letterNext = letter123 + 13;
        int letter13 = letterNext % 26 +1;
        int newNumber = letter13 + 64;
        char newLetter = (char)(newNumber);
        return newLetter;
    }
}
