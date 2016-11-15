package flippy;

/**
 * 
 * @author Maurice Ajluni
 */
public class Flippy
{
    String choice1, choice2, tempChoice, flips, winner;
    boolean cont, valid;
    int patternLength;
        
    public Flippy(String choice1, String choice2, int length)
    {
        this.choice1 = choice1;
        this.choice2 = choice2;
        cont = true;
        valid = false;
        patternLength = length;
    }
    
    public void run()
    {
        //Creates 3 initial coin flips to begin the game.
        for(int i = 0; i < patternLength - 1; i++)
            flips += flipCoin();
        
        //Flips the coin and checks if either of the users choices is met
        while(cont)
        {
            flips += flipCoin();
            
            //Determines if one of the players has won and ends game loop
            if(flips.substring(flips.length() - patternLength).equals(choice1))
            {
                winner = choice1;
                cont = false;
            }
            else if(flips.substring(flips.length() - patternLength).equals(choice2))
            {
                winner = choice2;
                cont = false;
            }
        }
    }
    
    /**
     * Returns a String to represent the result of a coin flip
     * @return "H" or "T"
     */
    public static String flipCoin()
    {
        if(Math.random() < 0.5)
            return "H";
        else
            return "T";
    }
}