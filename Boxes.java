public class Boxes {
    public static void main(String[] args) {
        // Prints a rectangle 4 x 10 stars.
        printCharacters('*', 4, 10);
        System.out.println();
        //  Prints a rectangle 5 x 20 lines.
        printCharacters('|', 5, 20);
        System.out.println();
        // Prints a rectangle 7 x 6 a's.
        printCharacters('a', 7, 6);
    }

    public static void printCharacters(char myChar, int numRows, int numChars) {
        for (int i = 0; i < numRows; i++) {
            for (int y = 0; y < numChars; y++) {
                System.out.print(myChar);
            }
            System.out.println();
        }
    }
}
