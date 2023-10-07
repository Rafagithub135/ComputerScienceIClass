import java.util.Random;

public class TestInClass {
    public static void main(String[] args) {
//        int num = 1;
//        while (num <= 100000) {
//            System.out.print(num + " ");
//            num++;
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 && i % 5) {
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3) {
//                System.out.println("Fizz");
//            }
//            else if (i % 5) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//            }
//        }
//    }
        Random r = new Random();
        int rand = r.nextInt((int) 100000000, (int) 999999999);
        System.out.println(rand);
    }

//    public static void binary
//
//    {
//        public static void main (String[]args) throws InterruptedException {
//        countdown(5);
//        System.out.println("This was only a test!  Do not be alarmed!");
//        displayBinary(7);
//    }
//        public static void countdown ( int n) throws InterruptedException {
//        if (n == 0) {
//            System.out.println("Lift off!!!");
//        } else {
//            System.out.println(n);
//            Thread.sleep(1000);
//            countdown(n - 1);
//        }
//    }
//        public static void displayBinary ( int value){
//        if (value > 0) {
//            displayBinary(value / 2);
//            System.out.print(value % 2);
//        }
//    }
//    }
}