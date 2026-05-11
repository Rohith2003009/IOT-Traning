import java.util.Scanner;

public class SwitchDemo {
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a){
            case 1: {
                System.out.println("Add to cart");
                break;
            }
            case 2: {
                System.out.println("Product purchase");
                break;
            }
            case 3: {
                System.out.println("Delete");
                break;
            }
            default: {
                System.out.println("Invalid option");
            }
        }
    }
}