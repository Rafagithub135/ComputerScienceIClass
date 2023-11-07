import java.util.*;

public class RalphMcCloskeyAssignment7 {
    public static void main(String[] args) {
        System.out.println("What would you like to print:  ");
        System.out.println("Stars or Lines?");
        Scanner scan = new Scanner(System.in);
        String response = scan.next();
        if (response.equalsIgnoreCase("Stars")) {
            stars();
        } else if (response.equalsIgnoreCase("Lines")) {
            lines();
        }
    }

    public static void stars() {
        System.out.println("How many stars should print?");
        Scanner scan = new Scanner(System.in);
        int numStars = scan.nextInt();
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
    }

    public static void lines() {
        System.out.println("How many pairs of lines should print?");
        Scanner scan = new Scanner(System.in);
        int numPairs = scan.nextInt();
        for (int i = 0; i < numPairs; i++) {
            System.out.print("||");
        }
    }

    public static void TriplePlus() {
        System.out.println("+++");
    }

    public static void ASeries() {
        System.out.println("A");
        System.out.println("AA");
        System.out.println("AAA");
    }

    public static void BSeries() {
        System.out.println("BBB");
        System.out.println("BB");
        System.out.println("B");
    }
}