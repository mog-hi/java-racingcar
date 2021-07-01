package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*
포함되어야 하는 내용
- Car형 배열
- Cars가 맞게 들어왔는지 확인
    - 자동차는 두 대 이상
    - 자동차 이름은 중복 불가능
- 각 자동차가 맞게 움직이는지
 */
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
}
