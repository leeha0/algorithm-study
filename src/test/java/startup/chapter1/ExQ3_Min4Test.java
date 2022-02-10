package startup.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExQ3_Min4Test {

    @ParameterizedTest
    @CsvSource({"3, 4, 2, 1"})
    void min4Test(int a, int b, int c, int d) {
        // given
        ExQ3_Min4 ex11Min4 = new ExQ3_Min4();

        // when
        int min = ex11Min4.algorithm(a, b, c, d);

        // then
        Assertions.assertThat(min).isEqualTo(d);
    }
}
