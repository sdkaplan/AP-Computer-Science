
public class Rover implements Critter {

    private char id = 'R';
    @Override
    public char getChar() {
        return id;
    }

    public void setChar(char newId){
        id = newId;
    }

    @Override
    public Move getMove(Neighbor front, Neighbor back, Neighbor right, Neighbor left) {
        if (front != Neighbor.WALL){
            return Move.HOP;
        }
        else{
            return Move.LEFT;
        }
    }
}
