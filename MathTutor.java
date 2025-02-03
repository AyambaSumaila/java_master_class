import java.util.Scanner;
import java.util.Random;

public class MathTutor {
    private final Scanner userInput;
    private final Random randomNumbers;

    public MathTutor() {
        this.userInput = new Scanner(System.in);
        this.randomNumbers = new Random();
    }

    public void start() {
        boolean playAgain;
        do {
            playGame();
            playAgain = askToPlayAgain();
        } while (playAgain);

        System.out.println("Thanks for playing!");
        userInput.close();
    }

    private void playGame() {
        int number1 = randomNumbers.nextInt(100);
        int number2 = randomNumbers.nextInt(100);
        int correctAnswer = number1 + number2;

        System.out.println("What is the answer to the following problem?");
        System.out.println(number1 + " + " + number2 + " = ?");

        int userAnswer = userInput.nextInt();
        userInput.nextLine(); // Consume the newline

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, wrong answer. The correct answer is " + correctAnswer);
        }
    }

    private boolean askToPlayAgain() {
        System.out.println("Would you like to play again? (Y/N)");
        String option = userInput.nextLine().trim().toUpperCase();
        return option.equals("Y");
    }

    public static void main(String[] args) {
        MathTutor tutor = new MathTutor();
        tutor.start();
    }
}
