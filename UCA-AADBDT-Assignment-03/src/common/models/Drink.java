package common.models;

public enum Drink {
    COKE ("Coca - Cola"),
    SPRITE ("Sprite"),
    FANTA ("Fanta"),
    ORANGE_JUICE ("Orange Juice");

    private String name;

    Drink(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
