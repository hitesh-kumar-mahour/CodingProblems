package machineCoding.chess.Board;

public class ChessBoardUtil {
    private ChessBoardUtil() {
    }

    public static final Integer ROW = 8;
    public static final Integer COLUMN = 8;
    public static final String EMPTY = "--";

    public static String[][] getInitialState() {
        String[][] state = new String[ROW][COLUMN];
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < 8; j++) {
                state[i][j] = EMPTY;
            }
        }
        for (int i = 0; i < 8; i++) {
            state[1][i] = "WP";
            state[6][i] = "BP";
            switch (i) {
                case 0:
                case 7:
                    state[0][i] = "WR";
                    state[7][i] = "BR";
                    break;
                case 1:
                case 6:
                    state[0][i] = "WH";
                    state[7][i] = "BH";
                    break;
                case 2:
                case 5:
                    state[0][i] = "WB";
                    state[7][i] = "BB";
                    break;
                case 3:
                    state[0][i] = "WQ";
                    state[7][i] = "BQ";
                    break;
                case 4:
                    state[0][i] = "WK";
                    state[7][i] = "BK";
                    break;

            }
        }
        return state;
    }
}
