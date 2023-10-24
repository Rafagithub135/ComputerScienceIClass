import java.io.*;
import java.util.*;
public class Test1024 {
    public static void main(String[] args) throws IOException {
        FileWriter fw   = new FileWriter("example.txt", true);
        PrintWriter output = new PrintWriter("example.txt");
        output.println("This is a new file.");
        output.println("It has two lines of text.");
        output.close();
    }
}