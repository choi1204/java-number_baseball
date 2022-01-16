package domain;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    public List<Integer> createRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int number = new Random().nextInt(8) + 1;
            numbers.add(number);
        }
        return numbers;
    }
}
