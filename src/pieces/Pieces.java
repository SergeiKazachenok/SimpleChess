package pieces;

import game.Board;

public abstract class Pieces {
    protected boolean isWhite;

    public Pieces(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract String getSymbol();

    public abstract boolean isValid(int startRow, int startCol, int endRow, int endCol, Board board);

}
