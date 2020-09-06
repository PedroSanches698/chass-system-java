package chess;

/**
 *
 * @author Pedro
 */
public class ChessException extends RuntimeException{
    private static final long serialVERSION = 1L;
    
    public ChessException(String msg){
        super(msg);
    }
    
}
