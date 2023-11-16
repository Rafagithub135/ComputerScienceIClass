import java.util.*;

public class Precalculus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to do a calculation? (Y/N)");
        String calculation = input.nextLine();
        while (calculation.equalsIgnoreCase("y")) {
            System.out.println("What type of calculation would you like to do?");
            String option = input.nextLine();
            switch (option.toLowerCase()) {
                case "quadratic":
                    quadratic();
                    break;
                case "quadratic formula":
                    quadraticFormula();
                    break;
                    case "absolute value":
                    absoluteValue();
                    break;
                    case "done":
                    System.out.println("Thank you for using the precalculus program.");
                    System.exit(0);
            }
        }
    }
    public static void quadratic() {
        Scanner quadratic = new Scanner(System.in);
        System.out.println("Please enter the value of the first variable:  ");
        double a = quadratic.nextDouble();
        System.out.println("Please enter the value of the second variable:  ");
        double b = quadratic.nextDouble();
        System.out.println("Please enter the value of the third variable:  ");
        double c = quadratic.nextDouble();
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("The value of x1 is " + x1);
        System.out.println("The value of x2 is " + x2);
    }
    public static void quadraticFormula() {
        Scanner quadraticFormula = new Scanner(System.in);
        System.out.println("Please enter the value of the first variable:  ");
        double a = quadraticFormula.nextDouble();
        System.out.println("Please enter the value of the second variable:  ");
        double b = quadraticFormula.nextDouble();
        System.out.println("Please enter the value of the third variable:  ");
        double c = quadraticFormula.nextDouble();
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("The value of x1 is " + x1);
        System.out.println("The value of x2 is " + x2);
    }
    public static void absoluteValue() {
        Scanner absoluteValue = new Scanner(System.in);
        System.out.println("Please enter the value of the variable:  ");
        double a = absoluteValue.nextDouble();
        if (a < 0) {
            System.out.println("The absolute value of " + a + " is " + -a);
        } else {
            System.out.println("The absolute value of " + a + " is " + a);
        }
    }
}
