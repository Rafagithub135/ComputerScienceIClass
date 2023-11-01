import java.io.*;
import java.util.*;

public class Test1031 {
    public static void main(String[] args) throws IOException {
        Scanner test = new Scanner(System.in);
        System.out.println("Enter the numbers you want to calculate:  ");
        while (test.hasNextInt()) {
            int looper = 1;
            int number = test.nextInt();
            PrintWriter output = new PrintWriter("calculations.txt");
            output.println(number);
            output.close();
        }
        String fileName = "calculations.txt";
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
    }
}