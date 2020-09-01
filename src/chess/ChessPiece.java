package chess;

import boardygame.Board;
import boardygame.Piece;


public class ChessPiece extends Piece {
    
    private Color color;

    public ChessPiece(Color color, Board bord) {
        super(bord);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

   
    
    
    
}
