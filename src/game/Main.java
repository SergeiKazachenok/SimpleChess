package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        do {
            board.PrintBoard();
            System.out.print("Enter your move: ");
            String move = scanner.nextLine();

            System.out.println("You entered: " + move);
        } while (true);
    }
}
