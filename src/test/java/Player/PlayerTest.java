package player;

import static org.junit.jupiter.api.Assertions.*;

import common.Validator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.InputView;

class PlayerTest {

    private final InputView inputView = new InputView();
    private final Validator validator = new Validator();
    private final Player player = new Player(inputView, validator);


    @Disabled
    @DisplayName("사용자 숫자가 잘 생성되는지 확인한다.")
    @Test
    void getNumberListTest() {
        // given


        // when

        // then
    }
}