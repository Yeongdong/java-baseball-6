package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Answers {
    private final List<Answer> answers;

    private Answers(List<Answer> answers) {
        this.answers = answers;
    }

    public static Answers from(List<Answer> answers) {
        validateLength(answers);
        return new Answers(answers);
    }

    public static Answers generateAnswer() {
        List<Answer> answerList = new ArrayList<>();
        while (answerList.size() < GameRules.INPUT_NUMBER_LENGTH.getValue()) {
            Answer answer = new Answer(Randoms.pickNumberInRange(1, 9));
            if (!answerList.contains(answer)) {
                answerList.add(answer);
            }
        }
        return Answers.from(answerList);
    }

    public List<Answer> getNumbers() {
        return Collections.unmodifiableList(answers);
    }

    public Answer getEachNumber(int index) {
        return getNumbers().get(index);
    }

    private static void validateLength(List<Answer> answers) {
        if (answers.size() != GameRules.INPUT_NUMBER_LENGTH.getValue()) {
            throw new IllegalArgumentException();
        }
    }
}
