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
      
