import java.text.NumberFormat;
import java.util.Scanner;

public class RalphMcCloskeyAssignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double subTotal = 0;
        String[] menuItems = {"Pizza", "Burger", "Hot Dog", "Fries", "Salad", "Cheesesteak", "Chicken Sandwich", "Chicken Nuggets", "Pasta", "Soup", "Water", "Soda", "Beer", "Wine", "Coffee", "Tea", "Milk", "Juice", "Lemonade", "Iced Tea"};
        double[] menuPrices = {15.99, 8.99, 6.99, 1.99, 8.99, 13.99, 10.99, 7.99, 10.99, 7.99, 0.00, 4.99, 5.99, 5.99, 1.99, 1.99, .99, 2.99, 2.99, 2.99};
        System.out.println("Welcome to the Philly Steakhouse Restaurant!");
        System.out.println("Here is our menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i] + " - $" + menuPrices[i]);
        }
        System.out.println("Would you like to place an order? (Y/N)");
        String order = input.nextLine();
        while (order.equalsIgnoreCase("Y")) {
            System.out.println("Enter the item you would like to order, or 'Done' to finish your order.");
            String option = input.nextLine();
            switch (option.toLowerCase()) {
                case "pizza":
                    subTotal += menuPrices[0];
                    break;
                case "burger":
                    subTotal += menuPrices[1];
                    break;
                case "hot dog":
                    subTotal += menuPrices[2];
                    break;
                case "fries":
                    subTotal += menuPrices[3];
                    break;
                case "salad":
                    subTotal += menuPrices[4];
                    break;
                case "cheesesteak":
                    subTotal += menuPrices[5];
                    break;
                case "chicken sandwich":
                    subTotal += menuPrices[6];
                    break;
                case "chicken nuggets":
                    subTotal += menuPrices[7];
                    break;
                case "pasta":
                    subTotal += menuPrices[8];
                    break;
                case "soup":
                    subTotal += menuPrices[9];
                    break;
                case "water":
                    subTotal += menuPrices[10];
                    break;
                case "soda":
                    subTotal += menuPrices[11];
                    break;
                case "beer":
                    subTotal += menuPrices[12];
                    break;
                case "wine":
                    subTotal += menuPrices[13];
                    break;
                case "coffee":
                    subTotal += menuPrices[14];
                    break;
                case "tea":
                    subTotal += menuPrices[15];
                    break;
                case "milk":
                    subTotal += menuPrices[16];
                    break;
                case "juice":
                    subTotal += menuPrices[17];
                    break;
                case "lemonade":
                    subTotal += menuPrices[18];
                    break;
                case "iced tea":
                    subTotal += menuPrices[19];
                    break;
                case "done":
                    order = "n";
                    break;
                default:
                    System.out.println("You have entered an invalid food item.  Would you like to order something else? (Y/N)");
                    order = input.nextLine();
                    break;
            }
            double tax = subTotal * .06;
            String taxAsCurrency = formatter.format(tax);
            String totalAsCurrency = formatter.format(subTotal + tax);
            System.out.println("Your subtotal is:      $" + String.format("%.2f", subTotal));
            System.out.println("Your tax is:            " + taxAsCurrency);
            System.out.println("Your total bill is:    " + totalAsCurrency);
        }
    }
}