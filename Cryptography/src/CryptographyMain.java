import java.util.Scanner;

// CryptographyMain.java--An activity with casts and modulus
public class CryptographyMain
{
    public static void main (String [] args)
    {
        //String encryptedCode = "the cat in the hat!";
        String encryptedCode = "abcdefghijklmnopqrstuvwxyz";   // Try this to test out your code too.

        encryptedCode = encryptedCode.toUpperCase(); // only deal with uppercased letters.
        Cryptography cryptoTool = new Cryptography();

        char thisChar = 'A';
        System.out.println( (int) thisChar );

        // Most of this below you may treat as magic for now.
        // Basically it just calls your conversion method, but it converts uppercase to lowercase first, and doesn't convert punctuation.
        int currentIndex = 0;
        while(currentIndex < encryptedCode.length())
        {
            char letter = encryptedCode.charAt(currentIndex);

            if ((letter >= 'A') && (letter <= 'Z'))
            {
                System.out.print(cryptoTool.rotate13(letter) + " ");     //<--this calls your code.  Adds a space between each number.
                // System.out.print(cryptoTool.applyRotation(letter));     //<--comment the above and uncomment the second part.
            }
            else
            {
                System.out.print(letter);  // if it's punctuation, just print it out.
            }

            currentIndex = currentIndex + 1;
        }
    }
}
