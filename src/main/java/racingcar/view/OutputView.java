package racingcar.view;

import racingcar.Cars;
import racingcar.Result;

import java.util.List;

public class OutputView {
    public static void printWinners(Cars cars) {
        Result result = Result.of(cars);
        List<String> winners = result.getWinner();
        winners.forEach(s -> {
            System.out.print(s + " ");
        });
    }

    public static void printResults(Cars cars) {
        System.out.println("실행 결과");
        cars.getCars().forEach(s -> {
            System.out.println(s.getName() + " : " + carsPosition(s.getPosition()));
        });
    }

    private static String carsPosition(int position) {
        String positionOuput = "";
        for (int i = 0; i < position; i++) {
            positionOuput += "-";
        }
        return positionOuput;
    }
}
