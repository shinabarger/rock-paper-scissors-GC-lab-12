import java.util.Scanner;

/**
 * Created by davidshinabarger on 2/10/17.
 */
public class UserPlayer extends Player {
    @Override
    public void userName() {
        String userName = Validator.getString(scan, "Please, enter your name: ");
        System.out.println("Great. Welcome, " + userName);
    }
    @Override
    public String generateRoshambo() {
        Scanner scan = new Scanner(System.in);
        String userInputString = Validator.getRockPaperScissorsString(scan, "Write Rock, Paper, or Scissors");
        if (userInputString.equalsIgnoreCase("Rock")) {
            System.out.println("You selected Rock.");

        } else if (userInputString.equalsIgnoreCase("Paper")) {
            System.out.println("You selected paper.");

        } else if (userInputString.equalsIgnoreCase("Scissors")) {
            System.out.println("You selected scissors.");

        }

        return userInputString ;
    }



}
