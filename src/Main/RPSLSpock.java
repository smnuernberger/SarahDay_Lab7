import java.util.Random;

/**
 * RPSLSpock class.
 *
 * @author Sarah Day
 * @version 1.0
 */

public class RPSLSpock {
    static Random rand = new Random(System.currentTimeMillis());

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    /**
     * Validates the input string is one of the following: Rock, Paper, Scissors, Lizard, or Spock.
     *
     * @param pick The value that needs to be validated.
     * @return False will be returned if the value passed in is not a valid choice.  If a valid choice has been selected, the
     * function will return true.
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }
        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    /**
     * Randomly generates a value from 0-4.  Rock, paper, scissors, lizard, or spock will be selected based on this value.
     *
     * @return Rock, paper, scissors, lizard, or spock.
     */
    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    /**
     * Based on the computer player and human player pick, 'isComputerWin' will return the wining state of the computer
     * player.
     *
     * @param c_pick Computer player pick.
     * @param h_pick Human player pick.
     * @return A boolean will be returned to indicate whether or not the computer won.  True if it won, false if it lost.
     */
    public static boolean isComputerWin(String c_pick, String h_pick) {
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}
