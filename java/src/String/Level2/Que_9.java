/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can
choose either rock, paper, or scissors. Here the game is played between a user and a
computer. Based on the rules, either a player or a computer will win. Show the stats of
player and computer win in a tabular format across multiple games. Also, show the winning
percentage between the player and the computer.
Hint =>
a. The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins
(paper covers rock); scissors-paper: scissors win (scissors cuts paper)
b. Create a Method to find the Computer Choice using the Math.random
c. Create a Method to find the winner between the user and the computer
d. Create a Method to find the average and percentage of wins for the user and the
computer and return a String 2D array
e. Create a Method to display the results of every game and also display the average and
percentage wins
f. In the main take user input for the number of games and call methods to display results */
package String.Level2;
import java.util.Scanner;
public class Que_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numberOfGames = scanner.nextInt();
        String[][] results = new String[numberOfGames][3];
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        displayResults(results, userWins, computerWins, numberOfGames);
        scanner.close();
    }

    public static String getComputerChoice() {
        int randomChoice = (int) (Math.random() * 3);
        switch (randomChoice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "rock";
        }
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        }

        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||

                (userChoice.equals("paper") && computerChoice.equals("rock")) ||

                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static void displayResults(String[][] results, int userWins,
                                      int computerWins, int totalGames) {
        System.out.println("\n========== GAME RESULTS ==========");
        System.out.println(String.format("%-10s %-10s %-10s", "User", "Computer", "Winner"));
        System.out.println("==================================");

        int ties = 0;
        for (String[] result : results) {
            System.out.println(String.format("%-10s %-10s %-10s", result[0], result[1], result[2]));
            if (result[2].equals("Tie")) {
                ties++;
            }
        }

        System.out.println("==================================\n");
        System.out.println("========== STATISTICS ==========");
        System.out.println(String.format("Total Games: %d", totalGames));
        System.out.println(String.format("User Wins: %d", userWins));
        System.out.println(String.format("Computer Wins: %d", computerWins));
        System.out.println(String.format("Ties: %d", ties));

        double userPercentage = totalGames > 0 ? (userWins * 100.0) / totalGames : 0;
        double computerPercentage = totalGames > 0 ? (computerWins * 100.0) / totalGames : 0;

        System.out.println(String.format("\nUser Win Percentage: %.2f%%", userPercentage));
        System.out.println(String.format("Computer Win Percentage: %.2f%%", computerPercentage));
        System.out.println("================================");
    }
}
