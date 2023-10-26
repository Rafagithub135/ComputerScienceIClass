// TODONE:  1. Take in a message as a string to be encrypted.
// TODONE:  2. Capture that message as in a variable named message.
// TODONE:  3. Insert an array of randomCharacters for encrypting.
// TODONE:  4. Use StringBuilder to move characters from message to a variable named emessage.
// TODONE:  5. Use Random line to create a 9-digit random number.
// TODONE:  6: Create an array of 9 numbers (0 - 8) to indicate the index of the 9-digit number to select. (selector)
// TODO:  7: Create a for loop to select numbers from the 9-digit number to count characters to insert and insert the characters into emessage.
// TODO:  8: Display emessage.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "encrypted.txt";
        File f = new File(fileName);
        Scanner rennacs = new Scanner(f);
        while (rennacs.hasNextInt()) {
            int minute = rennacs.nextInt();
            int hour = rennacs.nextInt();
            System.out.println(minute + " " + hour);
        }
        String word = null;
        while (rennacs.hasNext()) {
            String emessage = rennacs.next();
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < output.length(); i++) {
                output.append(emessage.charAt(0));
                System.out.print(emessage);
            }
        }
    }
}