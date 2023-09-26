import java.time.LocalTime;

public class ThinkJavaChapter4Exercises {
    public static void main(String[] args) {
        System.out.println("First line.");
        threeLine();
        System.out.println("Second line.");
        printTime();
    }

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void printTime() {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        if (hour > 12) {
            System.out.print(currentTime.getHour() - 12);
        } else {
            System.out.print(currentTime.getHour());
        }
        System.out.print(":");
        System.out.println(minute);
    }
}
