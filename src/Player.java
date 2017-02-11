import java.util.Scanner;

/**
 * Created by davidshinabarger on 2/10/17.
 */
public abstract class Player {
    Scanner scan = new Scanner(System.in);

    public abstract void userName();

    public abstract String generateRoshambo();

}
