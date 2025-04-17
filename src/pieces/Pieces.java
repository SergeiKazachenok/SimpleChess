package pieces;

public abstract class Pieces {
    protected boolean isWhite;

    public Pieces(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract String getSymbol();
}
