package pieces;

public class Rook extends Pieces{
    public Rook(boolean isWhite){
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "R" : "r";
    }
}
