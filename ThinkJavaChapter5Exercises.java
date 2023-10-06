public class ThinkJavaChapter5Exercises {
    public static void main(String[] args) throws InterruptedException {
        countdown(5);
        System.out.println("This was only a test!  Do not be alarmed!");
        displayBinary(7);
    }
    public static void countdown(int n) throws InterruptedException {
        if (n == 0) {
            System.out.println("Lift off!!!");
        }
        else {
            System.out.println(n);
            Thread.sleep(1000);
            countdown(n - 1);
        }
    }
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
}