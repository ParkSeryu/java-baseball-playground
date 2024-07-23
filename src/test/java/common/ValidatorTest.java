package common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    @DisplayName("리스트에 중복된 숫자가 존재할 경우 참을 반환한다.")
    @Test
    void test() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);

        // when
        boolean duplicatedNumberIsExist = Validator.isDuplicatedNumberisExist(list, 3);

        // then
        assertThat(duplicatedNumberIsExist).isTrue();
    }
}