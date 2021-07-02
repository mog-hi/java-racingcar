package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoundTest {
    @Test
    @DisplayName("라운드가 한 개 이상인지 확인")
    public void roundsShouldHaveAtLeastOneTest() {
        assertThrows(IllegalArgumentException.class, ()-> {
            Round.of(0);
        });
    }
}