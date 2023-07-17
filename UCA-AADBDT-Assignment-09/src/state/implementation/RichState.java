package state.implementation;

public class RichState extends State {
    public RichState(Person person) {
        super(person);
    }

    @Override
    public void status() {
        action = Action.PLAYING;
        success = person.getOutcome();
        System.out.println(person.name + " is in RichState and is " + action + (success ? " smart!" : " recklessly!"));
        if (!success) person.changeState(new MiddleState(person));
    }
}
