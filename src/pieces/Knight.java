package pieces;

public class Knight extends Pieces{
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "K" : "k";
    }
}
