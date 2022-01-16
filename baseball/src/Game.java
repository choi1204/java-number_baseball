import domain.NumberGenerator;

import java.util.List;

public class Game {

    public static void main(String[] args) {
        final NumberGenerator numberGenerator = new NumberGenerator();
        final List<Integer> player = numberGenerator.createRandomNumbers();
        final List<Integer> computer = numberGenerator.createRandomNumbers();
        System.out.println("player = " + player);
        System.out.println("computer = " + computer);
    }
}
