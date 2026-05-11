/* MISSING NUMBER PROJECT
STUDENT ROLL NUMBER ADULT SYSTEM
ROLLL NUMBER SHOULDE BE 0->N BUT ONE IS MISSING */

import java.util.Scanner; 

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (N): ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // one number missing

        System.out.println("Enter " + n + " roll numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Expected sum from 0 to N
        int totalSum = n * (n + 1) / 2;

        // Actual sum
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        int missing = totalSum - actualSum;

        System.out.println("Missing Roll Number: " + missing);
    }
}