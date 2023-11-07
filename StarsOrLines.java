import java.util.*;

public class StarsOrLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to print:  ");
        System.out.println("Stars or Lines?");
        String response = scan.next();
        if (response.equalsIgnoreCase("Stars")) {
            stars();
        } else if (response.equalsIgnoreCase("Lines")) {
            lines();
        }
    }
    public static void stars() {
        System.out.println(" ****");
        System.out.println("******");
        System.out.println(" ****");
    }
    public static void lines() {
        System.out.println(" ||||");
        System.out.println("||||||");
        System.out.println(" ||||");
    }
}
