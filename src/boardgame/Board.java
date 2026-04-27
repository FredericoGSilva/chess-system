package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    // Matriz de peças - retorna uma peça.
    public Piece piece(int row, int column) {
        // Fazer condicional caso a peça não exista.
        // Criar excessão
        return pieces[row][column];
    }

    // Sobrecarga
    // Retorna a posição
    public Piece piece(BoardPosition position) {
        // Fazer condicional caso a peça não exista na posição.
        // Criar excessão
        return pieces[position.getRow()][position.getColumn()];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
