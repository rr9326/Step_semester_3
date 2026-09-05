package Java_Arrays_and_Methods.practice_problems;
import java.util.Arrays;
import java.util.Scanner;

public class hackathon_score_curve_booster {

    // Method to add bonus marks to every score
    static void curveScores(int[] scores, int bonus) {

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] + bonus;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number of teams
        System.out.print("Enter number of teams: ");
        int n = sc.nextInt();

        // Create array
        int[] scores = new int[n];

        // Get scores
        System.out.println("Enter the scores:");

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Get bonus
        System.out.print("Enter bonus score: ");
        int bonus = sc.nextInt();

        // Call the method
        curveScores(scores, bonus);

        // Print modified array
        System.out.println("Final leaderboard: " + Arrays.toString(scores));

        sc.close();
    }
}