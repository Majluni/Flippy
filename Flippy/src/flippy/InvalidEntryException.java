package flippy;
/**
 * Signifies that the entries made for Player1 and Player2 are invalid in some
 * way.
 * 
 * @author Tanner Lisonbee
 * @version 1.0
 */
public class InvalidEntryException extends RuntimeException 
{
    public InvalidEntryException() 
    {
        this("The input entered was invalid.");
    }
    
    /**
     * Constructs an instance of <code>InvalidEntryException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidEntryException(String msg) 
    {
        super(msg);
    }
}
