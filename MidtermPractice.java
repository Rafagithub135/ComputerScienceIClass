import java.util.Scanner;

public class MidtermPractice {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your name is " + name);
    }
}
