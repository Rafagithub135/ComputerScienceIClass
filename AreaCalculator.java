import java.util.*;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner shape = new Scanner(System.in);
        System.out.println("Would you like to find the area of a shape?");
        String answer = shape.nextLine();
        while (answer.equalsIgnoreCase("Y")) {
            System.out.println("Please enter the shape you would like to find the area of or Done to quit:  ");
            String option = shape.nextLine();
            switch (option.toLowerCase()) {
                case "rectangle":
                    System.out.println("The area of the rectangle is " + areaRectangle());
                    break;
                case "triangle":
                    System.out.println("The area of the triangle is " + areaTriangle());
                    break;
                case "circle":
                    System.out.println("The area of the circle is " + areaCircle());
                    break;
                case "square":
                    System.out.println("The area of the square is " + areaSquare());
                    break;
                case "trapezoid":
                    System.out.println("The area of the trapezoid is " + areaTrapezoid());
                    break;
                case "done":
                    System.out.println("Thank you for using the area calculator.");
                    System.exit(0);
                default:
                    System.out.println("Please enter a another shape.");
            }
        }
    }

    public static double areaRectangle() {
        Scanner rectangle = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:  ");
        double length = rectangle.nextDouble();
        System.out.println("Please enter the width of the rectangle:  ");
        double width = rectangle.nextDouble();
        return length * width;
    }

    public static double areaTriangle() {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Please enter the base of the triangle:  ");
        double base = triangle.nextDouble();
        System.out.println("PLease enter the height of the triangle:  ");
        double height = triangle.nextDouble();
        return (base * height) / 2;
    }

    public static double areaCircle() {
        Scanner circle = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:  ");
        double radius = circle.nextDouble();
        return Math.PI * (radius * radius);
    }

    public static double areaSquare() {
        Scanner square = new Scanner(System.in);
        System.out.println("Please enter the side distance of the square:  ");
        double side = square.nextDouble();
        return side * side;
    }
    public static double areaTrapezoid() {
        Scanner trapezoid = new Scanner(System.in);
        System.out.println("Please enter the length of the first base of the trapezoid:  ");
        double base1 = trapezoid.nextDouble();
        System.out.println("Please enter the length of the second base of the trapezoid:  ");
        double base2 = trapezoid.nextDouble();
        System.out.println("Please enter the height of the trapezoid:  ");
        double height = trapezoid.nextDouble();
        return ((base1 + base2) / 2) * height;
    }
}