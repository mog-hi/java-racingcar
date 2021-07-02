package racingcar.view;

import java.util.Scanner;

public class InputView {
    private final static Scanner scanner = new Scanner(System.in);
    public static int inputRound() {
        System.out.println("시도할 횟수를 입력하시오");
        int count = scanner.nextInt();
        return count;
    }
    public static String[] inputCarsName() {
        System.out.println("자동차 이름을 ,로 구분해서 입력하시오");
        String input = scanner.nextLine();
        String[] carNames = input.split(",");

        return carNames;
    }
}
