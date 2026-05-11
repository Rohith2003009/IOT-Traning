/* take an exmpale and use abstarct method create abstract class and call it */
import java.util.Scanner;

// Abstract class
abstract class Payment {
    abstract void pay(double amount); // abstract method
}

// Child class 1
class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Child class 2
class Card extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

// Child class 3
class Cash extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

// Main class
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. UPI\n2. Card\n3. Cash");
        System.out.print("Choose Payment Method: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        Payment p; // reference of abstract class

        switch(choice) {
            case 1:
                p = new UPI();
                break;
            case 2:
                p = new Card();
                break;
            case 3:
                p = new Cash();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        p.pay(amount); // calling abstract method

        sc.close();
    }
}