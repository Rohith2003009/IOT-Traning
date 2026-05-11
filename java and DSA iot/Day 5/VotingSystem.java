/*take 3 array who got maximum votes */

import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Candidate names
        String[] names = {"A", "B", "C"};

        // Votes array
        int[] votes = new int[3];

        // Input votes
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter votes for Candidate " + names[i] + ": ");
            votes[i] = sc.nextInt();
        }

        // Find maximum
        int maxVotes = votes[0];
        String winner = names[0];

        for (int i = 1; i < 3; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = names[i];
            }
        }

        // Output result
        System.out.println("Winner is Candidate " + winner + " with " + maxVotes + " votes");
    }
}