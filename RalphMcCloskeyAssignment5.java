// TODO:  You will write an improved restaurant program. You can start by editing your Assignment #4 submission OR you can start from scratch. Your program will allow the user to continue to order as many menu items as they would like. You will do this by incorporating a loop into your program. Just like Assignment #4, your program must include input validation. This means that if the user enters an invalid option, you will let them know.

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
        System.out.println("Here is our menu:");
        System.out.println("Food Items:");
        for (int i = 0; i < menuFoodItems.length; i++) {
            System.out.println(menuFoodItems[i] + " - $" + menuFoodPrices[i]);
        }
        System.out.println("Drink Items:");
        for (int i = 0; i < menuDrinkItems.length; i++) {
            System.out.println(menuDrinkItems[i] + " - $" + menuDrinkPrices[i]);
        }
        System.out.println(" ");
        System.out.println("What would you like to order?");
        String order = input.nextLine();
        switch (order) {
            case "Pizza":
                subTotal += menuFoodPrices[0];
                break;
            case "Burger":
                subTotal += menuFoodPrices[1];
                break;
            case "Hot Dog":
                subTotal += menuFoodPrices[2];
                break;
            case "Fries":
                subTotal += menuFoodPrices[3];
                break;
            case "Salad":
                subTotal += menuFoodPrices[4];
                break;
            case "Cheesesteak":
                subTotal += menuFoodPrices[5];
                break;
            case "Chicken Sandwich":
                subTotal += menuFoodPrices[6];
                break;
            case "Chicken Nuggets":
                subTotal += menuFoodPrices[7];
                break;
            case "Pasta":
                subTotal += menuFoodPrices[8];
                break;
            case "Soup":
                subTotal += menuFoodPrices[9];
                break;
            case "Water":
                subTotal += menuDrinkPrices[0];
                break;
            case "Soda":
                subTotal += menuDrinkPrices[1];
                break;
            case "Beer":
                subTotal += menuDrinkPrices[2];
                break;
            case "Wine":
                subTotal += menuDrinkPrices[3];
                break;
            case "Coffee":
                subTotal += menuDrinkPrices[4];
                break;
            case "Tea":
                subTotal += menuDrinkPrices[5];
                break;
            case "Milk":
                subTotal += menuDrinkPrices[6];
                break;
            case "Juice":
                subTotal += menuDrinkPrices[7];
                break;
            case "Lemonade":
                subTotal += menuDrinkPrices[8];
                break;
            case "Iced Tea":
                subTotal += menuDrinkPrices[9];
                break;
        }
                System.out.println("Would you like to order another item? (Y/N)");
                String orderAgain = input.nextLine();
                if (orderAgain.equalsIgnoreCase("Y")) {
                    System.out.println("What would you like to order?");
                    order = input.nextLine();
                } else if (orderAgain.equalsIgnoreCase("N")) {
                    System.out.println(" ");
                    System.out.println("Your total is " + formatter.format(subTotal) + ".");
                    System.out.println("Thank you for your order!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
        }
    }