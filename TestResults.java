import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        int testScore;
        char letterGrade;
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter your numeric test score and I will tell you the grade:");
        testScore=userInput.nextInt();

        TestGrade test = new TestGrade(testScore);
        letterGrade =test.getLetterGrade();

        System.out.println("Your grade is " + test.getLetterGrade());
    }
}
