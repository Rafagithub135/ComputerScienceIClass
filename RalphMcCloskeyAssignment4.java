import java.util.Scanner;
import java.text.NumberFormat;

public class RalphMcCloskeyAssignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double subTotal = 0;
        String[] menuFoodItems = {"Pizza", "Burger", "Hot Dog", "Fries", "Salad", "Cheesesteak", "Chicken Sandwich", "Chicken Nuggets", "Pasta", "Soup"};
        String[] menuDrinkItems = {"Water", "Soda", "Beer", "Wine", "Coffee", "Tea", "Milk", "Juice", "Lemonade", "Iced Tea"};
        double[] menuFoodPrices = {15.99, 8.99, 6.99, 1.99, 8.99, 13.99, 10.99, 7.99, 10.99, 7.99};
        double[] menuDrinkPrices = {0.00, 4.99, 5.99, 5.99, 1.99, 1.99, .99, 2.99, 2.99, 2.99};
        System.out.println("Welcome to the Philly Steakhouse Restaurant!");
        System.out.println("Please choose your dinner item from our menu:");
        System.out.println("Food Items:");
        for (int i = 0; i < menuFoodItems.length; i++) {
            System.out.println(menuFoodItems[i] + " - $" + menuFoodPrices[i]);
        }
        System.out.println("Drink Items:");
        for (int i = 0; i < menuDrinkItems.length; i++) {
            System.out.println(menuDrinkItems[i] + " - $" + menuDrinkPrices[i]);
        }
        System.out.println("Please enter the food item you would like to order:");
        String foodItem = input.nextLine();
        if (foodItem.equals("Pizza")) {
            subTotal = subTotal += menuFoodPrices[0];
        } else if (foodItem.equals("Burger")) {
            subTotal = subTotal += menuFoodPrices[1];
        } else if (foodItem.equals("Hot Dog")) {
            subTotal = subTotal += menuFoodPrices[2];
        } else if (foodItem.equals("Fries")) {
            subTotal = subTotal += menuFoodPrices[3];
        } else if (foodItem.equals("Salad")) {
            subTotal = subTotal += menuFoodPrices[4];
        } else if (foodItem.equals("Cheesesteak")) {
            subTotal = subTotal += menuFoodPrices[5];
        } else if (foodItem.equals("Chicken Sandwich")) {
            subTotal = subTotal += menuFoodPrices[6];
        } else if (foodItem.equals("Chicken Nuggets")) {
            subTotal = subTotal += menuFoodPrices[7];
        } else if (foodItem.equals("Pasta")) {
            subTotal = subTotal += menuFoodPrices[8];
        } else if (foodItem.equals("Soup")) {
            subTotal = subTotal += menuFoodPrices[9];
        } else {
            System.out.println("You have entered an invalid food item.  Please try again later.");
            System.exit(0);
        }
        System.out.println(" ");
        System.out.println("Please enter the drink item you would like to order:");
        String drinkItem = input.nextLine();
        if (drinkItem.equals("Water")) {
            subTotal = subTotal += menuDrinkPrices[0];
        } else if (drinkItem.equals("Soda")) {
            subTotal = subTotal += menuDrinkPrices[1];
        } else if (drinkItem.equals("Beer")) {
            subTotal = subTotal += menuDrinkPrices[2];
        } else if (drinkItem.equals("Wine")) {
            subTotal = subTotal += menuDrinkPrices[3];
        } else if (drinkItem.equals("Coffee")) {
            subTotal = subTotal += menuDrinkPrices[4];
        } else if (drinkItem.equals("Tea")) {
            subTotal = subTotal += menuDrinkPrices[5];
        } else if (drinkItem.equals("Milk")) {
            subTotal = subTotal += menuDrinkPrices[6];
        } else if (drinkItem.equals("Juice")) {
            subTotal = subTotal += menuDrinkPrices[7];
        } else if (drinkItem.equals("Lemonade")) {
            subTotal = subTotal += menuDrinkPrices[8];
        } else if (drinkItem.equals("Iced Tea")) {
            subTotal = subTotal += menuDrinkPrices[9];
        } else {
            System.out.println("You have entered an invalid drink item.  Please try again later.");
            System.exit(0);
        }
        System.out.println(" ");
        System.out.println("You have ordered " + foodItem + " and " + drinkItem + ".  Is this order correct? (Y/N)");
        String orderCorrect = input.next();
        System.out.println(" ");
        String billAsCurrency = formatter.format(subTotal);
        if (orderCorrect.equals("Y")) {
            System.out.println("Your order has been placed.\nYour subtotal is:  $" + subTotal);
            double tax = subTotal * 0.06;
            String taxAsCurrency = formatter.format(tax);
            System.out.println("Tax:  $" + String.format("%.2f", tax));
            System.out.println("Total:  $" + String.format("%.2f", subTotal + tax));
        } else {
            System.out.println("Your order has been cancelled.  Please try again.");
        }
    }
}