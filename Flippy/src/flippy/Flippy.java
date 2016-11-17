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
    private int player1WinCount, player2WinCount;
    
    
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
        player1WinCount = 0;
        player2WinCount = 0;
    }
        
    /**
     * This method performs the necessary logic to simulate multiple games of
     * 'flippy'.
     */
    public void run() throws InvalidEntryException
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
                    player1WinCount++;
                    isEnd = true;
                }
                else if(flips.substring(flips.length() - patternLength).equals(CHOICE2))
                {
                    player2WinCount++;
                    isEnd = true;
                }
            }
        }
        flips = "";
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
    
    /**
     * Returns the number of times Player 1 has won
     * @return number of times Player 1 won
     */
    public int getPlayer1WinCount()
    {
        return player1WinCount;
    }
    
    /**
     * Returns the number of times Player 2 has won
     * @return number of times Player 2 won
     */
    public int getPlayer2WinCount()
    {
        return player2WinCount;
    }
    
    /**
     * Returns a string representation of the simulation.
     * @return string representation of the simulation
     */
    @Override
    public String toString()
    {
        return "Player 1's input was " + CHOICE1 + " and won "
                + (player1WinCount / NUM_OF_SIMULATIONS) + "% of the time.\n"
                + "Player 2's input was " + CHOICE2 + " and won "
                + (player2WinCount / NUM_OF_SIMULATIONS) + "% of the time.";
    }
}