import java.util.regex.Matcher;

/**
 * Created by bal_Sdkaplan on 10/12/2015.
 */

public class CanadianTranslator {
    private String eh;

    public CanadianTranslator(String text){
        this.eh = text;
    }
    public String translate(String words){
        if (words.endsWith("?")){
            words = words.replace("?", eh + "?");
        }
        else if(words.endsWith(".")){
            words = words.replace(".", eh + ".");
        }
        else{
            words += eh;
        }
        return(words.replaceAll("about", "aboot"));
    }
}
