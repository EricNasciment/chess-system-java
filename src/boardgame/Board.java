package boardgame;

public class Board {

	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;

	public Board(Integer rows, Integer columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board:there must be at least 1 row and 1 column.");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (!positionExist(row, column)) {
			throw new BoardException("Position is not on the board.");

		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("Position is not on the board.");

		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placepiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is alredy a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
    
	public Piece removepiece(Position position ){
		if(!positionExist(position)) {
			throw new BoardException("Position is not on the board.");
		}
		if(piece(position) == null ) {
		 return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()] [position.getColumn()] = null;
		return aux;
	}
	
	
	private boolean positionExist(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExist(Position position) {
		return positionExist(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("Position is not on the board.");
		}
		return piece(position) != null;
	}

}
