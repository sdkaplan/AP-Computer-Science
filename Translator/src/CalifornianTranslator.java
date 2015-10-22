/**
 * Created by bal_Sdkaplan on 10/12/2015.
 */
public class CalifornianTranslator {
    private String like;

    public CalifornianTranslator(String text){
        this.like = text;
    }
    public String translate(String words){
        words = words.replaceAll("is", "is" + like);
        words = words.replaceAll("are", "are" + like);
        return(words);
    }
}
