package startup.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExQ_Min3Test {

    @ParameterizedTest
    @CsvSource({"3, 2, 1"})
    void max4Test(int a, int b, int c) {
        // given
        ExQ_Min3 ex11Min3 = new ExQ_Min3();

        // when
        int max = ex11Min3.algorithm(a, b, c);

        // then
        Assertions.assertThat(max).isEqualTo(c);
    }
}
