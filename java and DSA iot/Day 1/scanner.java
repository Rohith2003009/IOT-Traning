import java.util.Scanner;

public class scanner{
	public static void main(){
		int user_input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		user_input = sc.nextInt();
		System.out.println("The Entered number is "+user_input);
	}
}	