package state.implementation;

public abstract class State {

    boolean success;
    Person person;

    enum Action {
        WORKING ("working"),
        PLAYING ("playing");

        private String status;

        Action(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return status;
        }
    }

    public Action action;

    public State(Person person) {
        this.person = person;
    }

    public abstract void status();
}
