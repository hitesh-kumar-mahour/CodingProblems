package machineCoding.chess.piece;

import static machineCoding.chess.Board.ChessBoardUtil.EMPTY;

public class Pawn implements Piece {
    public void move(int rows, int cols, int rowe, int cole, String[][] state, String piece) {

            if (piece.equalsIgnoreCase("WP")) {
                if (cole == cols && rowe == rows + 1 && state[rows][cols].equalsIgnoreCase("WP") && state[rowe][cole].equalsIgnoreCase(EMPTY)) {
                    System.out.println("Valid");
                    state[rows][cols] = EMPTY;
                    state[rowe][cole] = "WP";
                    return;
                } else if (cole == cols + 1 && rowe == rows + 1 && state[rows][cols].equalsIgnoreCase("WP") && state[rowe][cole].startsWith("B")) {
                    System.out.println("Valid");
                    state[rows][cols] = EMPTY;
                    state[rowe][cole] = "WP";
                    return;
                } else if (cole == cols - 1 && rowe == rows + 1 && state[rows][cols].equalsIgnoreCase("WP") && state[rowe][cole].startsWith("B")) {
                    System.out.println("Valid");
                    state[rows][cols] = EMPTY;
                    state[rowe][cole] = "WP";
                    return;
                }

            } else if (piece.equalsIgnoreCase("BP")) {
                if (cole == cols && rowe == rows - 1 && state[rows][cols].equalsIgnoreCase("BP") && state[rowe][cole].equalsIgnoreCase(EMPTY)) {
                    System.out.println("Valid");
                    state[rows][cols] = EMPTY;
                    state[rowe][cole] = "BP";
                    return;
                } else if (cole == cols + 1 && rowe == rows - 1 && state[rows][cols].equalsIgnoreCase("BP") && state[rowe][cole].startsWith("W")) {
                    System.out.println("Valid");
                    state[rows][cols] = EMPTY;
                    state[rowe][cole] = "BP";
                    return;
                } else if (cole == cols - 1 && rowe == rows - 1 && state[rows][cols].equalsIgnoreCase("BP") && state[rowe][cole].startsWith("W")) {
                    System.out.println("Valid");
                    state[rows][cols] = EMPTY;
                    state[rowe][cole] = "BP";
                    return;
                }

            }
        System.out.println("INVALID");

    }
}
