import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {


        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        String playerMove;
        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter Your Move: ");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.print(playerMove + " is not a valid move");
            }

        System.out.println("Computer Played: " + computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("Game was tie");

        } else if (playerMove.equals("r")) {
            if (computerMove.equals("p"))
                System.out.println("You lost!");
        } else if (computerMove.equals("s")) {
            System.out.println("You Win");


        } else if (playerMove.equals("s")) {
            if (computerMove.equals("r"))
                System.out.println("You lost!");
        } else if (computerMove.equals("p")) {
            System.out.println("You Win");


        } else if (playerMove.equals("p")) {
            if (computerMove.equals("s"))
                System.out.println("You lost!");
        } else if (computerMove.equals("r")) {
            System.out.println("You win!");
        }
    }
}