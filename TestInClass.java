public class TestInClass {
    public static void main(String[] args) {
//        int num = 1;
//        while (num <= 100000) {
//            System.out.print(num + " ");
//            num++;
//        }
        for (int i = 1; i <= 100; i++) {
            if (i % 3 && i % 5) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3) {
                System.out.println("Fizz");
            }
            else if (i % 5) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
            }
        }
    }
}
