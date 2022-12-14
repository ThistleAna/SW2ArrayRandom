// learn how to user Random package
import java.util.Random;

public class DiceProgram {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int diceNumber = (randomGenerator.nextInt(6)) + 1;
        System.out.println(diceNumber);
    }
}
