package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    @DisplayName("경주할 자동차 이름 입력 체크")
    public void getNameTest() {
        String carName = "car";
        Car car = Car.of(carName); // static 메소드 접근 방법
        assertEquals(carName, car.getName());
    }
    @Test
    @DisplayName("이름이 null, 공백이 아닌지 확인")
    public void carNameShouldNotBeNullOrEmptyTest() {
        assertThrows(IllegalArgumentException.class, ()->{
            Car car = new Car(null);
        });
    }
}
