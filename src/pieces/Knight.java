package pieces;

import game.Board;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValid(int startRow, int startCol, int endRow, int endCol, Board board) {

        int rowDiff = Math.abs(endRow - startRow);
        int colDiff = Math.abs(endCol - startCol);

        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)){
            Piece target = board.getPiece(endRow, endCol);
            return target == null || target.isWhite() != this.isWhite;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return isWhite ? "K" : "k";
    }
}
