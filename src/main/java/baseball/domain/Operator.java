package baseball.domain;

public class Operator {
    private final Answers generatedAnswers;

    private Operator(Answers generatedAnswers) {
        this.generatedAnswers = generatedAnswers;
    }

    public static Operator from(Answers generatedAnswers) {
        return new Operator(generatedAnswers);
    }

    public BallCount compareAnswer(BallCount ballCount, Answers inputAnswers) {
        for (int i = 0; i < GameRules.INPUT_NUMBER_LENGTH.getValue(); i++) {
            count(inputAnswers, ballCount, i);
        }
        return ballCount;
    }

    private void count(Answers inputAnswers, BallCount ballCount, int index) {
        Answer inputNumber = inputAnswers.getEachNumber(index);
        Answer answerNumber = getAnswers().getEachNumber(index);
        if (inputNumber.equals(answerNumber)) {
            ballCount.plusStrike();
        } else if (inputAnswers.getNumbers().contains(answerNumber)) {
            ballCount.plusBall();
        }
    }

    private Answers getAnswers() {
        return generatedAnswers;
    }
}
