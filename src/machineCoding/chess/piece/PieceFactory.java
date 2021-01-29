package machineCoding.chess.piece;

public class PieceFactory {
    Piece piece;

    public static Piece getPiece(String piece) {
        if ("WP".equals(piece) || "BP".equals(piece)) {
            return new Pawn();
        } else if ("WB".equals(piece) || "BB".equals(piece)) {
            return new Bishop();
        } else if ("WH".equals(piece) || "BH".equals(piece)) {
            return new Horse();
        } else if ("WQ".equals(piece) || "BQ".equals(piece)) {
            return new Queen();
        } else if ("WK".equals(piece) || "BK".equals(piece)) {
            return new King();
        } else if ("WR".equals(piece) || "BR".equals(piece)) {
            return new Rook();
        }
        return null;
    }
}
