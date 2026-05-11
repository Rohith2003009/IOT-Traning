import java.util.Scanner;

public class p8 {
    public static void main(String[] args){
        int pin = 1234;
        int enterPin;
        int attempts = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter PIN: ");
            enterPin = sc.nextInt();

            if(enterPin == pin){
                System.out.println("Login Successful");
                break;
            }
            else{
                attempts++;
                System.out.println("Wrong key, try again!");
            }

        } while(attempts < 3);

        if(attempts >= 3){
            System.out.println("Account Blocked");
        }

        sc.close();
    }
}