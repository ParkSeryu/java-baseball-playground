package computer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @DisplayName("컴퓨터 숫자가 잘 생성되는지 확인한다.")
    @Test
    void getNumberListTest() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Computer computer = new Computer(list);

        // when
        List<Integer> computerList = computer.getNumberList();

        // then
        assertThat(list).isEqualTo(computerList);
    }
}