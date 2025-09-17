package supermarket;

import java.util.Scanner;

public class SupermarketBilling {
	
	public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);

       
        System.out.print("Enter number of different items bought: ");
        int n = bill.nextInt();

        
        String[] itemNames = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double[] subtotals = new double[n];

        double total = 0; // total before discount

        for (int i = 0; i < n; i++) {
            bill.nextLine(); 
            System.out.print("Enter item name: ");
            itemNames[i] = bill.nextLine();

            System.out.print("Enter price per unit: ");
            prices[i] = bill.nextDouble();

            System.out.print("Enter quantity: ");
            quantities[i] = bill.nextInt();

        
            subtotals[i] = prices[i] * quantities[i];
            total += subtotals[i];
        }

       
        double discount = 0;
        if (total > 50000) {
            discount = total * 0.05; // 5% discount
        }
        double finalAmount = total - discount;

        
        System.out.println("\n--- SUPERMARKET RECEIPT ---");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Subtotal");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n",
                    itemNames[i], quantities[i], prices[i], subtotals[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Grand Total: %.2f\n", total);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Amount: %.2f\n", finalAmount);
        bill.close();
    }
}
