import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Type something:  ");
        line = in.nextLine();
        System.out.println("You said: " + line);
        System.out.print("Type something else:  ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;
        System.out.print("How many inches?  ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
        double cm;
        int feet, inches, remainder = 0;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        System.out.print("Exactly how many cm? ");
        cm = in.nextDouble();
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n" , cm, feet, remainder);
    }
}
