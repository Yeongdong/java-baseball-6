package baseball.view;

import baseball.domain.Answer;
import baseball.domain.Answers;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private final static String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private final static String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private final static String CONTINUE_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printStartGame() {
        System.out.println(START_MESSAGE);
    }

    public static Answers inputNumber() {
        System.out.print(INPUT_MESSAGE);
        try {
            String inputNumber = Console.readLine();
            List<Answer> answerList = Arrays.stream(inputNumber.split(""))
                    .map(Integer::parseInt)
                    .map(Answer::new)
                    .toList();
            return Answers.from(answerList);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean inputContinue() {
        System.out.println(CONTINUE_MESSAGE);
        String inputNumber = Console.readLine();
        if (!(inputNumber.equals("1") || inputNumber.equals("2")))
            throw new IllegalArgumentException();
        return inputNumber.equals("1");
    }
}
