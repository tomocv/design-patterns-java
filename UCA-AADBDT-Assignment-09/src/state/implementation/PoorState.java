package state.implementation;

public class PoorState extends State {

    public PoorState(Person person) {
        super(person);
    }

    @Override
    public void status() {
        action = Action.WORKING;
        success = person.getOutcome();
        System.out.println(person.name + " is in Poor state and is " + action + (success ? " hard!" : " poor!"));
        if (success) person.changeState(new MiddleState(person));
    }
}
