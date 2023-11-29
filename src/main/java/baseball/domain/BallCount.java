package baseball.domain;

public class BallCount {
    private int strike;
    private int ball;

    public BallCount() {
    }

    public void plusStrike() {
        strike++;
    }

    public void plusBall() {
        ball++;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isOnlyStrike() {
        return strike > 0 && ball == 0;
    }

    public boolean isOnlyBall() {
        return strike == 0 && ball > 0;
    }

    public boolean isBallAndStrike() {
        return strike != 0 && ball != 0;
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }

    public boolean isAllStrike() {
        return strike == GameRules.CORRECT_ANSWER_NUMBER.getValue();
    }
}
