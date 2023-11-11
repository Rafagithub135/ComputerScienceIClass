import java.util.*;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner shape = new Scanner(System.in);
        System.out.println("Would you like to find the volume of a shape?");
        String answer = shape.nextLine();
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Please enter the shape you would like to find the volume of or Done to quit:  ");
            String option = shape.nextLine();
            switch (option.toLowerCase()) {
                case "cube":
                    System.out.println("The volume of the cube is " + volumeCube());
                    break;
                case "sphere":
                    System.out.println("The volume of the sphere is " + volumeSphere());
                    break;
                case "cylinder":
                    System.out.println("The volume of the cylinder is " + volumeCylinder());
                    break;
                case "cone":
                    System.out.println("The volume of the cone is " + volumeCone());
                    break;
                case "pyramid":
                    System.out.println("The volume of the pyramid is " + volumePyramid());
                    break;
                case "done":
                    System.out.println("Thank you for using the volume calculator.");
                    System.exit(0);
                default:
                    System.out.println("Please enter a another shape.");
            }
        }
    }

    public static double volumeCube() {
        Scanner cube = new Scanner(System.in);
        System.out.println("Please enter the length of the cube:  ");
        double length = cube.nextDouble();
        System.out.println("Please enter the width of the cube:  ");
        double width = cube.nextDouble();
        System.out.println("Please enter the height of the cube:  ");
        double height = cube.nextDouble();
        return length * width * height;
    }

    public static double volumeSphere() {
        Scanner sphere = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere:  ");
        double radius = sphere.nextDouble();
        return (4.0 / 3.0) * Math.PI * (radius * radius * radius);
    }

    public static double volumeCylinder() {
        Scanner cylinder = new Scanner(System.in);
        System.out.println("Please enter the radius of the cylinder:  ");
        double radius = cylinder.nextDouble();
        System.out.println("Please enter the height of the cylinder:  ");
        double height = cylinder.nextDouble();
        return Math.PI * (radius * radius) * height;
    }

    public static double volumeCone() {
        Scanner cone = new Scanner(System.in);
        System.out.println("Please enter the radius of the cone:  ");
        double radius = cone.nextDouble();
        System.out.println("Please enter the height of the cone:  ");
        double height = cone.nextDouble();
        return (1.0 / 3.0) * Math.PI * (radius * radius) * height;
    }

    public static double volumePyramid() {
        Scanner pyramid = new Scanner(System.in);
        System.out.println("Please enter the length of the pyramid:  ");
        double length = pyramid.nextDouble();
        System.out.println("Please enter the width of the pyramid:  ");
        double width = pyramid.nextDouble();
        System.out.println("Please enter the height of the pyramid:  ");
        double height = pyramid.nextDouble();
        return (1.0 / 3.0) * length * width * height;
    }
}
