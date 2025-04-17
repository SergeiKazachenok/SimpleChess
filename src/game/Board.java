package game;

import pieces.*;

public class Board {

    private Pieces[][] board;

    public Board(){
        board = new Pieces[8][8];
        setupBoard();
    }

    private void setupBoard(){
        for (int i = 0; i < 8; i++){
            board[1][i] = new Pawn(false);  // Black
            board[6][i] = new Pawn(true); // White

        }

        // Rooks
        board[0][0] = new Rook(false);
        board[0][7] = new Rook(false);
        board[7][0] = new Rook(true);
        board[7][7] = new Rook(true);

        // Knights
        board[0][1] = new Knight(false);
        board[0][6] = new Knight(false);
        board[7][1] = new Knight(true);
        board[7][6] = new Knight(true);

        // Bishops
        board[0][2] = new Bishop(false);
        board[0][5] = new Bishop(false);
        board[7][2] = new Bishop(true);
        board[7][5] = new Bishop(true);

        // Queens
        board[0][3] = new Queen(false);
        board[7][3] = new Queen(true);

        // Kings
        board[0][4] = new King(false);
        board[7][4] = new King(true);
    }

    public void PrintBoard() {
        for (int row = 0; row < 8; row++) {
            System.out.print(8 - row + " ");
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == null){
                    System.out.print(". ");
                }else {
                    System.out.print(board[row][col].getSymbol() + " ");
                }
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
}
