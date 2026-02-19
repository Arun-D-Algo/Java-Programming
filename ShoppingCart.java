import java.util.Scanner;

public class ShoppingCart{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Items do you want to order : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[count];
        double[] prices = new double[count];
        int[] quantities = new int[count];

        for (int i = 0; i<count; i++){
            System.out.println("\nEnter name of the item :");
            names[i] = scanner.nextLine();
            System.out.println("\nEnter price of the item :");
            prices[i] = scanner.nextDouble();
            while (prices[i] < 0) {
                System.out.println("INVALID PRICE! Enter a valid positive price:");
                prices[i] = scanner.nextDouble();
            }

            System.out.println("\nEnter quantity of the item :");
            quantities[i] = scanner.nextInt();
            while (quantities[i] < 0) {
                System.out.println("INVALID QUANTITY! Enter a valid positive quantity:");
                quantities[i] = scanner.nextInt();
            }

scanner.nextLine();         
        }  
        double grandTotal = calculateGrandTotal(prices, quantities, count);
        DisplayCart(names, prices, quantities, count);
        System.out.println("\nThe GRAND TOTAL of the cart is :" + grandTotal);
        if(grandTotal>1000){
            System.out.println("Your Order is Eligible for FREE DELIVERY !");
        }
        scanner.close();
    }

    public static double calculateItemTotal(double price, int quantity){
        return price*quantity;
    }

    public static double calculateGrandTotal(double[] prices, int[] quantities, int count){
        double total = 0;
        for(int i=0; i<count; i++){
            total += calculateItemTotal(prices[i], quantities[i]);
        }
        return total;
    }

    public static void DisplayCart(String[] names, double[] prices, int[] quantities, int count){
        System.out.println("\n----- YOUR CART -----");
        System.out.println("Item\tPrice\tQty\tTotal");

        for (int i = 0; i < count; i++) {
            double total = calculateItemTotal(prices[i], quantities[i]);
            System.out.printf("%-10s %-10.2f %-5d %-10.2f\n",
                  names[i], prices[i], quantities[i], total);
        }
    }
}