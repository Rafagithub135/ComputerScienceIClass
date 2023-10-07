public class ThinkJavaChapter5Exercises {
    public static void main(String[] args) throws InterruptedException {
        x = null;
        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        } else if (x > 10) {
            System.out.println("positive double digit number.");
        } else if (x < 0 && x > -10) {
            System.out.println("negative single digit number.");
        } else if (x < -10) {
            System.out.println("negative double digit number.");
        } else {
            System.out.println("zero.");
        }
    }
}