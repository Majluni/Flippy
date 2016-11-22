package flippy;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * This class provides the necessary logic to simulate a game of 'flippy'
 * with the two player choices and length of said choices being variable.
 * 
 * @author Maurice Ajluni, Tanner Lisonbee
 * @version 1.0
 */
public class Flippy
{
    private final String KEY1, KEY2;
    private final int PATTERN_LENGTH, NUM_OF_SIMULATIONS;
    private int player1WinCount, player2WinCount;
    private DecimalFormat df;
    
    
    /**
     * Constructor to set up a Flippy object.
     * 
     * @param KEY1 Player1's guess
     * @param KEY2 Player2's guess
     * @param NUM_OF_SIMULATIONS number of simulations to be run
     */
    public Flippy(String KEY1, String KEY2, int NUM_OF_SIMULATIONS)
    {
        this.KEY1 = KEY1;
        this.KEY2 = KEY2;
        this.NUM_OF_SIMULATIONS = NUM_OF_SIMULATIONS;
        PATTERN_LENGTH = KEY1.length();
        player1WinCount = 0;
        player2WinCount = 0;
        df = new DecimalFormat("#.####");
    }
        
    /**
     * This method performs the necessary logic to simulate multiple games of
     * 'flippy'.
     */
    public void run()
    {
        //Checks to see that both KEY1 and KEY2 only contain 'h' and 't'
        for (int i = 0; i < NUM_OF_SIMULATIONS; i++)
        {
            String flips = "";

            //Creates (patternLength - 1) coin flips to begin the game.
            for(int j = 0; j < PATTERN_LENGTH - 1; j++)
                flips += flipCoin();

            //Flips the coin and checks if either of the users choices is met
            boolean isEnd = false;
            while (!isEnd)
            {
                flips += flipCoin();

                //Determines if one of the players has won and ends game loop
                if(flips.substring(flips.length() - PATTERN_LENGTH).equalsIgnoreCase(KEY1))
                {
                    player1WinCount++;
                    isEnd = true;
                }
                else if(flips.substring(flips.length() - PATTERN_LENGTH).equalsIgnoreCase(KEY2))
                {
                    player2WinCount++;
                    isEnd = true;
                }
                
                //removes characters from 'flips' as they become unnecessary
                if (flips.length() > PATTERN_LENGTH)
                    flips = flips.substring(1);
            }
        }
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
     * Returns a String representation of the theoretical probability of Player1
     * winning versus Player2 winning. This algorithm is based off one devised
     * by John Conway.
     * 
     * @return String representation of the theoretical probabilities of the
     * current game
     */
    public String getTheoretical()
    {
        String aa = "", ab = "", ba = "", bb = "";
        for (int i = PATTERN_LENGTH - 1; i >= 0; i--)
        {
            if (KEY1.substring((PATTERN_LENGTH - i) - 1).equals(KEY1.substring(0, i + 1)))
                aa += "1";
            else
                aa += "0";
            
            if (KEY1.substring((PATTERN_LENGTH - i) - 1).equals(KEY2.substring(0, i + 1)))
                ab += "1";
            else
                ab += "0";
            
            if (KEY2.substring((PATTERN_LENGTH - i) - 1).equals(KEY1.substring(0, i + 1)))
                ba += "1";
            else
                ba += "0";
            
            if (KEY2.substring((PATTERN_LENGTH - i) - 1).equals(KEY2.substring(0, i + 1)))
                bb += "1";
            else
                bb += "0";
        }
        
        //convert the String binary numbers to integers that are equivalent in base 10
        int AA = binaryToDecimal(aa);
        int AB = binaryToDecimal(ab);
        int BA = binaryToDecimal(ba);
        int BB = binaryToDecimal(bb);
        
        //part of Conway's algorithm that calculates odds of either player winning.
        int player1Odds = BB - BA;
        int player2Odds = AA - AB;
        int sampleSpace = player1Odds + player2Odds;
        
        String player1Prob = df.format(((double)player1Odds / (double)sampleSpace) * 100);
        String player2Prob = df.format(((double)player2Odds / (double)sampleSpace) * 100);
        
        return "\nProbability of Player 1 winning: " + player1Prob + "%\n"
               + "Probability of Player 2 winning: " + player2Prob + "%\n";
    }
    
    /**
     * Converts a String representation of a binary number into its decimal
     * counterpart.
     * 
     * @param binaryNum String representation of a binary number
     * @return binary number converted to base 10
     */
    private int binaryToDecimal(String binaryNum)
    {
        int result = 0;
        for (int i = 0; i < binaryNum.length(); i++)
        {
            result += (Math.pow(2, i)) * Integer.parseInt(binaryNum.charAt(binaryNum.length() - i - 1) + "");
        }
        return result;
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
        df.setRoundingMode(RoundingMode.CEILING);
        return "Player 1's input was \"" + KEY1 + "\".\n\t" 
                + "They won " + player1WinCount + " times.\n\tThey won "
                + df.format((((double)player1WinCount * 100) / NUM_OF_SIMULATIONS))
                + "% of the time.\n"
                + "Player 2's input was \"" + KEY2 + "\".\n\t"
                + "They won " + player2WinCount + " times.\n\tThey won "
                + df.format((((double)player2WinCount * 100) / NUM_OF_SIMULATIONS))
                + "% of the time.";
    }
}