import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        int price;
        int stock;
        int total = 0;
        int payment;
        int continueChoice;

        int chipsStock = 15;
        int chocolateStock = 15;
        int juiceStock = 15;
        int proteinbarStock = 15;
        int biscuitStock = 15;

        System.out.println("===== VENDING MACHINE =====");
      for (int i = 1; i <= 10; i++) {

            System.out.println("===== MENU ====="); 
            System.out.println("1. Chips - Rs. 20 (Stock: " + chipsStock + ")");
            System.out.println("2. Chocolate - Rs. 30 (Stock: " + chocolateStock + ")");
            System.out.println("3. Juice - Rs. 40 (Stock: " + juiceStock + ")");
            System.out.println("4. Protein Bar - Rs. 70 (Stock: " + proteinbarStock + ")");
            System.out.println("5. Biscuit - Rs. 25 (Stock: " + biscuitStock + ")");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            price = 0;
            stock = 0;
