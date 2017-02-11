/**
 * Created by davidshinabarger on 2/10/17.
 */
public class RockPlayer extends Player {

    @Override
    public void userName() {

    }

    public String generateRoshambo() {
        String rockPlayerSelection = "rock";
        System.out.println("Computer player 1 picks rock.");
        return String.valueOf(rockPlayerSelection);
    }

}
