// TODONE:  1. Take in a message as a string to be encrypted.
// TODONE:  2. Capture that message as in a variable named message.
// TODONE:  3. Insert an array of randomCharacters for encrypting.
// TODONE:  4. Use StringBuilder to move characters from message to a variable named emessage.
// TODONE:  5. Use Random line to create a 9-digit random number.
// TODONE:  6: Create an array of 9 numbers (0 - 8) to indicate the index of the 9-digit number to select. (selector)
// TODO:  7: Create a for loop to select numbers from the 9-digit number to count characters to insert and insert the characters into emessage.
// TODO:  8: Display emessage.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What message would you like to encrypt?");
        String message = scanner.nextLine();
//        System.out.println(message);
        String[] randomCharacters = {"a", "A", "b", "B", "c", "C", "d", "D", "e", "E", "f", "F", "g", "G", "h", "H", "i", "I", "j", "J", "k", "K", "l", "L", "m", "M", "n", "N", "o", "O", "p", "P", "q", "Q", "r", "R", "s", "S", "t", "T", "u", "U", "v", "V", "w", "W", "x", "X", "y", "Y", "z", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+"};
        StringBuilder emessage = new StringBuilder();
//        Random r = new Random();
//        int rand = r.nextInt((int) 100000000, (int) 999999999);
//        System.out.println(rand);
        int random = (int) (Math.random() * 7);
        System.out.println(random);
//        int[] selector = {0, 1, 2, 3, 4, 5, 6, 7, 8};
//        displayBinary(random);
        System.out.println(random);
//        int index1 = 0;
//        for (int i = 0; i < 2; i++) {
//            index1 = (int) (Math.random() * 9);
//        }
//        System.out.println(index1);
//        int index2 = 0;
//        for (int i = 0; i < 2; i++) {
//            index2 = (int) (Math.random() * 9);
//        }
//        System.out.println(index2);

//            int index = (int) (Math.random() * 9);
//            int number = (int) (random / Math.pow(10, index)) % 10;
//            int count = 0;
//            while (count < number) {
//                emessage.append(randomCharacters);
//                count++;
//            }
//        }
//        System.out.println(emessage);
//        public static void displayBinary ( int random) {
//            if (random > 0) {
//                displayBinary(random / 2);
//                System.out.print(random % 2);
//            }
//        }
    }
}