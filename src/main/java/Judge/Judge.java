package judge;

import java.util.List;

public class Judge {
    private int strike;
    private int ball;

    public void gameStart(List<Integer> playerList, List<Integer> computerList) {
        for (int i = 0; i < computerList.size(); i++) {
            judging(computerList.get(i), i, playerList);
        }
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


