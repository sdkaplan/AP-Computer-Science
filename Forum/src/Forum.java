/**
 * Created by bal_Sdkaplan on 10/5/2015.
 */
public class Forum {
    public static void main(String[] args) {
        ForumPost test = new ForumPost("Title", "Author", "This is the body of the post.");
        test.draw();
        test.viewPost();
        test.goodNote();
        System.out.println(test);
    }

}
