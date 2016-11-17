package flippy;
/**
 * This class provides the necessary logic to simulate a single game of 'flippy'
 * with the two player choices and length of said choices being variable.
 * 
 * @author Maurice Ajluni, Tanner Lisonbee
 * @version 1.0
 */
public class Flippy
{
    private final String CHOICE1, CHOICE2;
    private final int NUM_OF_SIMULATIONS;
    private String flips;
    private byte winner;
    
    
    /**
     * Constructor to set up a Flippy object.
     * 
     * @param CHOICE1 Player1's guess
     * @param CHOICE2 Player2's guess
     * @param NUM_OF_SIMULATIONS number of simulations to be run
     */
    public Flippy(String CHOICE1, String CHOICE2, int NUM_OF_SIMULATIONS)
    {
        this.CHOICE1 = CHOICE1;
        this.CHOICE2 = CHOICE2;
        this.NUM_OF_SIMULATIONS = NUM_OF_SIMULATIONS;
        flips = "";
        winner = 0;
    }
        
    /**
     * This method performs the necessary logic to simulate a single game of
     * 'flippy'.
     * 
     * @return winning player ('1' representing Player1, and '2' representing Player2
     */
    public byte run() throws InvalidEntryException
    {
        //Checks to see that both CHOICE1 and CHOICE2 only contain 'h' and 't'
        for (int i = 0; i < NUM_OF_SIMULATIONS; i++)
        {
            int patternLength = CHOICE1.length();

            //Creates (patternLength - 1) coin flips to begin the game.
            for(int j = 0; j < patternLength - 1; j++)
                flips += flipCoin();

            //Flips the coin and checks if either of the users choices is met
            boolean isEnd = false;
            while (!isEnd)
            {
                flips += flipCoin();

                //Determines if one of the players has won and ends game loop
                if(flips.substring(flips.length() - patternLength).equals(CHOICE1))
                {
                    winner = 1;
                    isEnd = true;
                }
                else if(flips.substring(flips.length() - patternLength).equals(CHOICE2))
                {
                    winner = 2;
                    isEnd = true;
                }
            }
        }
        flips = "";
        return winner;
    }
    
    /**
     * Returns a String to represent the result of a coin flip
     * @return "H" or "T"
     */
    private String flipCoin()
    {
        if(Math.random() < 0.5)
            return "H";
        else
            return "T";
    }
}