package common.models;

public enum MealName {
    CRISPY_SALAD ("Crispy Salad"),
    HAPPY_MEAL ("Happy Meal"),
    BIG_MAC_MENU ("Big Mac Menu");

    private String name;

    MealName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
