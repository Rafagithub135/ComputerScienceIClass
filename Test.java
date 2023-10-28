import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "encrypted.txt";
        File f = new File(fileName);
        Scanner rennacs = new Scanner(f);
        int hour;
        int minute;
        while (rennacs.hasNextInt()) {
            minute = rennacs.nextInt();
            hour = rennacs.nextInt();
            System.out.println(minute + " " + hour);
            PrintWriter time = new PrintWriter("decrypted.txt");
            time.println(minute + " " + hour);
            time.close();
        }
        int count = 1;
        while (rennacs.hasNext()) {
            String decodedMessage = rennacs.next();
            PrintWriter output = new PrintWriter("decrypted.txt");
            output.println("Message " + count + ":  " + decodedMessage);
            output.close();
            count++;
        }
//        StringBuilder decoded = new StringBuilder();
//        for (int i = 0; i < decoded.length(); i++) {
//            decoded.append(decoded.charAt(0));
//            System.out.print(decoded);
//        }
//        String emessage = rennacs.next();
//        StringBuilder output = new StringBuilder();
//        for (int i = 0; i < output.length(); i++) {
//            output.append(emessage.charAt(0));
//            System.out.print(emessage);
//        }
    }
}