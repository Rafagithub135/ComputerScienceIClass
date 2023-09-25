import java.util.Scanner;

public class ThinkJavaChapter3Exercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.print("What is your age?");
        int age = in.nextInt();
        System.out.printf("Hello %s, age %d", name, age);
        // If you try to enter a value with type int using %f and/or a value with type double using %d, Java will print an error message.  The types are mismatched.

    }
}
