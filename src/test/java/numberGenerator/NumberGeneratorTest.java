package numberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

import common.Validator;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {
    NumberGenerator numberGenerator;

    @BeforeEach
    void beforeEach() {
        numberGenerator = new NumberGenerator(new Validator());
    }

    @DisplayName("새로운 리스트가 생성된다.")
    @Test
    void createListTest() {
        // given
        // when
        List<Integer> initList = numberGenerator.createList();

        // then
        assertThat(initList.size()).isEqualTo(3);
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