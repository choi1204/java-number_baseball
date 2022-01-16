package domain;

import java.util.List;

public class Referee {

    public String compare(List<Integer> computer, List<Integer> player) {
        // 몇개의 숫자가 같은지 먼저 구한 뒤
        // 스트라이크의 개수를 구해 뺀다.
        // 남은 수는 볼의 갯수이다.
        Judgment judgment = new Judgment();
        int count = judgment.correctCount(computer, player);
        int strike = 0;
        for (int i = 0; i < computer.size(); i++) {
            if (judgment.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }
        int ball = count - strike;

        if (count == 0 ) {
            return "낫씽";
       }

        return ball + " 볼 " + strike + " 스트라이크";
    }
}
