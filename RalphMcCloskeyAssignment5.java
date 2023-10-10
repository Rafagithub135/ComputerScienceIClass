import java.text.NumberFormat;
import java.util.Scanner;

public class RalphMcCloskeyAssignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double subTotal = 0;
        String[] menuFoodItems = {"Pizza", "Burger", "Hot Dog", "Fries", "Salad", "Cheesesteak", "Chicken Sandwich", "Chicken Nuggets", "Pasta", "Soup"};
        String[] menuDrinkItems = {"Water", "Soda", "Beer", "Wine", "Coffee", "Tea", "Milk", "Juice", "Lemonade", "Iced Tea"};
        double[] menuFoodPrices = {15.99, 8.99, 6.99, 1.99, 8.99, 13.99, 10.99, 7.99, 10.99, 7.99};
        double[] menuDrinkPrices = {0.00, 4.99, 5.99, 5.99, 1.99, 1.99, .99, 2.99, 2.99, 2.99};
        System.out.println("Welcome to the Philly Steakhouse Restaurant!");
        System.out.println("Would you like to place an order? (Y/N)");
        String order = input.next();
        while (order.equalsIgnoreCase("Y")) {
            System.out.println("Please choose an item from our menu:");
            System.out.println("Food Items:");
            for (int i = 0; i < menuFoodItems.length; i++) {
                System.out.println(menuFoodItems[i] + " - $" + menuFoodPrices[i]);
            }
            System.out.println("Drink Items:");
            for (int i = 0; i < menuDrinkItems.length; i++) {
                System.out.println(menuDrinkItems[i] + " - $" + menuDrinkPrices[i]);
            }
            System.out.println("Please enter the food item you would like to order:");
            String foodItem = input.next();
            if (foodItem.equalsIgnoreCase("Pizza")) {
                subTotal = subTotal += menuFoodPrices[0];
            } else if (foodItem.equalsIgnoreCase("Burger")) {
                subTotal = subTotal += menuFoodPrices[1];
            } else if (foodItem.equalsIgnoreCase("Hot Dog")) {
                subTotal = subTotal += menuFoodPrices[2];
            } else if (foodItem.equalsIgnoreCase("Fries")) {
                subTotal = subTotal += menuFoodPrices[3];
            } else if (foodItem.equalsIgnoreCase("Salad")) {
                subTotal = subTotal += menuFoodPrices[4];
            } else if (foodItem.equalsIgnoreCase("Cheesesteak")) {
                subTotal = subTotal += menuFoodPrices[5];
            } else if (foodItem.equalsIgnoreCase("Chicken Sandwich")) {
                subTotal = subTotal += menuFoodPrices[6];
            } else if (foodItem.equalsIgnoreCase("Chicken Nuggets")) {
                subTotal = subTotal += menuFoodPrices[7];
            } else if (foodItem.equalsIgnoreCase("Pasta")) {
                subTotal = subTotal += menuFoodPrices[8];
            } else if (foodItem.equalsIgnoreCase("Soup")) {
                subTotal = subTotal += menuFoodPrices[9];
            } else {
                System.out.println("You have entered an invalid food item.  Would you like to order something else? (Y/N)");
            }
            System.out.println(" ");
            System.out.println("Please enter the drink item you would like to order:");
            String drinkItem = input.next();
            if (drinkItem.equalsIgnoreCase("Water")) {
                subTotal = subTotal += menuDrinkPrices[0];
            } else if (drinkItem.equalsIgnoreCase("Soda")) {
            } else if (drinkItem.equalsIgnoreCase("Beer")) {
                subTotal = subTotal += menuDrinkPrices[2];
            } else if (drinkItem.equalsIgnoreCase("Wine")) {
                subTotal = subTotal += menuDrinkPrices[3];
            } else if (drinkItem.equalsIgnoreCase("Coffee")) {
                subTotal = subTotal += menuDrinkPrices[4];
            } else if (drinkItem.equalsIgnoreCase("Tea")) {
                subTotal = subTotal += menuDrinkPrices[5];
            } else if (drinkItem.equalsIgnoreCase("Milk")) {
                subTotal = subTotal += menuDrinkPrices[6];
            } else if (drinkItem.equalsIgnoreCase("Juice")) {
                subTotal = subTotal += menuDrinkPrices[7];
            } else if (drinkItem.equalsIgnoreCase("Lemonade")) {
                subTotal = subTotal += menuDrinkPrices[8];
            } else if (drinkItem.equalsIgnoreCase("Iced Tea")) {
                subTotal = subTotal += menuDrinkPrices[9];
            } else {
                System.out.println("You have entered an invalid drink item.  Would you like to order something else? (Y/N)");
            }
        }
//        totalBill();
    }
//    public static void totalBill {
//        System.out.println("Your subtotal is: ");
//        System.out.println("Your total tax is:  ");
//        System.out.println("Your total is:      ");
//    }
}