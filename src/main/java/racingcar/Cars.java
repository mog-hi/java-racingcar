package racingcar;

import java.util.List;

public class Cars {
    private static final int MIN_CARS_COUNT = 2;
    private List<Car> cars;
    private Cars(List<Car> cars) {
        validateCarCount(cars);
        this.cars = cars;
    }
    public static Cars of(List<Car> cars) {
        return new Cars(cars);
    }
    private void validateCarCount(List<Car> cars) {
        if (cars.size() < MIN_CARS_COUNT) {
            throw new IllegalArgumentException("자동차는 두 대 이상이어야 합니다.");
        }
    }
}
