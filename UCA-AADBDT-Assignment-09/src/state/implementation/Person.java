package state.implementation;

import java.util.Objects;
import java.util.Random;

public class Person {

    String name;
    Random random;
    private State state;

    public Person(String name) {
        this.name = name;
        random = new Random();
        this.state = getState();
    }

    public State getState() {
        if (Objects.isNull(this.state)) {
            switch (random.nextInt(3)) {
                case 1 -> {
                    return new MiddleState(this);
                }
                case 2 -> {
                    return new RichState(this);
                }
                default -> {
                    return new PoorState(this);
                }
            }
        }
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public boolean getOutcome() {
        return random.nextBoolean();
    }

}
