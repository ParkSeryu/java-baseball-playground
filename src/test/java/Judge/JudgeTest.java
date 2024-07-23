package judge;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JudgeTest {

    private Judge judge;

    @BeforeEach
    void setUp() {
        judge = new Judge();
    }

    @DisplayName("같은 index에 있는 값이 같으면 strike 카운트가 올라단다.")
    @Test
    void judgeStrikeTest() {
        // given
        List<Integer> playerList = Arrays.asList(1, 2, 3);
        List<Integer> comList = Arrays.asList(1, 2, 3);

        // when
        judge.judgeStrikeOrBall(comList.get(0), 0, 0, playerList.get(0));

        // then
        assertThat(judge.getStrike()).isEqualTo(1);
        assertThat(judge.getBall()).isEqualTo(0);
    }

    @DisplayName("다른 index에 있는 값이 같으면 ball 카운트가 올라단다.")
    @Test
    void judgeBallTest() {
        // given
        List<Integer> playerList = Arrays.asList(1, 2, 3);
        List<Integer> comList = Arrays.asList(1, 2, 3);

        // when
        judge.judgeStrikeOrBall(comList.get(0), 0, 1, playerList.get(0));

        // then
        assertThat(judge.getStrike()).isEqualTo(0);
        assertThat(judge.getBall()).isEqualTo(1);
    }

    @DisplayName("judging strike 테스트")
    @Test
    void judging_strike_test() {
        // given

        int computerEach = 1;
        int index = 0;
        List<Integer> playerList = Arrays.asList(1, 3, 5);

        // when
        judge.judging(computerEach, index, playerList);

        // then
        assertThat(judge.getStrike()).isEqualTo(1);
        assertThat(judge.getBall()).isEqualTo(0);
    }

    @DisplayName("judging ball 테스트")
    @Test
    void judging_ball_test() {
        // given

        int computerEach = 1;
        int index = 0;
        List<Integer> playerList = Arrays.asList(4, 1, 2);

        // when
        judge.judging(computerEach, index, playerList);

        // then
        assertThat(judge.getStrike()).isEqualTo(0);
        assertThat(judge.getBall()).isEqualTo(1);
    }

    @DisplayName("리스트가 모두 같으면 3 스트라이크를 판정을 내린다")
    @Test
    void judging_3_strike() {
        // given
        List<Integer> playerList = Arrays.asList(4, 2, 5);
        List<Integer> comList = Arrays.asList(4, 2, 5);

        // when
        judge.gameStart(playerList, comList);

        // then
        assertThat(judge.getStrike()).isEqualTo(3);
        assertThat(judge.getBall()).isEqualTo(0);
    }

    @DisplayName("리스트가 두개는 같고, 하나는 다르면 2 스트라이크 0 볼을 가진다")
    @Test
    void judging_2_strike_0_ball() {
        // given
        List<Integer> playerList = Arrays.asList(4, 2, 5);
        List<Integer> comList = Arrays.asList(4, 2, 6);

        // when
        judge.gameStart(playerList, comList);

        // then
        assertThat(judge.getStrike()).isEqualTo(2);
        assertThat(judge.getBall()).isEqualTo(0);
    }

    @DisplayName("리스트가 숫자는 같으나 인덱스 위치가 다르면 0 스트라이크 3 볼을 가진다")
    @Test
    void judging_0_strike_3_ball() {
        // given
        List<Integer> playerList = Arrays.asList(4, 2, 5);
        List<Integer> comList = Arrays.asList(5, 4, 2);

        // when
        judge.gameStart(playerList, comList);

        // then
        assertThat(judge.getStrike()).isEqualTo(0);
        assertThat(judge.getBall()).isEqualTo(3);
    }

    @DisplayName("리스트가 모두 같지 않으면 0 스트라이크 0 볼을 가진다")
    @Test
    void judging_nothing() {
        // given
        List<Integer> playerList = Arrays.asList(4, 2, 5);
        List<Integer> comList = Arrays.asList(6, 8, 9);

        // when
        judge.gameStart(playerList, comList);

        // then
        assertThat(judge.getStrike()).isEqualTo(0);
        assertThat(judge.getBall()).isEqualTo(0);
    }

}