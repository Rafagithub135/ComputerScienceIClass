import java.util.Scanner;

public class TimesTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see its times table: ");
        int num = input.nextInt();
        for (int i = 0; i <= 25; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
