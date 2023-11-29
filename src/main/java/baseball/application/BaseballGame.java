package baseball.application;

import baseball.domain.Answers;
import baseball.domain.BallCount;
import baseball.domain.Operator;
import baseball.domain.Player;
import baseball.view.InputView;
import baseball.view.ResultView;

public class BaseballGame {
    public static void play() {

        Operator operator = Operator.from(Answers.generateAnswer());
        boolean isCorrect = true;

        while(isCorrect) {
            BallCount ballCount = new BallCount();
            Player player = Player.from(InputView.inputNumber());
            ballCount = operator.compareAnswer(ballCount, player.getInputNumbers());
            ResultView.printResult(ballCount);
            isCorrect = !ballCount.isAllStrike();
        }
    }
}
