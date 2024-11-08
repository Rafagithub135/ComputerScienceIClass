import java.io.*;
import java.util.*;

public class RalphMcCloskeyAssignment6 {
    public static void main(String[] args) throws IOException {
        String fileName = "numbers.txt";
        File f = new File(fileName);
        Scanner input = new Scanner(f);
        int sum = 0;
        int count = 0;
        int max = 0;
        int min = 0;
        double average;
        if (input.hasNextInt()) {
            int num = input.nextInt();
            sum += num;
            count++;
            max = num;
            min = num;
        }
        while (input.hasNext()) {
            int num = input.nextInt();
            sum += num;
            count++;
            if (max < num) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        PrintWriter output = new PrintWriter("output.txt");
        output.println("The sum of all the numbers is:  " + sum);
        output.println("The total number of iterations (count) is:  " + count);
        output.println("The biggest number is:  " + max);
        output.println("The smallest number is:  " + min);
        average = (double) sum / count;
        output.printf("The average of all the numbers is:  " + "%.4f", average);
        output.close();
        System.out.println("The sum of all the numbers is:  " + sum);
        System.out.println("The total number of iterations (count) is:  " + count);
        System.out.println("The biggest number is:  " + max);
        System.out.println("The smallest number is:  " + min);
        System.out.printf("The average of all the numbers is: " + "%.2f", average);
    }
}