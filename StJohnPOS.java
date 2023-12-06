import java.text.NumberFormat;

/**
 * This class implements a Food Truck with the following menu:
 * - Coffee
 * - Soda
 * - Bagel
 * - Sandwich
 * - Chips
 */
public class StJohnPOS {
    /**
     * Class Constants:
     * These are static, final values - meaning they will remain
     * unchanged for any instance of the FoodTruck class
     */
// Beginning inventory of menu items
    private static final int BUDWEISER_CANS_STARTING_INVENTORY = 30;
    private static final int MILLER_LITE_CANS_STARTING_INVENTORY = 30;
    private static final int MILLER_LITE_BOTTLES_STARTING_INVENTORY = 60;
    private static final int COORS_LIGHT_CANS_STARTING_INVENTORY = 75;
    private static final int COORS_LIGHT_BOTTLES_STARTING_INVENTORY = 75;
    private static final int CORONA_BOTTLES_STARTING_INVENTORY = 30;
    private static final int HEINEKEN_BOTTLES_STARTING_INVENTORY = 30;
    private static final int ANGRY_ORCHARD_BOTTLES_STARTING_INVENTORY = 30;
    private static final int ANGRY_ORCHARD_CANS_STARTING_INVENTORY = 0;
    private static final int TWISTED_TEA_BOTTLES_STARTING_INVENTORY = 24;
    private static final int YUENGLING_STARTING_INVENTORY = 10;
    // Menu item prices
    public static final double BUDWEISER_PRICE = 2.5;
    public static final double MILLER_LITE_CANS_PRICE = 2.5;
    public static final double MILLER_LITE_BOTTLES_PRICE = 3;
    public static final double COORS_LIGHT_CANS_PRICE = 2.5;
    public static final double COORS_LIGHT_BOTTLES_PRICE = 3;
    public static final double CORONA_BOTTLES_PRICE = 3.5;
    public static final double HEINEKEN_BOTTLES_PRICE = 3.5;
    public static final double ANGRY_ORCHARD_BOTTLES_PRICE = 4;
    public static final double ANGRY_ORCHARD_CANS_PRICE = 3;
    public static final double TWISTED_TEA_BOTTLES_PRICE = 3.5;
    public static final double YUENGLING_PRICE = 3;
    // Tax rate
    public static final double TAXRATE = 0.00;
    // Currency formatter
    private static final NumberFormat FORMATTER =
            NumberFormat.getCurrencyInstance();
    /**
     * Class Fields:
     * These are non-static instance variables
     * These fields are initialized with a value
     * in the constructor. The field values may change
     * throughout the life of the instance.
     */
// Remaining inventory
    private int budweiserRemaining;
    private int millerLiteCansRemaining;
    private int millerLiteBottlesRemaining;
    private int coorsLightCansRemaining;
    private int coorsLightBottlesRemaining;
    private int corona_bottlesRemaining;
    private int heineken_bottlesRemaining;
    private int angryOrchardBottlesRemaining;
    private int angryOrchardCansRemaining;
    private int twistedTeaBottlesRemaining;
    private int yuenglingRemaining;
    // Order counters
    private int fulfilledOrders;
    private int unfulfilledOrders;
    // Gross Revenue
    private double revenue;

    /**
     * Constructor
     */
    public StJohnPOS() {
        budweiserRemaining = BUDWEISER_CANS_STARTING_INVENTORY;
        millerLiteCansRemaining = MILLER_LITE_CANS_STARTING_INVENTORY;
        millerLiteBottlesRemaining = MILLER_LITE_BOTTLES_STARTING_INVENTORY;
        coorsLightCansRemaining = COORS_LIGHT_CANS_STARTING_INVENTORY;
        coorsLightBottlesRemaining = COORS_LIGHT_BOTTLES_STARTING_INVENTORY;
        corona_bottlesRemaining = CORONA_BOTTLES_STARTING_INVENTORY;
        heineken_bottlesRemaining = HEINEKEN_BOTTLES_STARTING_INVENTORY;
        angryOrchardBottlesRemaining = ANGRY_ORCHARD_BOTTLES_STARTING_INVENTORY;
        angryOrchardCansRemaining = ANGRY_ORCHARD_CANS_STARTING_INVENTORY;
        twistedTeaBottlesRemaining = TWISTED_TEA_BOTTLES_STARTING_INVENTORY;
        yuenglingRemaining = YUENGLING_STARTING_INVENTORY;
        unfulfilledOrders = 0;
        fulfilledOrders = 0;
    }

    /**
     * Instance methods:
     * These methods ARE tied to an instance of a class. This means
     * these methods operate by accessing the state of a specific
     * instance of FoodTruck.
     */
    public String toString() {
        return "Filled Orders = " + fulfilledOrders +
                ", Unfulfilled Orders = " + unfulfilledOrders +
                ", Revenue = " + FORMATTER.format(revenue);
    }

    //TO DO: Implement this method
//    public void order(int numBudweiser, int numMillerLiteCans, int numMillerLiteBottles,
//                      int numCoorsLightCans, int numCoorsLightBottles, int numCoronaBottles, numHeinekenBottles, numAngryOrchardBottles, numAngryOrchardCans, numTwistedTeaBottles, numYuengling) {
//        if (numBudweiser > budweiserRemaining || numMillerLiteCans > millerLiteCansRemaining || numMillerLiteBottles > millerLiteBottlesRemaining || numCoorsLightCans > coorsLightCansRemaining || numCoorsLightBottles > coorsLightBottlesRemaining || numCoronaBottles > corona_bottlesRemaining || numHeinekenBottles > heineken_bottlesRemaining || numAngryOrchardBottles > angryOrchardBottlesRemaining || numAngryOrchardCans > angryOrchardCansRemaining || numTwistedTeaBottles > twistedTeaBottlesRemaining || numYuengling > yuenglingRemaining) {
//            unfulfilledOrders++;
//        } else {
//            budweiserRemaining -= numBudweiser;
//            millerLiteCansRemaining -= numMillerLiteCans;
//            millerLiteBottlesRemaining -= numMillerLiteBottles;
//            coorsLightCansRemaining -= numCoorsLightCans;
//            coorsLightBottlesRemaining -= numCoorsLightBottles;
//            corona_bottlesRemaining -= numCoronaBottles;
//            heineken_bottlesRemaining -= numHeinekenBottles;
//            angryOrchardBottlesRemaining -= numAngryOrchardBottles;
//            angryOrchardCansRemaining -= numAngryOrchardCans;
//            twistedTeaBottlesRemaining -= numTwistedTeaBottles;
//            yuenglingRemaining -= numYuengling;
//            fulfilledOrders++;
//            revenue += (numBudweiser * BUDWEISER_PRICE) + (numMillerLiteCans * MILLER_LITE_CANS_PRICE) + (numMillerLiteBottles * MILLER_LITE_BOTTLES_PRICE) + (numCoorsLightCans * COORS_LIGHT_CANS_PRICE) + (numCoorsLightBottles * COORS_LIGHT_BOTTLES_PRICE) + (numCoronaBottles * CORONA_BOTTLES_PRICE) + (numHeinekenBottles * HEINEKEN_BOTTLES_PRICE) + (numAngryOrchardBottles * ANGRY_ORCHARD_BOTTLES_PRICE) + (numAngryOrchardCans * ANGRY_ORCHARD_CANS_PRICE) + (numTwistedTeaBottles * TWISTED_TEA_BOTTLES_PRICE) + (numYuengling * YUENGLING_PRICE);
        }

// This method will:
// - Checks the current inventory to see if all items are available
// - IF the entire order is available:
// - deduct the ordered items from remaining inventory
// - increment the fulfilledOrders field
// - add the cost of the order to the revenue field
// (cost is the menu item price * the menu item count)
// - IF there is not sufficient inventory to fulfill order:
// - increment the unfulfilledOrders field
// - leave remaining inventory and revenue unchanged
//    }

    /**
     * Static Methods:
     * These are methods that are not tied to a specific instance.
     * These are public methods, therefore they can be used internally
     * and externally in client code.
     */
// This method will return a formatted String representing a receipt.
//    public static String formatReceipt(double subtotal) {
//        double tax = subtotal * TAXRATE;
//        double total = subtotal + tax;
//        int space = 12;
//        return String.format("%-" + space + "s", "Subtotal:") +
//                FORMATTER.format(subtotal) + "\n" +
//                String.format("%-" + space + "s", "Tax:") + FORMATTER.format(tax) +
//                "\n" +
//                String.format("%-" + space + "s", "Total:") +
//                FORMATTER.format(total) + "\n";
//    }
//
//    //This method will return a message stating the order cannot be fulfilled.
//    public static String declineOrderMessage() {
//        return "Unfortunately, we cannot fulfill your order. " +
//                "\nHave a nice day!";
//    }
//
//    //This method will return the menu
//    public static String menu() {
//        int space = 12;
//        return String.format("%-" + space + "s", "Budweiser Can:") +
//                FORMATTER.format(BUDWEISER_PRICE) + "\n" +
//                String.format("%-" + space + "s", "Miller Lite Can:") +
//                FORMATTER.format(MILLER_LITE_CANS_PRICE) + "\n" +
//                String.format("%-" + space + "s", "Miller Lite Bottle:") +
//                FORMATTER.format(MILLER_LITE_BOTTLES_PRICE) + "\n" +
//                String.format("%-" + space + "s", "Coors Light Can:") +
//                FORMATTER.format(COORS_LIGHT_CANS_PRICE) + "\n" +
//                String.format("%-" + space + "s", "Coors Light Bottle:") +
//                FORMATTER.format(COORS_LIGHT_BOTTLES_PRICE) + "\n";
//                String.format("%-" + space + "s", "Corona:") +
//                FORMATTER.format(CORONA_BOTTLES_PRICE) + "\n";
//                String.format("%-" + space + "s", "Heineken:") +
//                FORMATTER.format(HEINEKEN_BOTTLES_PRICE) + "\n";
//                String.format("%-" + space + "s", "Angry Orchard Bottle:") +
//                FORMATTER.format(ANGRY_ORCHARD_BOTTLES_PRICE) + "\n";
//                String.format("%-" + space + "s", "Angry Orchard Can:") +
//                FORMATTER.format(ANGRY_ORCHARD_CANS_PRICE) + "\n";
//                String.format("%-" + space + "s", "Twisted Tea:") +
//                FORMATTER.format(TWISTED_TEA_BOTTLES_PRICE) + "\n";
//                String.format("%-" + space + "s", "Yuengling:") +
//                FORMATTER.format(YUENGLING_PRICE) + "\n";
//    }