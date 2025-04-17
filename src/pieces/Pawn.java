package pieces;

public class Pawn extends Pieces{
    public Pawn(boolean isWhite){
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "P" : "p";
    }
}
