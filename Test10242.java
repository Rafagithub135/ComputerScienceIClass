import java.io.*;
import java.util.*;

public class Test10242 {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        File f = new File(fileName);
        System.out.println("Information about " + fileName + ":");
        System.out.println("f.exists(): " + f.exists());
        System.out.println("f.exists(): " + f.canRead());
        System.out.println("f.getName(): " + f.getName());
        System.out.println("f.length(): " + f.length());
        System.out.println("f.getAbsolutePath(): " + f.getAbsolutePath());
        String fileName2 = "example.txt";
        File g = new File(fileName2);
        Scanner scanner = new Scanner(System.in);
        Random input = null;
        System.out.println(input.nextInt());
    }
}
