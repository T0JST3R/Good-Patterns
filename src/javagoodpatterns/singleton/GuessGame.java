package javagoodpatterns.singleton;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {
    private static final long serialVersionUID = 3929481;
    private static GuessGame instance = new GuessGame();
    private int score = 0;
    private Random random = new Random();
    private int roundNumber = 0;
    private Scanner scanner = new Scanner(System.in);

    public int getScore() {
        return score;
    }


    private GuessGame() {

    }

    public void play() {
        while (roundNumber != 10) {
            int mysteriousDigit = random.nextInt(10);
            if (scanner.nextInt() == mysteriousDigit) {
                score++;
            }

            roundNumber++;
        }
    }

    public static GuessGame getInstance() {

        return instance;
    }
    protected Object readResolve(){
        return getInstance();
    }

}
