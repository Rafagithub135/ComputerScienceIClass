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