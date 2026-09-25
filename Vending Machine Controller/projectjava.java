import java.util.Scanner;

public class projectjava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        int price = 0;
        int total;

        System.out.println("===== VENDING MACHINE =====");

        System.out.println("1. Chips - Rs. 20");
        System.out.println("2. Chocolate - Rs. 30");
        System.out.println("3. Juice - Rs. 40");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        switch (choice) {

            case 1:
                price = 20;
                System.out.println("You selected Chips");
                break;

            case 2:
                price = 30;
                System.out.println("You selected Chocolate");
                break;

            case 3:
                price = 40;
                System.out.println("You selected Juice");
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        total = price * quantity;

        System.out.println("Total Amount = Rs. " + total);
        System.out.println("Thank you for using the Vending Machine!");

        sc.close();
    }
}