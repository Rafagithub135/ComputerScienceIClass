public class RalphMcCloskeyAssignment2 {
    public static void main(String[] args) {
        // # 3
        char letter1 = 'R';
        char letter2 = 'a';
        char letter3 = 'l';
        char letter4 = 'p';
        char letter5 = 'h';
        // # 4
        System.out.println("Hello, my name is " + letter1 + letter2 + letter3 + letter4 + letter5 + "!");
        // # 5
        System.out.println();
        // # 6
        int classes = 4;
        int minutes = 20;
        int last3 = 965;
        double years = 3.5;
        // # 7
        String classesSentence = "This semester, I am taking " + classes + " classes.";
        String commute = "My commute to school is " + minutes + " minutes long.";
        String last3Sentence = "The last three digits of my \"J\" number are " + last3 + ".";
        String length = "I have lived in Philadelphia for " + years + " years.";
        // # 8
        System.out.println(classesSentence);
        System.out.println(commute);
        System.out.println(last3Sentence);
        System.out.println(length);
        // # 9
        // For the first error, I changed the variable type from int to double because the number has a decimal.
        double myTestGrade = 87.2;
        // For the second error, I named the variable because there wasn't one.
        String testGradeSentence = "My grade on the test was ";
        // For the third error, I added a variable type of double because the number has a decimal.
        double myTotalGrade = 89.5;
        // For the fourth error, I added a variable type of String because the message is a string.
        String totalGradeMessage = "My total grade in the class is ";
        // # 10
        System.out.println("The first error, as you can see from the comments, was the variable type was typed as an int.  The value in the variable has a decimal, so I changed the type to a double.");
        System.out.println("The second error did not have a name for the variable.  I named it.");
        System.out.println("The third error did not have a variable type.  I added a variable type of double because the number has a decimal in it.");
        System.out.println("The fourth error also did not have a variable type.  The message is a string so I added a variable type of String.");
    }
}
