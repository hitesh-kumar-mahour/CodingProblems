package machineCoding.chess.chessvalidatorservice;

import static machineCoding.chess.Board.ChessBoardUtil.COLUMN;
import static machineCoding.chess.Board.ChessBoardUtil.ROW;
import machineCoding.chess.Board.ChessBoard;
import machineCoding.chess.piece.Piece;
import machineCoding.chess.piece.PieceFactory;

public class ChessValidatorService {

    private ChessBoard chessBoard;
    private Piece piece;


    public ChessValidatorService(String[][] state) {
        this.chessBoard = new ChessBoard(state);

    }

    public void printCurrentState() {
        String state[][] = chessBoard.getState();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print(state[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void validateMove(int rs, int cs, int re, int ce) {
        String state[][] = chessBoard.getState();
        String piece = state[rs][cs];
        Piece pieceObj = PieceFactory.getPiece(piece);
        pieceObj.move(rs, cs, re, ce, state, piece);
    }


}
