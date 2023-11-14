import java.util.*

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
                    volume += volumeCube();
                    break;
                case "pyramid":
                    volume += volumePyramid();
                    break;
                case "sphere":
                    volume += volumeSphere();
                    break;
                case "done":
                    System.out.println("Thank you for using the volume calculator.");
                    System.out.println("The total volume of the room is " volume);
                    System.exit(0);
                default:
                    System.out.println("Please enter another shape.");
            }
        }
    }
}
