import java.util.Scanner;

/**
 * Main method.  This runs the console interface for the Rock, Paper, Scissors, Lizard, Spock game.
 *
 * @author Sarah Day
 * @version 1.0
 */

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;


        // Loop will keep looping as long as the player wishes to keep playing.
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            /* This loop will keep looping as long as 'isValid' returns false.  If a valid selection is made, the function
             * 'isValid' will return true and exit the loop.
             */
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick); // 'isValidPick' will return a boolean value and helps determine looping.
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick(); // Computer's pick is randomly generated, handled by the 'RPSLSpock' class, 'generatePick()'.
            System.out.print("Computer picked " + c_pick + "  ");

            // Block reports the outcome of the game.
            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer)); // Keeps looping with a 'y' response.
        System.out.println("Live long and prosper!");
    }
}
