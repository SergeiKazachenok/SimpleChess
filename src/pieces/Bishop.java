package pieces;

public class Bishop extends Pieces{
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "B" : "b";
    }
}
