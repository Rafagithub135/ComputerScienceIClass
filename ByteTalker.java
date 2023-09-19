import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ByteTalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(java.time.LocalDateTime.now());
        System.out.println("What message would you like to encrypt?");
        String message = scanner.nextLine();
        System.out.println(message);
    }
}
