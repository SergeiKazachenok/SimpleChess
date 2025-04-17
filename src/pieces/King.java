package pieces;

import game.Board;

public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValid(int startRow, int startCol, int endRow, int endCol, Board board) {

        int rowDiff = Math.abs(endRow - startRow);
        int colDIff = Math.abs(endCol - startCol);

        if (rowDiff <= 1 && colDIff <= 1){
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
