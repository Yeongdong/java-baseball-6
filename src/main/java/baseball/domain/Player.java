package baseball.domain;

public class Player {
    private final Answers answers;

    private Player(Answers answers) {
        this.answers = answers;
    }

    public static Player from(Answers answers) {
        return new Player(answers);
    }

    public Answers getInputNumbers() {
        return answers;
    }
}
