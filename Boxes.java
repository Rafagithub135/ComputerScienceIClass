import java.util.*;

public class Boxes {
    public static void main(String[] args) {
        // Prints a rectangle 4 x 10 stars.
        printStars();
        System.out.println();
        //  Prints a rectangle 5 x 20 lines.
        printLines();
        System.out.println();
        // Prints a rectangle 7 x 6 a's.
        printAs();
    }

    public static void printStars() {
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 10; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printLines() {
        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 20; y++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static void printAs() {
        for (int i = 0; i < 7; i++) {
            for (int y = 0; y < 6; y++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
