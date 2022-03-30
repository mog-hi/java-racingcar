package racingcar.view;

import racingcar.domain.Cars;
import racingcar.domain.Result;

import java.util.List;

public class OutputView {

  public static void printWinners(Cars cars) {
    Result result = Result.of(cars);
    List<String> winners = result.getWinner();
    winners.forEach(s -> System.out.print(s + " "));
  }

  public static void printResults(Cars cars) {
    System.out.println("실행 결과");
    cars.getCars()
        .forEach(s -> System.out.println(s.getName() + " : " + carsPosition(s.getPosition())));
  }

  private static String carsPosition(int position) {
    StringBuilder positionOuput = new StringBuilder();
    for (int i = 0; i < position; i++) {
      positionOuput.append("-");
    }
    return positionOuput.toString();
  }
}
