package GUI;

import game.Board;
import pieces.Piece;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private Board board;
    private JButton[][] squares;
    private int selectedRow = -1, selectedCol = -1;

    public GUI() {
        board = new Board();
        squares = new JButton[8][8];
        setTitle("Chess Game");
        setSize(600, 600);
        setLayout(new GridLayout(8, 8));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initBoard();

        setVisible(true);
    }

    private void initBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JButton button = new JButton();
                button.setFont(new Font("Arial", Font.BOLD, 24));
                int r = row, c = col;

                button.addActionListener(e -> handleClick(r, c));

                squares[row][col] = button;
                add(button);
            }
        }

        updateDisplay();
    }

    private void handleClick(int row, int col) {
        Piece clicked = board.getPiece(row, col);

        if (selectedRow == -1) {
            // First click
            if (clicked != null) {
                selectedRow = row;
                selectedCol = col;
                squares[row][col].setBackground(Color.YELLOW);
            }
        } else {
            // Second click — attempt to move
            boolean moved = board.movePiece(selectedRow, selectedCol, row, col);
            resetColors();
            selectedRow = -1;
            selectedCol = -1;
            updateDisplay();

            if (!moved) {
                JOptionPane.showMessageDialog(this, "Invalid move!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void resetColors() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                squares[row][col].setBackground((row + col) % 2 == 0 ? Color.WHITE : Color.GRAY);
            }
        }
    }

    private void updateDisplay() {
        resetColors();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board.getPiece(row, col);
                squares[row][col].setText(piece == null ? "" : piece.getSymbol());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI::new);
    }
}
