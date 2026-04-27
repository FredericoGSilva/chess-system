package chess;

import boardgame.Board;
import boardgame.BoardPosition;

public class ChessMatch {

//  Regras do jogo

    private Board board;

    // ChessMatch precisa saber as dimensões do tabuleiro.
    public ChessMatch() {
        board = new Board(8, 8);
    }

    // Implementar movimentos possíveis de jogada.

    // retorna matriz de peças correspondente a essa partida(ChessMatch)
    public ChessPiece[][] getPieces() {
        ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
        // percorre a matriz de peça do tabuleiro e para cada peça faz um dowcast para tipo ChessPiece.
        for (int i=0; i<board.getRows(); i++) {
            for (int j=0; j<board.getColumns(); j++) {
                matriz[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matriz;
    }

}
