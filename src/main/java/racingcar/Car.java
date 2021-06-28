package racingcar;

import racingcar.validator.CarValidator;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        CarValidator.validateCarNameIsNullOrEmpty(name);
        CarValidator.validateCarNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static Car of(String name) {
        return new Car(name);
    }
    // 추가 기능 구현
}
