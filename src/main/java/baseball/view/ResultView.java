package baseball.view;

import baseball.domain.BallCount;

public class ResultView {
    private final static String BALL_MESSAGE = "%d볼";
    private final static String STRIKE_MESSAGE = "%d스트라이크";
    private final static String BALL_AND_STRIKE_MESSAGE = "%d볼 %d스트라이크";
    private final static String NOTHING_MESSAGE = "낫싱";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";


    public static void printResult(BallCount ballCount) {
        if (ballCount.isOnlyBall()) System.out.println(printBall(ballCount));
        if (ballCount.isOnlyStrike()) System.out.println(printStrike(ballCount));
        if (ballCount.isBallAndStrike()) System.out.println(printBallAndStrike(ballCount));
        if (ballCount.isNothing()) System.out.println(NOTHING_MESSAGE);
        if (ballCount.isAllStrike()) System.out.println(GAME_END_MESSAGE);
    }

    private static String printBall(BallCount ballCount) {
        return String.format(BALL_MESSAGE, ballCount.getBall());
    }

    private static String printStrike(BallCount ballCount) {
        return String.format(STRIKE_MESSAGE, ballCount.getStrike());
    }

    private static String printBallAndStrike(BallCount ballCount) {
        return String.format(BALL_AND_STRIKE_MESSAGE, ballCount.getBall(), ballCount.getStrike());
    }
}
