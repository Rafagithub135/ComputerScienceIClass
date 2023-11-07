import java.util.*;

public class RalphMcCloskeyAssignment8 {
    public static void main(String[] args) {
        Scanner shape = new Scanner(System.in);
        System.out.println("Which shape would you like the area for?");
        System.out.println("Please enter rectangle, triangle or circle.");
        String shapeType = shape.nextLine();
        if (shapeType.equalsIgnoreCase("rectangle")) {
            System.out.println("The area of the rectangle is:  " + areaRectangle());
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            System.out.println("The area of the triangle is:  " + areaTriangle());
        } else if (shapeType.equalsIgnoreCase("circle")) {
            System.out.println("The area of the circle is:  " + areaCircle());
        }
    }
    public static int areaRectangle() {
        Scanner rectangle = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:  ");
        int length = rectangle.nextInt();
        System.out.println("Please enter the width of the rectangle:  ");
        int width = rectangle.nextInt();
        return length * width;
    }
    public static int areaTriangle() {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Please enter the base of the triangle:  ");
        int base = triangle.nextInt();
        System.out.println("PLease enter the height of the triangle:  ");
        int height = triangle.nextInt();
        return (base * height) / 2;
    }
    public static double areaCircle() {
        Scanner circle = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:  ");
        int radius = circle.nextInt();
        return Math.PI * (radius * radius);
    }
}