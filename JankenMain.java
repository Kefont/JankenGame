import java.util.Random;
import java.util.Scanner;

public class JankenMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"rock", "paper", "scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while(true) {
                System.out.println("Please enter your move (rock, paper, or scissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move. Try again!");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Almost there.It's a tie!");
            }
            else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("Unfortunately,you lose!");

                } else if (computerMove.equals("scissors")) {
                    System.out.println("Hooray, you win!");
                }
            }

            else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("Hooray, you win!");

                } else if (computerMove.equals("scissors")) {
                    System.out.println("Unfortunately,you lose!");
                }
            }

            else if (playerMove.equals("scissors")) {
                if (computerMove.equals("paper")) {
                    System.out.println("Hooray, you win!");

                } else if (computerMove.equals("r")) {
                    System.out.println("Unfortunately,you lose!");
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}