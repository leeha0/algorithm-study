package startup.chapter1;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Max4Test {

    @ParameterizedTest
    @CsvSource({"1, 2, 3, 4"})
    void max4Test(int a, int b, int c, int d) {
        // given
        Max4 max4 = new Max4();

        // when
        int max = max4.algorithm(a, b, c, d);

        // then
        Assertions.assertThat(max).isEqualTo(d);
    }
}
