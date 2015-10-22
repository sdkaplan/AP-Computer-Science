/**
 * Created by bal_Sdkaplan on 9/22/2015.
 */
public class NewCritter implements Critter {

    private char id = 'S';
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
            //return Move.LEFT;
        }
        else if (left == Neighbor.OTHER){
            return Move.INFECT;
            //return Move.RIGHT;
        }
        else if (right == Neighbor.OTHER){
            return Move.INFECT;
            //return Move.LEFT;
        }
        else if (back == Neighbor.OTHER){
            return Move.INFECT;
            //return Move.RIGHT;
        }
        else {
            return Move.RIGHT;
        }
    }
}
