package boardgame;

public abstract class Piece {

    protected BoardPosition boardPosition;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    // possíveis movimentos da peça
    public abstract boolean[][] possibleMoves();

    // Movimento possível
    public boolean possibleMove(BoardPosition boardPosition) {
        return possibleMoves()[boardPosition.getRow()][boardPosition.getColumn()];
    }

    // se existe ou não possibilidade de movimento para a peça
    public boolean existPossibleMove() {
        boolean[][] matriz = possibleMoves();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
