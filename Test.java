import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Creates the scanner object.
        Scanner scanner = new Scanner(System.in);
        // Prompts the user to enter a message to encrypt.
        System.out.println("What message would you like to encrypt?");
        // Stores the user's message in the message variable.
        String message = scanner.nextLine();
        // Creates an array of random characters for the program to insert in between each character of the message.
        String[] randomCharacters = {"a", "A", "b", "B", "c", "C", "d", "D", "e", "E", "f", "F", "g", "G", "h", "H", "i", "I", "j", "J", "k", "K", "l", "L", "m", "M", "n", "N", "o", "O", "p", "P", "q", "Q", "r", "R", "s", "S", "t", "T", "u", "U", "v", "V", "w", "W", "x", "X", "y", "Y", "z", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+"};
        // SelectorNumbers are extra numbers that will be mixed into the time code to make it harder to crack.
        StringBuilder emessage = new StringBuilder();
        // Creates an array to store the random numbers that will be used to encrypt the message.
        String[] decoder = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        // Creates a for loop to store the random numbers in the decoder array.
        String randomDecoder = "0";
        for (int i = 0; i <= 8; i++) {
            randomDecoder += decoder[(int) (Math.random() * 10)];
        }
        // Displays the decoder array.
        System.out.println(Arrays.toString(randomDecoder.toCharArray()));
        // Creates an array to select one of 5 pairs of numbers.
        int[] selector = {1, 2, 3, 4, 5};
        // For loop to print the message and the random characters.
        for (int j = 0; j < message.length(); j++) {
            // Displays a character of the message and then is supposed to display either an "1" or a "2" to indicate whether the random number of characters are related to the first number or the second.
            emessage.append(message.charAt(j));
            // Creates a variable to randomly select either the first number or the second.
            int randomSelector = selector[(int) (Math.random() * selector.length)];
            // If statement to print a "1" if the randomSelector is a 1.
            if (randomSelector == 1) {
                // Actually displays the "1" to indicate that the random characters are related to the first number.
                emessage.append("1");
                // Creates a for loop to display the random characters.  The number of random characters is equal to the first number.
//                for (int i = 1; i <= selectorNumbers[4, 5]; i++) {
//                    emessage.append(randomCharacters[(int) (Math.random() * hour)]);
            }
            // Else statement to print an "m" if the randomSelector is a 2.
//            } else {
            // Actually displays the "m" to indicate that the random characters are related to the minute.
//            emessage.append("2");
            // Creates a for loop to display the random characters.  The number of random characters is equal to the minute.
//                for (int j = 1; j <= minute; j++) {
//                    emessage.append(randomCharacters[(int) (Math.random() * minute)]);
        }
    }
        }
        // Prints the encrypted message.
//        System.out.println(emessage);
//    }
//}