package pieces;

public class Queen extends Pieces{
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "Q" : "q";
    }
}
