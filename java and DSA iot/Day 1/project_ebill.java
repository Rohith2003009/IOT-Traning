import java.util.Scanner;
public class project_ebill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount = calculateBill(units);
        System.out.printf("The electricity bill amount is: %.2f\n", billAmount);
        sc.close();
    }

    public static double calculateBill(int units) {
        double billAmount = 0.0;
        if (units <= 100) {
            billAmount = units * 0.5; // Rate for first 100 units
        } else if (units <= 200) {
            billAmount = 100 * 0.5 + (units - 100) * 0.75; // Rate for next 100 units
        } else {
            billAmount = 100 * 0.5 + 100 * 0.75 + (units - 200) * 1.0; // Rate for above 200 units
        }
        return billAmount;
    }
}

