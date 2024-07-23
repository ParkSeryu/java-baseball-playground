package common;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    private final Validator validator = new Validator();

    @DisplayName("리스트에 중복된 숫자가 존재할 경우 참을 반환한다.")
    @Test
    void isDuplicatedNumberIsExistTest() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);

        // when
        boolean duplicatedNumberIsExist = validator.isValid(list, 3);

        // then
        assertThat(duplicatedNumberIsExist).isTrue();
    }


}