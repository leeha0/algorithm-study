package startup.chapter1;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Min3Test {

    @ParameterizedTest
    @CsvSource({"3, 2, 1"})
    void max4Test(int a, int b, int c) {
        // given
        Min3 min3 = new Min3();

        // when
        int max = min3.algorithm(a, b, c);

        // then
        Assertions.assertThat(max).isEqualTo(c);
    }
}
