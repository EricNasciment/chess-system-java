package apliccation;

import chess.ChessMatch;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
	}

}
