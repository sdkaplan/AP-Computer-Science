/**
 * Created by katemaroney on 8/25/15.
 */

/**
 * Not sure how far/complicated you want to make this, but we can highlight the idea of an interface/inheritance here, depending on how complex we can go
 * Start with a blank class, add the "implements Critter" part, and highlight how it requires certain methods.
 * The way I have done it in the past is that I have Rover already implemented, and I walk the class through Flytrap.
 * Then I take suggestions for 3 other classes, commented out in AllCritterCode.java, let the students implement it,
 * actually come up to the computer write out code.
 * That may not be possible since they don't know if/else statements, I'll leave it up to you. It's a good way to show off how to use the IDE too.
 */
public class Flytrap implements Critter {

    private char id = 'F';
    @Override
    public char getChar() {
        return id;
    }

    public void setChar(char newId){
        id = newId;
    }

    @Override
    public Move getMove(Neighbor front, Neighbor back, Neighbor right, Neighbor left) {
        if (front == Neighbor.OTHER){
            return Move.INFECT;
        }
        else{
            return Move.LEFT;
        }
    }
}
