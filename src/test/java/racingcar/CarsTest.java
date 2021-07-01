package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarsTest {
    @Test
    @DisplayName("경주할 자동차가 1대 이하일 경우 IllegalArgumentException 발생 확인")
    public void carsShouldBeMoreThanOneTest() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.of("juhi"));
        assertThrows(IllegalArgumentException.class, ()->{
            Cars.of(cars);
        });
    }

    @Test
    @DisplayName("중복된 자동차 이름 있을 시 IllegalArgumentException 발생 확인")
    public void carsSholdNotDuplicated() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.of("juhi"));
        cars.add(Car.of("juhi"));
        assertThrows(IllegalArgumentException.class, ()-> {
            Cars.of(cars);
        });
    }
}
