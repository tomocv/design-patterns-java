package state.implementation;

public class MiddleState extends State {
    public MiddleState(Person person) {
        super(person);
    }

    @Override
    public void status() {
        success = person.getOutcome();
        action = success ? Action.WORKING : Action.PLAYING;
        System.out.println(person.name + " is in Middle state and is " + action +"!");
        switch (action) {
            case WORKING -> {
                person.changeState(new RichState(person));
            }
            case PLAYING -> {
                person.changeState(new PoorState(person));
            }
        }
    }
}
