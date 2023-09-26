//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What message would you like to encrypt today?");LocalDateTime dateTime = LocalDateTime.now();
//        LocalTime currentTime = dateTime.toLocalTime();
//        System.out.println(currentTime);
//        int[] selector = {1, 2};
//        for (int i = 0; i < message.length(); i++) {
//            System.out.print(message.charAt(i));
//            int randomSelector = selector[(int) (Math.random() * selector.length)];
//            if (randomSelector == 1) {
//                System.out.print("h");
//                int randomHour = (int) (Math.random() * currentTime.getHour());
//                for (int j = 0; j <= randomHour; j++) {
//                    System.out.print(randomCharacters[(int) (Math.random() * randomCharacters.length)]);
//                }
//            } else {
//                System.out.print("m");
//                int randomMinute = (int) (Math.random() * currentTime.getMinute());
//                for (int j = 0; j <= randomMinute; j++) {
//                    System.out.print(randomCharacters[(int) (Math.random() * randomCharacters.length)]);
//                }
//            }
//            // TODO:  Then, remove the whitespace from the printed message.
//        }
//    }
//}
