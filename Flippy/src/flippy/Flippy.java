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
    private String flips, choice1, choice2;
    private byte winner;
    private int patternLength;
    
    /**
     * Default constructor set to private in order to make the class non
     * instantiatable.
     */
    public Flippy(String choice1, String choice2)
    {
        this.choice1 = choice1;
        this.choice2 = choice2;
        flips = "";
        winner = 0;
    }
        
    /**
     * This method performs the necessary logic to simulate a single game of
     * 'flippy'.
     * 
     * @param choice1 Player1's combination of flips
     * @param choice2 Player2's combination of flips
     * @return winning player ('1' representing Player1, and '2' representing Player2
     */
    public byte run() throws InvalidEntryException
    {
        /*
         * Checks to see that both choice1 and choice2 only contain 'h' and 't'
         * and that the length of both of those match patternLength.
         */
        boolean cont;
        do
        {
            try
            {
                if (!isValid(choice1, choice2))
                    throw new InvalidEntryException();

                patternLength = choice1.length();

                //Creates (patternLength - 1) coin flips to begin the game.
                for(int i = 0; i < patternLength - 1; i++)
                    flips += flipCoin();

                //Flips the coin and checks if either of the users choices is met
                boolean isEnd = false;
                while (!isEnd)
                {
                    flips += flipCoin();

                    //Determines if one of the players has won and ends game loop
                    if(flips.substring(flips.length() - patternLength).equals(choice1))
                    {
                        winner = 1;
                        isEnd = true;
                    }
                    else if(flips.substring(flips.length() - patternLength).equals(choice2))
                    {
                        winner = 2;
                        isEnd = true;
                    }
                }
                cont = false;
            }
            catch (InvalidEntryException e)
            {
                cont = true;
            }
        }
        while (cont);
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
    
    public boolean isValid(String choice1, String choice2)
    {
        boolean result = true;
        if (choice1.length() == choice2.length())
        {
            for (int i = 0; i < patternLength; i++)
            {
                if ((choice1.charAt(i) != 'h' || choice1.charAt(i) != 't') 
                  &&(choice2.charAt(i) != 'h' || choice2.charAt(i) != 't'))
                {
                    result = false;
                }
            }
        }
        return result;
    }
}