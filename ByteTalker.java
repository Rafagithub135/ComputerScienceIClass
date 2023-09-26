import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class ByteTalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(java.time.LocalDateTime.now());
        System.out.println("What message would you like to encrypt?");
        String message = scanner.nextLine();
        System.out.println(message);
        String[] randomCharacters = {"a", "A", "b", "B", "c", "C", "d", "D", "e", "E", "f", "F", "g", "G", "h", "H", "i", "I", "j", "J", "k", "K", "l", "L", "m", "M", "n", "N", "o", "O", "p", "P", "q", "Q", "r", "R", "s", "S", "t", "T", "u", "U", "v", "V", "w", "W", "x", "X", "y", "Y", "z", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+"};
        LocalDateTime currentTime = LocalDateTime.now();
        printTime();
        int[] selector = {1, 2};
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            int randomSelector = selector[(int) (Math.random() * selector.length)];
            if (randomSelector == 1) {
                System.out.print("h");
                int randomHour = (int) (currentTime.getHour());
                for (int j = 0; j < randomHour; j++) {
                    System.out.print(randomCharacters[(int) (Math.random() * randomHour)]);
                }
            } else {
                System.out.print("m");
                int randomMinute = (int) (Math.random() * currentTime.getMinute());
                for (int j = 0; j < randomMinute; j++) {
                    System.out.print(randomCharacters[(int) (Math.random() * randomMinute)]);
                }
            }
        }
    }

    public static void printTime() {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        if (hour > 12) {
            System.out.print(currentTime.getHour() - 12);
        } else {
            System.out.print(currentTime.getHour());
        }
        System.out.print(":");
        System.out.println(minute);
    }
}
// TODO:  After the selector has been printed, print the number of random characters from the randomCharacters array that corresponds to the current hour or minute.  For example, if the current hour is 3, print 3 characters randomly chosen from the randomCharacters array.  If the current minute is 15, print 15 characters randomly chosen from the randomCharacters array.
// TODO:  Then, remove the whitespace from the printed message.
