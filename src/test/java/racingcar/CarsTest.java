package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void carsShouldNotDuplicatedTest() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.of("juhi"));
        cars.add(Car.of("juhi"));
        assertThrows(IllegalArgumentException.class, ()-> {
            Cars.of(cars);
        });
    }

    @Test
    @DisplayName("자동차들이 정상적으로 움직이는지 확인")
    public void carsMoveTest() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(Car.of("Juhi"));
        carsList.add(Car.of("Eric"));
        carsList.add(Car.of("Tom"));
        Cars cars = Cars.of(carsList);

        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(1);
        values.add(5);

        List<Integer> expectedPositions = new ArrayList<>();
        expectedPositions.add(1);
        expectedPositions.add(0);
        expectedPositions.add(1);

        cars.move(values);
        for (int i = 0; i < 3; i++){
            assertEquals(cars.getCars().get(i).getPosition(), expectedPositions.get(i));
        }
    }

    @Test
    @DisplayName("자동차 이동 시 자동차의 개수와 다른 개수의 리스트가 들어왔을 대 IllegalArgumentException 발생 확인")
    public void moveValueShouldSameWithCarsCountTest() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(Car.of("Juhi"));
        carsList.add(Car.of("Eric"));
        carsList.add(Car.of("Tom"));
        Cars cars = Cars.of(carsList);

        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(1);

        assertThrows(IllegalArgumentException.class, ()-> {
            cars.move(values);
        });
    }
}
