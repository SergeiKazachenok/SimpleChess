package pieces;

import game.Board;

public class Pawn extends Piece {
    public Pawn(boolean isWhite){
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "P" : "p";
    }

    @Override
    public boolean isValid(int startRow, int startCol, int endRow, int endCol, Board board) {
        int directions = isWhite ? -1 : 1;

        if (startCol == endCol && endRow == startRow + directions &&
        board.getPiece(endRow,endCol) == null){
            return true;
        }

        if (startCol == endCol && ((isWhite && startRow == 6 ) || (!isWhite  && startRow == 1)
        && endRow ==startRow + 2 * directions && board.getPiece(endRow, endCol) != null &&
                board.getPiece(endRow, endCol).isWhite() != this.isWhite)){
            return true;
        }
        return false;
    }
}
