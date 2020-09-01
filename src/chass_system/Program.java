package chass_system;

import boardygame.Board;
import chess.ChessMatch;


public class Program {
	public static void main(String args[]) {
		
		ChessMatch chessMatch = new ChessMatch();
                UI.printBoard(chessMatch.getpieces());
	}

}
