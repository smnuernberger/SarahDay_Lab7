/*
 *Add a unit test class to the project – named RPSLSpock_Test.
 *Write a test for each of the three methods in the RPSLSpock class. You will have three tests:
 *Test the isValidPick() method – test all five valid possibilities and at least one invalid possibility.
 *Test the generatePick() method – make sure the returned value is not null. Use the isValidPick() method to test if the returned value is valid. In the test method, test generatePick() one million times.
 *Test the isComputerWin() method – test all ten win conditions and at least one computer loses scenario.
 *Run your unit tests and make sure they work.
 */

import org.junit.Assert;
import org.junit.Test;

public class RPSLSpockTests {


    @Test
    public void testIsValidPickReturnsTrueForRock() {
        Assert.assertTrue(RPSLSpock.isValidPick("Rock"));
    }

    @Test
    public void testIsValidPickReturnsTrueForPaper() {
        Assert.assertTrue(RPSLSpock.isValidPick("Paper"));
    }

    @Test
    public void testIsValidPickReturnsTrueForScissors() {
        Assert.assertTrue(RPSLSpock.isValidPick("Scissors"));
    }

    @Test
    public void testIsValidPickReturnsTrueForLizard() {
        Assert.assertTrue(RPSLSpock.isValidPick("Lizard"));
    }

    @Test
    public void testIsValidPickReturnsTrueForSpock() {
        Assert.assertTrue(RPSLSpock.isValidPick("Spock"));
    }

    @Test
    public void testIsValidPickReturnsFalseForFoo() {
        Assert.assertFalse(RPSLSpock.isValidPick("Foo"));
    }

    @Test
    public void testIfFunctionGeneratePickDoesNotReturnNull() {
        Assert.assertNotNull(RPSLSpock.generatePick());
    }

    @Test
    public void testGeneratePickIsValidPickOneMillionTimes() {
        for (int i = 0; i <= 1_000_000; i++) {
            Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.generatePick()));
        }
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksRockAndUserPicksScissors() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksRockAndUserPicksLizard() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.LIZARD));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksPaperAndUserPicksRock() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksPaperAndUserPicksSpock() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.SPOCK));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksScissorsAndUserPicksPaper() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksScissorsAndUserPicksLizard() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.LIZARD));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksLizardAndUserPicksPaper() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.PAPER));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksLizardAndUserPicksSpock() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.SPOCK));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksSpockAndUserPicksRock() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.ROCK));
    }

    @Test
    public void testIsComputerWinReturnTrueWhenComputerPicksSpockAndUserPicksScissors() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.SCISSORS));
    }

    @Test
    public void testIsComputerWinReturnFalseWhenComputerPicksRockAndUserPicksPaper() {
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.PAPER));
    }
}
