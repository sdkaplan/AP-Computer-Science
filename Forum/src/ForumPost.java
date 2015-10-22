import java.util.Scanner;

/**
 * Created by bal_Sdkaplan on 10/5/2015.
 */

public class ForumPost {
    private int totalViews;
    private Text theTitle;
    private Text theAuthor;
    private Text theBody;
    private Text theViews;

    private String title;
    private String author;
    private String body;

    private String isGoodNote1;
    private String myPost;

    public ForumPost(String title, String author, String body){
        this.title = title;
        this.author = author;
        this.body = body;
        this.totalViews = 0;
    }
    /**
     * Allows user to create a new forum post by asking for the title, author, and text. Sets the total views to 0.
     * */
    public void draw() {
        /*this.totalViews = 0; //Sets number of views to 0
        System.out.println("What is the title of your forum post?");
        String title = info.nextLine();

        System.out.println("Who is the author of your forum post?");
        String author = info.nextLine();

        System.out.println("Please write your post here.");
        String body = info.nextLine();
        */
        this.totalViews += 1;
        this.theTitle = new Text(100, 0, title);
        this.theAuthor = new Text(100, 20, "By " + author);
        this.theBody = new Text(0, 80, " " + body);
        this.theViews = new Text(0, 40, " Views: " + totalViews);

        theTitle.draw();
        theAuthor.draw();
        theBody.draw();
        theViews.draw();
    }

    /**
     * Increments the number of times a post has been viewed and draws the post with the updated views. Asks the reader
     * if they liked the forum post.
     * */
    public void viewPost() {
        theTitle.draw();
        theAuthor.draw();
        theBody.draw();
        theViews.draw();
        this.totalViews += 1;
        Scanner info = new Scanner(System.in);
        System.out.println("Did you like this forum post? Please type YES or NO.");
        this.isGoodNote1 = info.nextLine();
    }

    /** Add a "public String toString()" method that will print out a string of your choosing
     Use System.out.println() with your object as the argument before and after you add this method
     Do you notice the difference - write your observations in the comments when you submit the assignment
     */
    public String toString(){

        return (theTitle + "\n" );
    }
    //The original toString would return a string such as this: ForumPost@89dd
    //When I added my toString function in I was able to manipulate it so it would return the title, it
    //would look like this : Text[x=100,y=0,message=title]


    /**
     * Draws whether a post has been marked as good at the bottom of the post.
     * */
    public void goodNote(){
        Text isGoodNote = new Text(0, 120, "Has this note been marked as good? " + isGoodNote1);
        isGoodNote.draw();
    }

}
