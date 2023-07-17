package state;

import state.implementation.Person;
import state.implementation.State;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Mirko");
        State state;
        for (int i = 0; i < 10; i++) {
            state = person.getState();
            state.status();
        }
    }
}
