/*payments system
 different payment types
 upi
  card
  cash  */

 import java.util.Scanner;

class Payment {
    double amount;

    void pay(double amount) {
        this.amount = amount;
        System.out.println("Processing payment of: ₹" + amount);
    }
}

// UPI Payment
class UPI extends Payment {
    String upiId;

    void payUPI(Scanner sc) {
        System.out.print("Enter UPI ID: ");
        upiId = sc.next();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        pay(amt);
        System.out.println("Paid using UPI ID: " + upiId);
    }
}

// Card Payment
class Card extends Payment {
    String cardNumber;

    void payCard(Scanner sc) {
        System.out.print("Enter Card Number: ");
        cardNumber = sc.next();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        pay(amt);
        System.out.println("Paid using Card: " + cardNumber);
    }
}

// Cash Payment
class Cash extends Payment {

    void payCash(Scanner sc) {
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        pay(amt);
        System.out.println("Paid using Cash");
    }
}

// Main Class
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Payment System ----");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash");
        System.out.print("Choose Payment Method: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                UPI upi = new UPI();
                upi.payUPI(sc);
                break;

            case 2:
                Card card = new Card();
                card.payCard(sc);
                break;

            case 3:
                Cash cash = new Cash();
                cash.payCash(sc);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}