package study;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void replace2() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }


    @Test
    void replace3() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void replace4() {
        String suit = "(1,2)";
        String substring = suit.substring(1, suit.length() - 1);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    void replace5() {
        String suit = "abc";
        assertThatThrownBy(() -> suit.charAt(suit.length() + 1))
                .isInstanceOf(StringIndexOutOfBoundsException.class);
    }



}
