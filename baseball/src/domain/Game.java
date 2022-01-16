package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> computer = numberGenerator.createRandomNumbers();
        Referee referee = new Referee();
        String result = "";

        while (!result.equals("0 볼 3 스트라이크")) {
            result = referee.compare(computer, askNumbers());
            System.out.println(result);
        }
        System.out.println("Game Clear");
    }

    public static List<Integer> askNumbers() {
        System.out.println("숫자를 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for(String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

}
