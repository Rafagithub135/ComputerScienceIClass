import java.util.Scanner;

public class Notes919 {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(x);
        x++;
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
//        System.out.print("How old are you? ");
//        int age = scanner.nextInt();
//        System.out.println("You are " + age + " years old.");
//        System.out.print("What is your name? ");
//        String name = scanner.next();
//        System.out.println("Hello, " + name + "!");
//        int square;
//        System.out.print("Which square would you like?");
//        square = scanner.nextInt();
//            if (square > 100) {
//                System.out.println("There is no number " + square + ".  Please try again.");
//            }
//        System.out.println(name + " would like square " + square + ".");
        System.out.println("Enter two numbers:  ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The sum of your numbers is " + (num1 + num2) + ".");

    }
}
