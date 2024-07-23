package numberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {
    NumberGenerator numberGenerator;

    @BeforeEach
    void beforeEach() {
        numberGenerator = new NumberGenerator();
    }

    @DisplayName("init을 테스트 한다.")
    @Test
    void initTest() {
        // given
        // when
        List<Integer> initList = numberGenerator.init();

        // then
        assertThat(initList.size()).isEqualTo(3);
    }

    @DisplayName("생성한 숫자가 리스트에 없으면 정상적으로 추가된다.")
    @Test
    void checkValidTests() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(3);

        // when
        numberGenerator.checkValid(list, 4);

        // then
        assertThat(list.size()).isEqualTo(2);
    }

    @DisplayName("생성한 숫자가 리스트에 존재하면 추가되지 않는다.")
    @Test
    void checkValidTestsIsExistsNumber() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(3);

        // when
        numberGenerator.checkValid(list, 3);

        // then
        assertThat(list.size()).isEqualTo(1);
    }


    @DisplayName("랜덤으로 생성한 숫자는 0 ~ 9 사이인 숫자이다.")
    @Test
    void createNumberTest() {
        // given
        // when
        int number = numberGenerator.createNumber();

        // then
        assertThat(number).isGreaterThan(-1);
        assertThat(number).isLessThan(10);
    }


}