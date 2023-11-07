import java.util.*;
public class StarsOrLinesHowMany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to print: ");
        System.out.println("Stars or Lines?");
        String response = scan.next();
        if (response.equalsIgnoreCase("Stars")) {
            stars();
        } else if (response.equalsIgnoreCase("Lines")) {
            lines();
        }
    }
    public static void stars() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many stars would you like to print?");
    int numStars = scan.nextInt();
    for (int i = 0; i < numStars; i++) {
        System.out.print("*");
    }
    }
    public static void lines() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pairs of lines would you like to print?");
        int numLines = scan.nextInt();
        for (int i = 0; i < numLines; i++) {
            System.out.print("||");
        }
    }
}
