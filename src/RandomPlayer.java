import java.util.Random;

/**
 * Created by davidshinabarger on 2/10/17.
 */
public class RandomPlayer extends Player {

    @Override
    public void userName() {

    }
    @Override
    public String generateRoshambo() {
        Random rando = new Random();
        int randomGeneration = rando.nextInt(3) + 1;
        return String.valueOf(randomGeneration);
    }
}
