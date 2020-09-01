package chess.pieces;

import boardygame.Board;
import chess.ChessPiece;
import chess.Color;


public class Rook extends ChessPiece {

    public Rook(Color color, Board bord) {
        super(color, bord);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
}
