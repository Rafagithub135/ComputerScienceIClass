import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // This exercise is from the book "Think Java How to Think Like a Computer Scientist" Chapter 2.
        // Exercise 2.3 # 2
        System.out.println("Enter the current hour:");
        int hour = input.nextInt();
        System.out.println("Enter the current minute:");
        int minute = input.nextInt();
        System.out.println("Enter the current second:");
        int second = input.nextInt();
        // Exercise 2.3 # 3
        System.out.println("The number of seconds since midnight is:  " + (hour * 3600 + minute * 60 + second));
        // Exercise 2.3 # 4
        System.out.println("The number of seconds remaining in the day is:  " + ((24 - hour) * 3600 - minute * 60 - second));
        // Exercise 2.3 # 5
        int hourPassed = (hour * 3600);
        int minutePassed = (minute * 60);
        double secondsInDay = (24 * 3600);
        System.out.println("The percentage of the day that has passed is:  " + (hourPassed + minutePassed + second) / secondsInDay);
        // Exercise 2.3 # 6
        int currentHour = 12;
        int currentMinute = 5;
        int currentSecond = 2;
        System.out.println("The amount of time I spent on this exercise is:  " + (currentHour - hour - 1) + " hours, " + (60 - minute + currentMinute) + " minutes, and " + (60 - second + currentSecond) + " seconds.");
    }
}
