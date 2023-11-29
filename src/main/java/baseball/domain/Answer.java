package baseball.domain;

import java.util.Objects;

public class Answer {
    private final int number;

    public Answer(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return number == answer.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
