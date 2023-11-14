import java.util.*;

public class CalculateRoomVolume {
    public static void main(String[] args) {
        Scanner room = new Scanner(System.in);
        System.out.println("Would you like to find the volume of a room?");
        String answer = room.nextLine();
        double volume = 0;
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Please enter the shape you would like to find the volume of or Done to quit:  ");
            String option = room.nextLine();
            switch (option.toLowerCase()) {
                case "cube":
                    volume += volumeBox();
                    break;
                case "pyramid":
                    volume += volumePyramid();
                    break;
                case "sphere":
                    volume += volumeSphere();
                    break;
                case "done":
                    System.out.println("Thank you for using the volume calculator.");
                    System.out.println("The total volume of the room is " + volume);
                    System.exit(0);
                default:
                    System.out.println("Please enter another shape.");
            }
        }
    }
    public static double volumeBox() {
        Scanner cube = new Scanner(System.in);
        System.out.println("Please enter the length of the cube:  ");
        double length = cube.nextDouble();
        System.out.println("Please enter the width of the cube:  ");
        double width = cube.nextDouble();
        System.out.println("Please enter the height of the cube:  ");
        double height = cube.nextDouble();
        return length * width * height;
    }
    public static double volumePyramid() {
        Scanner pyramid = new Scanner(System.in);
        System.out.println("Please enter the length of the pyramid:  ");
        double length = pyramid.nextDouble();
        System.out.println("Please enter the width of the pyramid:  ");
        double width = pyramid.nextDouble();
        System.out.println("Please enter the height of the pyramid:  ");
        double height = pyramid.nextDouble();
        return (length * width * height) / 3;
    }
    public static double volumeSphere() {
        Scanner sphere = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere:  ");
        double radius = sphere.nextDouble();
        return (4 / 3) * Math.PI * (radius * radius * radius);
    }
}
