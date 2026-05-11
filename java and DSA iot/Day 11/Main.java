 /*two dimensional array add values*/ 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // input elements
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // sum of all elements
        int sum = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
        }

        // output result
        System.out.println("Sum = " + sum);

        sc.close();
    }
}\