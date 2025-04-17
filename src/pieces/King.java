package pieces;

public class King extends Pieces{
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "K" : "k";
    }
}
