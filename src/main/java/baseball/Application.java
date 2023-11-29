package baseball;

import baseball.application.BaseballGame;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView.printStartGame();
        boolean gameContinue = true;

        while(gameContinue) {
            BaseballGame.play();
            gameContinue = InputView.inputContinue();
        }
    }
}
