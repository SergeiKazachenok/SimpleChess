package pieces;

import game.Board;

public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValid(int startRow, int startCol, int endRow, int endCol, Board board) {
        Rook rokLogic = new Rook(isWhite);
        Bishop bishopLogic = new Bishop(isWhite);

        return rokLogic.isValid(startRow, startCol, endRow, endCol, board ) ||
                bishopLogic.isValid(startRow, startCol, endRow, endCol, board);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "Q" : "q";


    }
}
