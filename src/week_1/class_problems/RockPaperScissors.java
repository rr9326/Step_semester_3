package week_1.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
     public static String playRound(String playerMove, String computerMove) {

        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") &&
             computerMove.equalsIgnoreCase("Scissors")) ||

            (playerMove.equalsIgnoreCase("Paper") &&
             computerMove.equalsIgnoreCase("Rock")) ||

            (playerMove.equalsIgnoreCase("Scissors") &&
             computerMove.equalsIgnoreCase("Paper"))) {

            return "Win";
        }

        return "Loss";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int rounds = 5;

        String[] moves = {"Rock", "Paper", "Scissors"};

        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 0; i < rounds; i++) {

            System.out.println("\nRound " + (i + 1));

            System.out.print("Enter Rock, Paper, or Scissors: ");
            String playerMove = sc.nextLine();

            // Validate input
            while (!playerMove.equalsIgnoreCase("Rock") &&
                   !playerMove.equalsIgnoreCase("Paper") &&
                   !playerMove.equalsIgnoreCase("Scissors")) {

                System.out.print("Invalid move. Enter Rock, Paper, or Scissors: ");
                playerMove = sc.nextLine();
            }

            // Generate computer move
            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;

            System.out.println("Computer chose: " + computerMove);
            System.out.println("Result: " + result);

            if (result.equals("Win")) {
                wins++;
            } else if (result.equals("Loss")) {
                losses++;
            } else {
                draws++;
            }
        }

        // Print summary
        System.out.println("\n------------- SCOREBOARD -------------");

        System.out.printf("%-8s %-15s %-17s %-10s%n",
                "Round", "Player Move", "Computer Move", "Result");

        for (int i = 0; i < rounds; i++) {

            System.out.printf("%-8d %-15s %-17s %-10s%n",
                    (i + 1),
                    playerMoves[i],
                    computerMoves[i],
                    results[i]);
        }

        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\nWins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.printf("Win Percentage: %.2f%%%n", winPercentage);

        sc.close();
    }
}
