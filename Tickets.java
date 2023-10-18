import java.util.Scanner;
public class Tickets {
    public static void main(String[] args) {
        System.out.println("You can order 1, 2, or 3 tickets.  How many tickets would you like?");
        Scanner input = new Scanner(System.in);
        int tickets = input.nextInt();
        if (tickets == 1) {
            System.out.println("Your price is $25.");
        } else if (tickets == 2) {
            System.out.println("Your price is $50.");
        } else if (tickets == 3) {
            System.out.println("Your price is $75.");
        } else {
            System.out.println("You can only order 1, 2, or 3 tickets.");
        }
    }
}