import java.time.LocalDateTime;
import java.util.Scanner;

public class Test1029 {
    public static void main(String[] args) {
        // Creates the scanner object.
        Scanner scanner = new Scanner(System.in);
        // Prompts the user to enter a message to encrypt.
        System.out.println("What message would you like to encrypt?");
        // Stores the user's message in the message variable.
        String message = scanner.nextLine();
        // Creates an array of random characters for the program to insert in between each character of the message.
        String[] randomCharacters = {"a", "A", "b", "B", "c", "C", "d", "D", "e", "E", "f", "F", "g", "G", "H", "i", "I", "j", "J", "k", "K", "l", "L", "M", "n", "N", "o", "O", "p", "P", "q", "Q", "r", "R", "s", "S", "t", "T", "u", "U", "v", "V", "w", "W", "x", "X", "y", "Y", "z", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "_", "=", "{", "}", "[", "]", "/", ">", "?", "<", "~", "`", "|", ";", ":", "'", "\"", "\\"};
        // Creates a variable to store the current time.
        LocalDateTime currentTime = LocalDateTime.now();
        // Creates a variable to store just the hour.
        int hour = currentTime.getHour();
        // If statement to change midnight from 0 to 24 so the encrypted message will be longer.
        if (hour == 0) {
            hour = 24;
        }
        // Creates a variable to store just the minute.
        int minute = currentTime.getMinute();
        // Displays the current time of the message so the encrypted message can be decrypted.
        System.out.println(minute + " " + hour);
        StringBuilder emessage = new StringBuilder();
        // Creates an array to select either the hour or the minute.
        int[] selector = {1, 2};
        // For loop to print the message and the random characters.
        for (int i = 0; i < message.length(); i++) {
            // Displays a character of the message and then is supposed to display either an "h" or an "m" to indicate whether the random number of characters are related to the hour or the minute.
            emessage.append(message.charAt(i));
            // Creates a variable to randomly select either the hour or the minute.
            int randomSelector = selector[(int) (Math.random() * selector.length)];
            // If statement to print an "h" if the randomSelector is a 1.
            if (randomSelector == 1) {
                // Actually displays the "h" to indicate that the random characters are related to the hour.
                emessage.append("h");
                // Creates a for loop to display the random characters.  The number of random characters is equal to the hour.
                for (int j = 1; j <= hour; j++) {
                    emessage.append(randomCharacters[(int) (Math.random() * hour)]);
                }
                // Else statement to print an "m" if the randomSelector is a 2.
            } else {
                // Actually displays the "m" to indicate that the random characters are related to the minute.
                emessage.append("m");
                // Creates a for loop to display the random characters.  The number of random characters is equal to the minute.
                for (int j = 1; j <= minute; j++) {
                    emessage.append(randomCharacters[(int) (Math.random() * minute)]);
                }
            }
        }
        System.out.println(emessage);
//        for (int j = 0; j < emessage.length(); j++) {
//            System.out.println(emessage.charAt(j));
//            if (emessage.charAt(j) == "h") {
//                emessage.replace(j, j, "");
//                emessage.replace(j, j + hour, "");
//            }
//            if (emessage.charAt(j) == "m") {
//                emessage.replace(j, j, "");
//                emessage.replace(j, j + minute, "");
//            }
        }
    }
//}
