import java.util.Scanner;

// CryptographyMain.java--An activity with casts and modulus
public class CryptographyMain
{
    public static void main (String [] args)
    {
        //String encryptedCode = "the cat in the hat!";
        String encryptedCode = "Lbhe Ghea--Nccyvrq\n" +
                "\n" +
                "\n" +
                "Rkpryyrag wbo. Fhozvg lbhe Pelcgbtencul pynff ivn Cvnmmn, nybat jvgu gur frperg xrlcuenfr, \"zbqhyhf cbjre!\" \n" +
                "Sbe rkgenf, pbaireg lbhe ebgngvba zrgubq gb gnxr va n ahzore, juvpu vf ubj zhpu gb ebgngr gur yrggref ol. Hfr guvf gb harapelcg gur zrffntr orybj. Lbh znl jnag gb jenc gur rkvfgvat ybbc vagb nabgure ybbc, fb vg jvyy gel nyy 26 cbffvovyvgvrf sbe lbh. \n" +
                "\n" +
                "Aiix div! Siol zchuf yrnlu cm ni gixczs nby guch wfumm mi cn wuh ohyhwlsjn nby ufjbuhogylcw wixy ch nby zclmn juln iz nbcm uwncpcns. Sio’ff hyyx ni gixczs nby qbcfy fiij, uhx omy Mwuhhyl ih nby Mnlcha xclywnfs(wbywe ion nby yrugjfym). Nbcm qcff vy pyls byfjzof zil nby jlidywn. ";   // Try this to test out your code too.

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
