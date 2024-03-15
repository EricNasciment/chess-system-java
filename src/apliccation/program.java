package apliccation;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		ChessMatch chessmatch = new ChessMatch();
		
		
		while(true) {
			UI.printBoard(chessmatch.getPieces());
			System.out.println();
			System.out.print("source:");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("target:");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessmatch.performChessMove(source,target);
			
		}
		
	}

}
