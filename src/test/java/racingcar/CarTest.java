package racingcar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void car() {
        String carName = "carName";
        Car c  = new Car(carName);
        assertEquals(carName, c.getName());
    }
}
