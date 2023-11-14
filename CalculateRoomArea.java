import java.util.*;

public class CalculateRoomArea {
    public static void main(String[] args) {
        Scanner room = new Scanner(System.in);
        System.out.println("Would you like to find the area of a room?");
        String answer = room.nextLine();
        double area = 0;
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Please enter the shape you would like to find the area of or Done to quit:  ");
            String option = room.nextLine();
            switch (option.toLowerCase()) {
                case "rectangle":
                    area += areaRectangle();
                    break;
                case "square":
                    area += areaSquare();
                    break;
                case "triangle":
                    area += areaTriangle();
                    break;
                case "circle":
                    area += areaCircle();
                    break;
                case "done":
                    System.out.println("Thank you for using the area calculator.");
                    System.out.println("The total area of the room is " + area);
                    System.exit(0);
                default:
                    System.out.println("Please enter another shape.");
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
    public static double areaSquare() {
        Scanner square = new Scanner(System.in);
        System.out.println("Please enter the length of the square:  ");
        double length = square.nextDouble();
        return length * length;
    }
    public static double areaTriangle() {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Please enter the base of the triangle:  ");
        double base = triangle.nextDouble();
        System.out.println("Please enter the height of the triangle:  ");
        double height = triangle.nextDouble();
        return (base * height) / 2;
    }
    public static double areaCircle() {
        Scanner circle = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:  ");
        double radius = circle.nextDouble();
        return Math.PI * (radius * radius);
    }
}