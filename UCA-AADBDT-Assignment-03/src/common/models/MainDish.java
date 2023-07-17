package common.models;

public enum MainDish {
    CRISPY_CHICKEN_SALAD("Crispy Chicken Salad"),
    GRILLED_CHICKEN_SALAD ("Grilled Chicken Salad"),
    CHEESEBURGER("Cheeseburger"),
    HAMBURGER("Hamburger"),
    BIG_MAC("Big Mac");

    private String name;

    MainDish(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}