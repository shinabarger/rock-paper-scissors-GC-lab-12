import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        UserPlayer userPlayer = new UserPlayer();
        RockPlayer rockPlayer = new RockPlayer();
        RandomPlayer randomPlayer = new RandomPlayer();

        String answer = "";
        int answerNum = 0;
        String userChoice;
        int userChoiceNum = 0;
        boolean cont = true;
        String userContinue;

        userPlayer.userName();

        while (cont == true) {


            String getOpponentChoice = Validator.getEasyOrHard(scan, "Pick HARD to play hard player. \nPick EASY for easy player.");
            System.out.println("Great. You picked the " + getOpponentChoice + " player.");

            userChoice = userPlayer.generateRoshambo();

            if (userChoice.equalsIgnoreCase("Rock")) {
                userChoiceNum = 1;
            } else if (userChoice.equalsIgnoreCase("Paper")) {
                userChoiceNum = 2;
            } else if (userChoice.equalsIgnoreCase("Scissors")) {
                userChoiceNum = 3;
            }

            if (getOpponentChoice.equalsIgnoreCase("easy")) {
                answer = String.valueOf(rockPlayer.generateRoshambo());
                answerNum = 1;

            } else if (getOpponentChoice.equalsIgnoreCase("hard")) {
                answer = randomPlayer.generateRoshambo();
                if (answer.equalsIgnoreCase("1")) {
                    answer = "scissors";
                    answerNum = 1;
                } else if (answer.equalsIgnoreCase("2")) {
                    answer = "rock";
                    answerNum = 2;
                } else if (answer.equalsIgnoreCase("3")) {
                    answer = "paper";
                    answerNum =3;
                }
            }

            System.out.println("You picked " + userChoice + ". The computer picked " + answer + ".");
            //TODO compare the two and tell the user what happens using like 7 if statements

            if (answer.equalsIgnoreCase(userChoice)) {
                System.out.println("THAT'S A TIE!");
            } else if (answer.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("scissors")) {
                System.out.println("You lose.!");
            } else if (answer.equalsIgnoreCase("Paper") && userChoice.equalsIgnoreCase("rock")) {
                System.out.println("Sorry, you lose!");
            } else if (answer.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("paper")) {
                System.out.println("You lose, sorry.");
            } else {
                System.out.println("YOU WIN!");
            }

            System.out.println("Would you like to play again? Y/N");
            userContinue = scan.nextLine();
            userContinue = scan.nextLine();
            if (userContinue.equalsIgnoreCase("Y")) {
                cont = true;
            } else break;

        }
    }
}

