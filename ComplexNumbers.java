public class ComplexNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 2015; i++) {
            if (i % 4 == 1) {
                System.out.print("i:  " + i + "  ");
                System.out.println("Square root of -1 or i");
            } else if (i % 4 == 2) {
                System.out.print("i:  " + i + "  ");
                System.out.println("-1");
            } else if (i % 4 == 3) {
                System.out.print("i:  " + i + "  ");
                System.out.println("-i");
            } else if (i % 4 == 0) {
                System.out.print("i:  " + i + "  ");
                System.out.println("1");
                }
            }
        }
    }