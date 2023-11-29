package baseball.domain;

public enum GameRules {
    INPUT_NUMBER_LENGTH(3),
    CORRECT_ANSWER_NUMBER(3);

    private final int value;

    GameRules(int value) {
        this.value = value;
    }

    public final int getValue() {
        return value;
    }
}
