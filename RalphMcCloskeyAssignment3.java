import java.util.Scanner;

public class RalphMcCloskeyAssignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's calculate your grade in this class.");
        System.out.println("Please enter your assignment grades, either 0, 1, or 2:  ");
        System.out.println("Assignment 1:  ");
        int assignment1 = scanner.nextInt();
        System.out.println("Assignment 2:  ");
        int assignment2 = scanner.nextInt();
        System.out.println("Assignment 3:  ");
        int assignment3 = scanner.nextInt();
        System.out.println("Assignment 4:  ");
        int assignment4 = scanner.nextInt();
        System.out.println("Assignment 5:  ");
        int assignment5 = scanner.nextInt();
        System.out.println("Assignment 6:  ");
        int assignment6 = scanner.nextInt();
        System.out.println("Assignment 7:  ");
        int assignment7 = scanner.nextInt();
        System.out.println("Assignment 8:  ");
        int assignment8 = scanner.nextInt();
        System.out.println("Assignment 9:  ");
        int assignment9 = scanner.nextInt();
        System.out.println("Assignment 10:  ");
        int assignment10 = scanner.nextInt();
        int assignmentTotal = ((assignment1 + assignment2 + assignment3 + assignment4 + assignment5 + assignment6 + assignment7 + assignment8 + assignment9 + assignment10) * 5);
        System.out.println(assignmentTotal);
        System.out.println("Your grade for assignments is:  " + assignmentTotal + "%");
        System.out.println(" ");
        System.out.println("Please enter your grade for the first Midterm as a percentage.  For example, if you received a 90% then enter 0.90.  If you get a 100, enter 1:  ");
//        System.out.println(assignmentTotal);
        System.out.println("Your grade for assignments is:  " + assignmentTotal + "%");
        System.out.println(" ");
        System.out.println("Please enter your grade for the first Midterm as a percentage.  For example, if you received a 90% then enter 0.90.  If you get a 100, enter 1.0:  ");
        double midterm1 = scanner.nextDouble();
        System.out.println("Please enter your grade for the second Midterm as a percentage as before:  ");
        double midterm2 = scanner.nextDouble();
        System.out.println("Please enter your grade from your Final Exam:  ");
        double finalExam = scanner.nextDouble();
        System.out.println(" ");
        System.out.println("Your total grade for all of your assignments is:  " + assignmentTotal + "%");
        System.out.println("Your first Midterm grade is:  " + midterm1 * 100 + "%");
        System.out.println("Your second Midterm grade is:  " + midterm2 * 100 + "%");
        System.out.println("Your Final Exam grade is:  " + finalExam * 100 + "%");
//        System.out.println((assignmentTotal * 0.2));
//        System.out.println((midterm1 * 0.25 * 100));
//        System.out.println((midterm2 * 0.25 * 100));
//        System.out.println((finalExam * 0.3 * 100));
        System.out.println("Your Final Total Grade for this class is:  " + ((assignmentTotal * 0.2) + (midterm1 * 0.25 * 100) + (midterm2 * 0.25 * 100) + (finalExam * 0.3 * 100)) + "%");
    }
}