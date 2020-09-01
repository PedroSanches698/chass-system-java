package chess.pieces;

import boardygame.Board;
import chess.ChessPiece;
import chess.Color;


public class King extends ChessPiece {

    public King(Color color, Board bord) {
        super(color, bord);
    }
    
    @Override
    public String toString(){
        return "K";
    }
    
    
    
}
