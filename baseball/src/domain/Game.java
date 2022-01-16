package domain;

import java.util.List;

public class Game {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> player = numberGenerator.createRandomNumbers();
        List<Integer> computer = numberGenerator.createRandomNumbers();
        System.out.println("player = " + player);
        System.out.println("computer = " + computer);
    }

}
