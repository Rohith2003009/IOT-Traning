import java.util.Scanner;

public class StringActions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length
        System.out.println("Length: " + str.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Reverse string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);

        // Check palindrome
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        // Substring
        if (str.length() >= 3) {
            System.out.println("Substring (0 to 3): " + str.substring(0, 3));
        }

        // Replace characters
        System.out.println("Replace a with @: " + str.replace('a', '@'));

        // Contains check
        System.out.println("Contains 'java'? " + str.contains("java"));

        sc.close();
    }
}