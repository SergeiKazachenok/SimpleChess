package pieces;

import game.Board;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValid(int startRow, int startCol, int endRow, int endCol, Board board) {
        if (Math.abs(endRow - startRow) != Math.abs(endCol - startCol)) return false;
        int rowStep = Integer.compare(endRow, startRow);
        int colStep = Integer.compare(endCol, startCol);

        int r = startRow - rowStep;
        int c = startCol - colStep;

        while (r != endRow && c != endCol){
            if (board.getPiece(r, c) != null) return false;
            r += rowStep;
            c += colStep;
        }
        Piece target = board.getPiece(endRow, endCol);
        return target == null || target.isWhite() != this.isWhite;
    }

    @Override
    public String getSymbol() {
        return isWhite ? "B" : "b";
    }
}
