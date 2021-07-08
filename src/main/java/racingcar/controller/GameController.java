package racingcar.controller;

import racingcar.Cars;
import racingcar.Round;
import racingcar.utils.RandomUtils;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public void run() {
        Cars cars = Cars.of(InputView.inputCarsName());
        Round round = Round.of(InputView.inputRound());
        move(round, cars);
        OutputView.printResults(cars);
        OutputView.printWinners(cars);
    }
    private void move(Round round, Cars cars) {
        for (int i = 0; i < round.getCount(); i++) {
            cars.move(getRandomNumbers(cars));
        }
    }
    private List<Integer> getRandomNumbers(Cars cars) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i =0; i < cars.getCars().size(); i++) {
            randomNumbers.add(RandomUtils.nextInt(0, 10));
        }
        return randomNumbers;
    }
}
