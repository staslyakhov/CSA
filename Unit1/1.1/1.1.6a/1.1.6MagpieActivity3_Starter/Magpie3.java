
/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
    /**
     * Get a default greeting
     * 
     * @return a greeting
     */
    public String getGreeting()
    {

        findKeyword("She's my sister", "sister", 0);
        findKeyword("Brother Tom is helpful", "brother", 0);
        findKeyword("I can't catch wild cats.", "cat", 0);
        findKeyword("I know nothing about snow plows." ,"no", 0);
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        final int RANDOM_RESPONSES = 2;
        double r1 = Math.random();
        int whatResponse = (int) (r1 * RANDOM_RESPONSES);
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }
        else if (statement.indexOf("How are you") >= 0
        || statement.indexOf("What's up") >= 0)
        
           if (whatResponse == 1)
                response = "Working as always... What about you?";
           else
                response = "I am well, how are you?";  
        else if (statement.indexOf( "where are you from?") >= 0)
        {
            response = "From far, far, away";
        }
        else if (statement.indexOf ("I am going ") >= 0)
        {
            response = "Why would you go there?";
        }
        else if ((statement.indexOf ("I am") >= 0 || statement.indexOf ("They are") >= 0)
        && (findKeyword(statement, "well") >= 0 || (findKeyword(statement, "good") >= 0))&& !( statement.indexOf ("no") >= 0))
        {
            response = "Glad to hear!";
        }
        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findKeyword(statement, "help") >= 0)
        {
            if (whatResponse == 1)
                response = "What do you need help with?";
            else
                response = "Should I help you?";
        }
        else if (findKeyword(statement, "cat") >= 0
        || findKeyword(statement, "dog") >= 0
        || findKeyword(statement, "rabbit") >= 0
        || findKeyword(statement, "hamster") >= 0)
        {
           if (whatResponse == 1)
                response = "Tell me more about your pets.";
           else
                response = "How are your pets doing?";   
        }
        else if (findKeyword(statement, "bad") >= 0
        || findKeyword(statement, "sad") >= 0
        || (findKeyword(statement, "not") >= 0 && findKeyword(statement, "well") >= 0)
        || (findKeyword(statement, "not") >= 0 && findKeyword(statement, "good") >= 0))
        {
           if (whatResponse == 1)
                response = "Sorry to hear.";
           else
                response = "FeelsBadMan";   
        }
        else if (findKeyword(statement, "mother") >= 0
        || findKeyword(statement, "father") >= 0
        || findKeyword(statement, "sister") >= 0
        || findKeyword(statement, "brother") >= 0
        || findKeyword(statement, "aunt") >= 0
        || findKeyword(statement, "uncle") >= 0)
        {
           if (whatResponse == 1)
                response = "Tell me more about your family.";
           else
                response = "How is your family doing?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn)
                .toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1)
                .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     * 
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
       
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }

}
