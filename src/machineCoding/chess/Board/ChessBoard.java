package machineCoding.chess.Board;

public class ChessBoard {
    String [][] state;

    public ChessBoard(String[][] state) {
        this.state = state;
    }

    public String[][] getState() {
        return state;
    }

    public void setState(String[][] state) {
        this.state = state;
    }
}
