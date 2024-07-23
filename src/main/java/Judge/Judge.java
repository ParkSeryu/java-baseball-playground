package judge;

import java.util.List;
import ui.OutputResultView;

public class Judge {
    private int strike;
    private int ball;
    private final OutputResultView outputResultView;

    public Judge(OutputResultView outputResultView) {
        this.outputResultView = outputResultView;
    }

    public void judgeStart(List<Integer> playerList, List<Integer> computerList) {
        for (int i = 0; i < computerList.size(); i++) {
            judging(computerList.get(i), i, playerList);
        }
        outputResultView.tellCount(strike, ball);
    }

    public void judging(int computerEach, int index, List<Integer> playerList) {
        for (int i = 0; i < playerList.size(); i++) {
            judgeStrikeOrBall(computerEach, index, i, playerList.get(i));
        }
    }

    public void judgeStrikeOrBall(int computerEach, int comIndex, int playerIndex, int playerEach) {
        if (computerEach != playerEach) {
            return;
        }
        if (comIndex == playerIndex) {
            strike++;
            return;
        }
        ball++;

    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}


