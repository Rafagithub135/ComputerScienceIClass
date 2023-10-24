import java.io.*;
import java.util.*;

public class RalphMcCloskeyAssignment6 {
    public static void main(String[] args) throws IOException {
        String fileName = "numbers.txt";
        File f = new File(fileName);
        Scanner input = new Scanner(f);
        int min = 0;
        int max = 0;
        int sum = 0;
        int average = 0;
        int count = 0;
        while (input.hasNext()) {
            System.out.println(input.next());
            sum += input.nextInt();
            if (input.nextInt() > max) {
                max = input.nextInt();
            }
            do min = input.nextInt();
            while (input.nextInt() < min); {
                min = input.nextInt();
            }
            if (count > 0) {
                average = sum / count;
            }
            count++;
            System.out.println("The total is:  " + sum);
            System.out.println("The minimum number is:  " + min);
            System.out.println("The maximum number is:  " + max);
            System.out.println("The average number is:  " + average);
            System.out.println("The total count is:  " + count);
        }
    }
}
