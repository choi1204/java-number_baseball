package domain;

import java.util.Arrays;
import java.util.List;

public class Game {

    public static void main(String[] args) {

//        NumberGenerator numberGenerator = new NumberGenerator();
//        List<Integer> computer = numberGenerator.createRandomNumbers();
//        System.out.println("computer = " + computer);

//        Judgment judgment = new Judgment();
//        int count = judgment.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
//        System.out.println(count);

//        boolean place = judgment.hasPlace(Arrays.asList(7, 8, 9), 1, 7);
//        System.out.println(place);

        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
        System.out.println(result);
    }

}
