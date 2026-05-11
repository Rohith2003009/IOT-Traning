/*encaplsutaion data hiding*/
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter loan amount: ");
        int amount = sc.nextInt();
        Loan loan = new Loan(name, amount);
        loan.displayDetails();
    }
}
    public Loan(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Loan Amount: " + amount);
    }
}